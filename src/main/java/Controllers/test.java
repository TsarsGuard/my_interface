package Controllers;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import Service.InterfaceService;

public class test {

	@Test
	public void test() throws Exception {
		String URL = "jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&amp&useSSL=false&characterEncoding=utf-8";
		String USER = "root";
		String PASSWORD = "admin123";
		// 1.加载驱动程序
		Class.forName("com.mysql.jdbc.Driver");
		// 2.获得数据库链接
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		if (conn != null)
			System.out.println("connect");
		// 3.通过数据库的连接操作数据库，实现增删改查（使用Statement类）
		Statement st = conn.createStatement();
		// 关闭资源
		st.close();
		conn.close();
	}

}
