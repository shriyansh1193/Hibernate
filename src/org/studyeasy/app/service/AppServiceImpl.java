package org.studyeasy.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studyeasy.app.DAO.DAOImpl;
import org.studyeasy.app.model.Users;

@Service
public class AppServiceImpl implements AppService {

	@Autowired
	private DAOImpl dao;

	@Override
	@Transactional
	public List<Users> lstOfUsers() {
		return dao.getUsers();
	}

}
