package com.example.test1.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.test1.model.Stu;
import com.example.test1.model.User;

@Mapper
public interface UserMapper {
	List<User> userList(HashMap<String, Object> map);
}
