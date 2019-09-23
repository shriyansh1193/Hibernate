package org.studyeasy.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.studyeasy.app.DAO.DAOImpl;
import org.studyeasy.app.model.Users;

@Controller
public class App {

	@Autowired
	private DAOImpl users;

	@RequestMapping("/")
	public String getRequest(Model model) {
		List<Users> lst = users.getUsers();
		model.addAttribute("users", lst);
		return "index";
	}
}
