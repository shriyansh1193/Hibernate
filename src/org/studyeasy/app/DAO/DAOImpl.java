package org.studyeasy.app.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.studyeasy.app.model.Users;

@Repository
public class DAOImpl implements UsersDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Users> getUsers() {
		Session session = sessionFactory.getCurrentSession();

		List<Users> lstUsers = session.createQuery("from users", Users.class).getResultList();
		return lstUsers;
	}

}
