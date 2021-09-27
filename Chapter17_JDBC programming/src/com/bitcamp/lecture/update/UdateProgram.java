package com.bitcamp.lecture.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bitcamp.lecture.comm.Notice;

public class UdateProgram {
	
	static final String URL = "jdbc:mysql://221.148.138.87:3306/lecture";
	static final String  ID = "bitcamp";
	static final String  PW = "1234";

	public static void main(String[] args){
		
		Connection con = null;
        PreparedStatement preStmt = null;
     
        // UI �� �������̽��� ���ؼ� CRUD ���� �����͸� ���� �޴´�.
        Notice notice = new Notice();
        notice.setId(1);
        notice.setTitle("[���׼�����]�ȳ�");
        notice.setWriterId("�ڼ���");
        
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
        	String sql = "UPDATE notice SET TITLE = ?, WRITER_ID = ? WHERE ID = ?";
        	preStmt = con.prepareStatement(sql);
        	preStmt.setString(1, notice.getTitle());
        	preStmt.setString(2, notice.getWriterId());
        	preStmt.setInt   (3, notice.getId());
        	
        	
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
