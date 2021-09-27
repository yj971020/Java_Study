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
     
        // UI �� �������̽��� ���ؼ� CRUD ���� �����͸� ���� �޴´�.
        Member  member = new Member();
        member.setId("�ڡڡڡڡ�");
        member.setPwd("*****");
        member.setName("�׽���0915");
        member.setGender("M");
        
        
        try {
        	/* ����̹� �ε�
        	 */
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	/* DB ����
        	 */
        	con = DriverManager.getConnection(URL, ID, PW);
        	System.out.println("Successfully Connection!");
        	/* ���� ����
        	 */
        	String sql = "INSERT INTO member(ID,PWD,NAME,GENDER)VALUES(?,?,?,?)";
        	preStmt = con.prepareStatement(sql);
        	preStmt.setString(1, member.getId());
        	preStmt.setString(2, member.getPwd());
        	preStmt.setString(3, member.getName());
        	preStmt.setString(4, member.getGender());
        	
        	/* PreparedStatement ��ü ��� ��
        	 * stmt.executeQuery(sql)->(); <--����!!!
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
        			System.out.println("���ҽ� ���� �Ϸ�");
        		}
        	} catch(SQLException ex) {
        		ex.printStackTrace();
        	}
        }
	}

}
