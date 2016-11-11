package com.aitss.rest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class test {
	@RequestMapping(value="/test1", method = {RequestMethod.GET, RequestMethod.POST})
	public void test1(HttpServletRequest request) {
		System.out.println("测试");
	}
}
