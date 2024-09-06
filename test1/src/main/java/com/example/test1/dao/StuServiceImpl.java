package com.example.test1.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test1.mapper.StuMapper;
import com.example.test1.model.Stu;

@Service
public class StuServiceImpl implements StuService{

	
	@Autowired
	StuMapper stuMapper;
	
	
	@Override
	public HashMap<String, Object> seasrchStu(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		System.out.println("list" + map);
		HashMap<String,Object> resultmap = new HashMap<>();
		List<Stu> list = stuMapper.stuList(map);
		resultmap.put("list", list);
		
		return resultmap;
	}

}
