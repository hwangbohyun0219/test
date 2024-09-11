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

import com.example.test1.dao.RealService;
import com.example.test1.dao.TestService;
import com.example.test1.dao.TestServiceImpl;
import com.example.test1.model.Test;
import com.google.gson.Gson;

@Controller
public class RealController {
	
	@Autowired
	RealService realService;
	
	@RequestMapping("/real.do") 
    public String main(Model model) throws Exception{

        return "/real-list";
    }
	
	@RequestMapping(value = "/real.dox", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String realSearch(Model model, @RequestParam HashMap<String, Object> map) throws Exception {
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		resultMap = realService.realSearch(map);
		return new Gson().toJson(resultMap);
	}
	
	@RequestMapping(value = "/remove2.dox", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String removereal(Model model, @RequestParam HashMap<String, Object> map) throws Exception {
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		resultMap = realService.removeReal(map);
		return new Gson().toJson(resultMap);
	}
	
	
}


