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
		// 1.������������
		Class.forName("com.mysql.jdbc.Driver");
		// 2.������ݿ�����
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		if (conn != null)
			System.out.println("connect");
		// 3.ͨ�����ݿ�����Ӳ������ݿ⣬ʵ����ɾ�Ĳ飨ʹ��Statement�ࣩ
		Statement st = conn.createStatement();
		// �ر���Դ
		st.close();
		conn.close();
	}

}
