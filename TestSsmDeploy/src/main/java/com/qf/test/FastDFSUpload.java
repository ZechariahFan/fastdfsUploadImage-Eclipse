package com.qf.test;

import com.qf.utils.FastDFSClient;

public class FastDFSUpload {

	public static void main(String[] args) throws Exception {
		FastDFSClient fdfs = new FastDFSClient("server.conf");
		String upload_file = fdfs.upload_file("1.png", "png");
		System.out.println(upload_file);
	}
}
