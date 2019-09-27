package org.studyeasy.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.studyeasy.app.model.Users;
import org.studyeasy.app.service.AppService;

@Controller
public class App {

	@Autowired
	private AppService service;

	@RequestMapping("/")
	public String getRequest(Model model) {
		List<Users> lst = service.lstOfUsers();
		model.addAttribute("users", lst);
		return "index";
	}
}
