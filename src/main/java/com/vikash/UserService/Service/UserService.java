package com.vikash.UserService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vikash.UserService.Entity.User;
import com.vikash.UserService.Repository.UserRepository;
import com.vikash.UserService.VO.DepartmentVO;
import com.vikash.UserService.VO.ResponseTemplate;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		
		return userRepository.save(user);
	}

	public ResponseTemplate getUserWithDepartment(Long userId) {
		ResponseTemplate VO = new ResponseTemplate();
		User user = userRepository.findByUserId(userId);
		DepartmentVO departmentVO = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+ user.getDepartmentId(), 
				DepartmentVO.class);
		
		VO.setUser(user);
		VO.setDepartment(departmentVO);
		return VO;
	}

}
