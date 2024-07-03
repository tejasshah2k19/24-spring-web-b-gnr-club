package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.StudentBean;

@Controller
public class StudentController {

	@Autowired
	JdbcTemplate stmt;

	@GetMapping("newstudent")
	public String newStudent() {

		return "NewStudent";
	}

	@PostMapping("/savestudent")
	public String saveStudent(StudentBean studentBean) {

		// validation

		// db save
		stmt.update("insert into students (firstName,email,city) values (?,?,?)", studentBean.getFirstName(),
				studentBean.getEmail(), studentBean.getCity());

		return "Welcome";
	}

	@GetMapping("/liststudents")
	public String listStudents(Model model) {
		// send students -> List -> jsp
		// select * from students
		// 3 record -> row
		// row->bean
		List<StudentBean> students = stmt.query("select * from students",
				new BeanPropertyRowMapper<>(StudentBean.class));
		
		model.addAttribute("students",students);
		return "ListStudents";
	}

	//validation
	//list 
	
}
