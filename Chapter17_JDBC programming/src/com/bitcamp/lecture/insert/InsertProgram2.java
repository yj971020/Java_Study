package com.bitcamp.lecture.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bitcamp.lecture.comm.Member;

public class InsertProgram2 {
	
	static final String URL = "jdbc:mysql://221.148.138.87:3306/lecture";
	static final String  ID = "bitcamp";
	static final String  PW = "1234";

	public static void main(String[] args){
		
		Connection con = null;
        PreparedStatement preStmt = null;
     
        // UI 쪽 인터페이스를 통해서 CRUD 관련 데이터를 전달 받는다.
        Member  member = new Member();
        member.setId("★★★★★");
        member.setPwd("*****");
        member.setName("테스터0915");
        member.setGender("M");
        
        
        try {
        	/* 드라이버 로딩
        	 */
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	/* DB 연결
        	 */
        	con = DriverManager.getConnection(URL, ID, PW);
        	System.out.println("Successfully Connection!");
        	/* 쿼리 실행
        	 */
        	String sql = "INSERT INTO member(ID,PWD,NAME,GENDER)VALUES(?,?,?,?)";
        	preStmt = con.prepareStatement(sql);
        	preStmt.setString(1, member.getId());
        	preStmt.setString(2, member.getPwd());
        	preStmt.setString(3, member.getName());
        	preStmt.setString(4, member.getGender());
        	
        	/* PreparedStatement 객체 사용 시
        	 * stmt.executeQuery(sql)->(); <--주의!!!
        	 */
        	int cnt = preStmt.executeUpdate();
        	
        	System.out.println("Query OK, "+ cnt + " row affected.");

        } catch(SQLException | ClassNotFoundException e) {
        	e.printStackTrace();
        } finally {
        	try {
        		if(con != null && !con.isClosed()) {
        			preStmt.close();
        			con.close();
        			System.out.println("리소스 해제 완료");
        		}
        	} catch(SQLException ex) {
        		ex.printStackTrace();
        	}
        }
	}

}
