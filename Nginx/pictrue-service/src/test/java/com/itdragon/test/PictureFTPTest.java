package com.itdragon.test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

public class PictureFTPTest {

	// 测试 ftp 上传图片功能
	@Test
	public void testFtpClient() throws Exception {
		// 1. 创建一个FtpClient对象
		FTPClient ftpClient = new FTPClient();
		// 2. 创建 ftp 连接
		ftpClient.connect("192.168.0.148", 21);
		// 3. 登录 ftp 服务器
		ftpClient.login("1650085822", "1650085822");
		// 4. 读取本地文件
		FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\1650085822\\Desktop\\project\\拓扑图\\Bean初始化.jpg"));
		// 5. 设置上传的路径
		ftpClient.changeWorkingDirectory("D:\\WorkSpace\\ftpserver");
		// 6. 修改上传文件的格式为二进制
		ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
		// 7. 服务器存储文件，第一个参数是存储在服务器的文件名，第二个参数是文件流
		ftpClient.storeFile("hello.png", inputStream);
		// 8. 关闭连接
		ftpClient.logout();
		
	}
	
}
