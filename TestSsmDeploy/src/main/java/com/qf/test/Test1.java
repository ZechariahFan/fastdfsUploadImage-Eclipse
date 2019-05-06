package com.qf.test;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
		
		Map<String,Object> map =new HashMap<String,Object>();
		Map<String,Object> map1 =new HashMap<String,Object>();
		map.put("code", 0);
		map.put("msg", 1);
		map1.put("url", "http://www.baidu.com");
		map.put("data", map1);
		System.out.println(map);
	}
}
