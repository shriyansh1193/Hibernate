package org.studyeasy.app.DAO;

import java.util.List;

import org.springframework.stereotype.Component;
import org.studyeasy.app.model.Users;

@Component
public interface UsersDAO {
	List<Users> getUsers();
}
