package com.example.test1.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.test1.model.Real;
import com.example.test1.model.Test;

@Mapper
public interface RealMapper {
	
	List<Real> RealList(HashMap<String, Object> map);
	
}
