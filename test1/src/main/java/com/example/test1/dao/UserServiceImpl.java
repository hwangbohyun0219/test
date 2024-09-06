package com.example.test1.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test1.mapper.UserMapper;
import com.example.test1.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper userMapper;

	@Override
	public HashMap<String, Object> searchlist(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		System.out.println("map : " + map);
		HashMap<String, Object> resultMap = new HashMap<>(); 
		List<User> user = userMapper.userList(map); 
		resultMap.put("user", user);
		return resultMap;
	}
}
