package com.qf.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

import com.qf.utils.FtpUtil;

public class testFtpUtil {

	@Test
	public void tests() throws FileNotFoundException
	{
		 FileInputStream fileInputStream = new FileInputStream(new File("D:\\百度云\\资料文档\\课件\\fastdfs\\mdpic\\c.jpg"));
	        FtpUtil.uploadFile("192.168.56.200",21,"zecharianfan","fzqxsdmm","/home/zecharianfan/pic","/2019/4/29","hello2.jpg",fileInputStream);
	}
}
