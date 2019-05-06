package com.qf.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.qf.test.FastDFSUpload;
import com.qf.utils.FastDFSClient;

@Controller
public class UploadAction {

	@ResponseBody
	@RequestMapping(value="/upload",method=RequestMethod.POST)
	public Map<String,Object> uploadImage(MultipartFile file)
	{
		String path ="http://192.168.56.200/";
		Map<String,Object> map = new HashMap<String,Object>();
		Map<String,Object> map1 =new HashMap<String,Object>();
		try {
			FastDFSClient fastDFSClient = new FastDFSClient("classpath:server.conf");
			path +=fastDFSClient.upload_file(file.getBytes(), "jpg", null);
			map.put("code", 0);
			map.put("msg", "");
			map1.put("src", path);
			map.put("data", map1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.put("code", 1);
			map.put("msg", "");
			map1.put("src", path);
			map.put("data", map1);
		}
		return map;
	}
	
	@RequestMapping("/login")
	public void login()
	{
		System.out.println(111);
	}
}
