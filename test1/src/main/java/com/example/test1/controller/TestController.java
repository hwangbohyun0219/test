package com.example.test1.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.test1.dao.TestService;
import com.example.test1.dao.TestServiceImpl;
import com.example.test1.model.Test;
import com.google.gson.Gson;

@Controller
public class TestController {
	
	@Autowired
	TestService testService;
	
	@RequestMapping("/test.do") 
    public String main(Model model) throws Exception{

        return "/test-list";
    }
	
	@RequestMapping(value = "/test.dox", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String searchList(Model model, @RequestParam HashMap<String, Object> map) throws Exception {
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		resultMap = testService.searchList(map);
		
		try {
			resultMap.put("message", "검색성공");
		}catch(Exception e) {
			resultMap.put("message", "검색실패");
		}
		
		return new Gson().toJson(resultMap);
	}
	
	@RequestMapping(value = "/test1.dox", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String searchBoard(Model model, @RequestParam HashMap<String, Object> map) throws Exception {
		HashMap<String,Object> resultMap = new HashMap<String,Object>();
		
		resultMap = testService.searchBoard(map);
		System.out.println("res" + resultMap); 
		
		
		
		return new Gson().toJson(resultMap);
	}
	
	/*
	 * @RequestMapping(value = "/test.dox", method = RequestMethod.POST, produces =
	 * "application/json;charset=UTF-8")
	 * 
	 * @ResponseBody public String removeList(Model model, @RequestParam
	 * HashMap<String, Object> map) throws Exception { HashMap<String, Object>
	 * resultMap = new HashMap<String, Object>(); try { resultMap.put("message",
	 * "삭제하시겠습니까?"); }catch(Exception e) { resultMap.put("message", "삭제실패"); }
	 * 
	 * return new Gson().toJson(resultMap); }
	 * 
	 * @RequestMapping(value = "/test.dox", method = RequestMethod.POST, produces =
	 * "application/json;charset=UTF-8")
	 * 
	 * @ResponseBody public String addList(Model model, @RequestParam
	 * HashMap<String, Object> map) throws Exception { HashMap<String, Object>
	 * resultMap = new HashMap<String, Object>(); Test test = new Test();
	 * List<Integer> list = new ArrayList(); list.add(3); list.add(6);
	 * 
	 * try { resultMap.put("message", "추가성공"); resultMap.put("hello", "안녕");
	 * resultMap.put("test", test); resultMap.put("test", test); }catch(Exception e)
	 * { resultMap.put("message", "추가실패"); }
	 * 
	 * return new Gson().toJson(resultMap); }
	 */
}


