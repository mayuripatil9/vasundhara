package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.dao.StudentDAO;
import com.student.model.Student;

@Controller
public class StudentController {

	@Autowired
	private StudentDAO studentDao;

	@GetMapping("/")
	public String index(Model model) {
		List<Student> students = studentDao.list();
		model.addAttribute("students", students);
		return "index";
	}

	@GetMapping("/addStudent")
	public String add(Model model) {
		return "add-student";
	}

	@PostMapping("/save")
	public String save(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("rollNo") String rollNo) {
		Student student = new Student(name, email, rollNo);
		studentDao.save(student);
		return "redirect:/success";
	}

	@GetMapping("/success")
	public String success() {
		return "success";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, Model model) {
		Student student = studentDao.get(id);
		model.addAttribute("student", student);
		return "edit-student";
	}

	@PostMapping("/update")
	public String update(@ModelAttribute("student") Student student) {
		studentDao.update(student);
		return "redirect:/";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		studentDao.delete(id);
		return "redirect:/";
	}

	
	

}
