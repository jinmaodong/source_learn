package com.mdjin.readinglist;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReadingListApplicationTests {

	@Resource
	DataSource ds;
	
	@Test
	void contextLoads() {
		System.out.println(ds.getClass());
		try {
			Connection conn = ds.getConnection();
			System.out.println(conn.getMetaData().getURL());	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
