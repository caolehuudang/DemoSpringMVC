package com.dxc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dxc.model.Employee;
import com.dxc.service.LoginService;

@Controller
public class EmployeeController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "login")
	public String shoeLoginPage(Model model) {
		return "login";
	}
	
	@RequestMapping(value = "logout")
	public String showLogout(Model model) {
		model.addAttribute("err", "username invalid");
		return "logout";
	}
	
	@RequestMapping(value = "validation",method = RequestMethod.POST)
	public String login(@ModelAttribute("employeeLogin") Employee employee, Model model) {
		if(loginService.login(employee)) {
			model.addAttribute("admin", employee);
			return "admin";
		}else {
			model.addAttribute("err", "username invalid");
			return "redirect:logout";
		}
	}
	
	@RequestMapping(value = "register")
	public String showRegisterPage() {
		return "register";
	}
	
	@RequestMapping(value = "regiterAction", method = RequestMethod.POST)
	public String Register(@ModelAttribute("employeeRegister") Employee employee, Model model ) {
		loginService.register(employee);
		return "redirect:login";
	}
}
