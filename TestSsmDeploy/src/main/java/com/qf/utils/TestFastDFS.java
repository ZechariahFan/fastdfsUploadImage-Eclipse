package com.qf.utils;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;

public class TestFastDFS {

	@Test
	public void test1() throws FileNotFoundException, IOException, MyException
	{
		ClientGlobal.init("server.conf");
		TrackerClient trackerClient = new TrackerClient();
		TrackerServer trackerServer = trackerClient.getConnection();
		StorageServer server =null;
		StorageClient storageClient = new StorageClient();
		String[] strings = storageClient.upload_file("66.PNG","PNG", null);
		for (String string : strings) {
			System.out.println(string);
		}
	}
}
