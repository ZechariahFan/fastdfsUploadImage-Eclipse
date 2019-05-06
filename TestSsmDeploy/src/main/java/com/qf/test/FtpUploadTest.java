package com.qf.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

public class FtpUploadTest {

	
	
	@Test
	public void testFtpUpload() throws SocketException, IOException
	{
		FTPClient ftpClient =new FTPClient();
		ftpClient.connect("192.168.56.200",21);
		ftpClient.login("zecharianfan", "fzqxsdmm");
		FileInputStream fiStream = new FileInputStream("C:\\Users\\501581\\Desktop\\文件\\mm.jpg");
		//配置上传参数
		ftpClient.changeWorkingDirectory("/home/zecharianfan/pic");
		ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
		ftpClient.storeFile("mm.jpg", fiStream);
		fiStream.close();
		ftpClient.logout();
	}
	
}
