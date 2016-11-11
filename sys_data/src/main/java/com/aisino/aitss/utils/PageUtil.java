package com.aisino.aitss.utils;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public class PageUtil {
	
	private static final int PAGE_NUM = 1;//默认页数
	private static final int PAGE_SIZE = 10;//默认行数
	
	public static void beforeQuery(HttpServletRequest request, String orderBy, boolean asc) {
		String pageNum = request.getParameter("pageNum");
		String pageSize = request.getParameter("pageSize");
		
		int num = PAGE_NUM;
		int size = PAGE_SIZE;
		
		if (pageNum != null && !"".equals(pageNum)) {
			num = Integer.parseInt(pageNum);
		}
		
		if (pageSize != null && !"".equals(pageSize)) {
			size = Integer.parseInt(pageSize);
		}
		
		String sortString = orderBy + " ";
		if (asc)  {
			sortString += "asc";
		} else {
			sortString += "desc";
		}
		
//		Order.formString(sortString);
		PageHelper.startPage(num, size, sortString);
	}
	
	public static <T> PageInfo<T> afterQuery(List<T> ts) {
		return new PageInfo<T>(ts);
	}
	
	public static <T> void afterQuery(List<T> ts, Model model) {
		PageInfo<T> p = new PageInfo<T>(ts);
		model.addAttribute("pageList", p);
	}
	
	public static void beforeQuery(Integer num, Integer size, String orderBy, boolean asc) {
		if (num == null || num < 1) {
			num = PAGE_NUM;
		}
		
		if (size == null || size < 1) {
			size = PAGE_SIZE;
		}
		
		String sortString = orderBy + " ";
		if (asc)  {
			sortString += "asc";
		} else {
			sortString += "desc";
		}
		
//		Order.formString(sortString);
		PageHelper.startPage(num, size, sortString);
	}
	
	public static void beforeQuery(Integer num, Integer size) {
		if (num == null || num < 1) {
			num = PAGE_NUM;
		}
		
		if (size == null || size < 1) {
			size = PAGE_SIZE;
		}
		
		PageHelper.startPage(num, size);
	}
}
