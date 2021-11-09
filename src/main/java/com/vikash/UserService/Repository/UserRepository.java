package com.vikash.UserService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vikash.UserService.Entity.User;
import com.vikash.UserService.VO.ResponseTemplate;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserId(Long Id);

}
