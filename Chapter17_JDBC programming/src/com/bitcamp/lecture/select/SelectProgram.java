package com.bitcamp.lecture.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectProgram {
	
	static final String URL = "jdbc:mysql://221.148.138.87:3306/lecture";
	static final String  ID = "bitcamp";
	static final String  PW = "1234";

	public static void main(String[] args){
		
		Connection con = null;
        Statement stmt = null;
        ResultSet   rs = null;
        
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
        	stmt = con.createStatement();
        	
        	String sql = "SELECT * FROM idol_group";
        	rs = stmt.executeQuery(sql);
        	
        	System.out.println("-----------------------------------------------------");
        	System.out.println(" COMPANY             NAME               ");
        	System.out.println("-----------------------------------------------------");
        	
        	while(rs.next()) {
        		System.out.print(rs.getString("COMPANY") + "\t\t" 
        					+ rs.getString("GROUP_NAME") + "\n");
        	}
        	
        	
        	
        } catch(SQLException | ClassNotFoundException e) {
        	e.printStackTrace();
        } finally {
        	try {
        		if(con != null && !con.isClosed()) {
        			rs.close();
        			stmt.close();
        			con.close();
        			System.out.println("���ҽ� ���� �Ϸ�");
        		}
        	} catch(SQLException ex) {
        		ex.printStackTrace();
        	}
        }
	}

}
