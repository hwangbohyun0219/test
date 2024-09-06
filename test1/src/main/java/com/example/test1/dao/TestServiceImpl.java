package com.example.test1.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test1.mapper.TestMapper;
import com.example.test1.model.Test;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	TestMapper testMapper;

	@Override
	public HashMap<String, Object> searchList(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		HashMap<String, Object> resultMap = new HashMap<>();
		System.out.println(map);
		
		List<Test> test2 = testMapper.testList(map);
			
		resultMap.put("test", test2);
			
		return resultMap;
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

	@Override
	public HashMap<String, Object> searchBoard(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		HashMap<String, Object> resultMap = new HashMap<String,Object>();
		
		List<Test> test = testMapper.boardList(map);
		resultMap.put("test", test);
		System.out.println("test" + test);
		
		return resultMap;
	}


	
	

}
