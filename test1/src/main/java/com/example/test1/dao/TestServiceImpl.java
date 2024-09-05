package com.example.test1.dao;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test1.mapper.TestMapper;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	TestMapper testMapper;

	@Override
	public HashMap<String, Object> searchList(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		HashMap<String, Object> searchList = new HashMap<>();
			testMapper.testList(map);
			System.out.println(map);
			
		return map;
	}

	@Override
	public HashMap<String, Object> removeList(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		testMapper.removeList(map);
		return null;
	}

	@Override
	public HashMap<String, Object> addList(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		testMapper.addList(map);
		return null;
	}
	
	

}
