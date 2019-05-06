package com.qf.utils;

import org.csource.common.NameValuePair;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient1;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

public class FastDFSClient {
	
	private TrackerClient trackerClient;
	private TrackerServer trackerServer;
	private StorageClient1 storageClient;
	private StorageServer storageServer;
	
	public FastDFSClient(String conf) throws Exception {
		if (conf.startsWith("classpath")) {
			conf=conf.replace("classpath:", getClass().getResource("/").getPath());
		}
		ClientGlobal.init(conf);//����·��
		trackerClient=new TrackerClient();
		trackerServer=trackerClient.getConnection();
		storageClient=new StorageClient1(trackerServer, storageServer);
	}
	/**
		�ϴ��ļ�,�������ļ���·��,��׺����Ԫ����
	*/
	public String  upload_file(String fileName,String ext_name,NameValuePair[] pairs) throws Exception {
		return storageClient.upload_file1(fileName, ext_name, pairs);
	}
	
	public String upload_file(String fileName)  throws Exception{
		return upload_file(fileName, null, null);
	}
	
	
	public String upload_file(String fileName,String ext_name)  throws Exception{
		return upload_file(fileName, ext_name, null);
	}
	
	public String upload_file(String fileName,NameValuePair[] pairs)  throws Exception{
		return upload_file(fileName, null, pairs);
	}
	/**
		�ϴ�����������,��Ҫ���ļ���ת��Ϊ������
	*/
	public String upload_file(byte[]source,String ext_name,NameValuePair[] pairs) throws Exception{
		return storageClient.upload_file1(source, ext_name, pairs);
	}
}
