package com.example.test1.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test1.mapper.RealMapper;
import com.example.test1.mapper.TestMapper;
import com.example.test1.model.Real;
import com.example.test1.model.Test;

@Service
public class RealServiceImpl implements RealService{

	@Autowired
	RealMapper realMapper;

	@Override
	public HashMap<String, Object> realSearch(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		
		List<Real> list = realMapper.RealList(map);
		resultMap.put("list", list);
		return resultMap;
	}

	@Override
	public HashMap<String, Object> removeReal(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		try {
			System.out.println("map : " + map);
			realMapper.deleteList(map);
			resultMap.put("result", true);
			resultMap.put("message", "삭제에 성공했습니다.");
		} catch(Exception e) {
			resultMap.put("result", false);
			resultMap.put("message", "예기치않은 오류로 삭제에 실패했습니다.");
		}
		return resultMap;
	}

	

	
}
