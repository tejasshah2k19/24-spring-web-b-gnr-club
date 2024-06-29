package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.AddBean;

@Controller
public class CalcController {

	@GetMapping("/add")
	public String addition() {
		return "Add";
	}

	@PostMapping("/addition")
	public String additionProcess(AddBean addBean, Model model) {
		System.out.println(addBean.getN1());
		System.out.println(addBean.getN2());

		boolean isError = false;

		if (addBean.getN1() == null) {
			model.addAttribute("n1Error", "Please Enter Number1");
			isError = true;
		}
		if (addBean.getN2() == null) {
			model.addAttribute("n2Error", "Please Enter Number2");
			isError = true;
		}

		if (isError == true) {
			return "Add";
		} else {
			Integer ans = addBean.getN1() + addBean.getN2();
			model.addAttribute("ans",ans);
			return "AddResult";
		}
	}

}
