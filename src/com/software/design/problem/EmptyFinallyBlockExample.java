package com.software.design.problem;

import java.sql.*;

public class EmptyFinallyBlockExample {

    public static void main(String args[]) throws SQLException{

        // ���� ����
        String connectionURL = "jdbc:postgresql://localhost:5432/movies;user=java;password=samples";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // ����̹� �ε�
            Class.forName("org.postgresql.Driver");

            // ���� ����
            con = DriverManager.getConnection(connectionURL);

            // ���� ���� Ŭ���� ����
            stmt = con.createStatement();

            // ���� ���� �� ��� ��ȯ 
            rs = stmt.executeQuery("select moviename, releasedate form movies");

            // ���� ��� ó��
            while (rs.next()) {
                System.out.println("Name= " + rs.getString("moviename")+ " Date= " + rs.getString("releasedate"));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        	//fially���� �̿뿩 ��� ��Ȳ������ �ڿ��� ��ȯ�ϵ��� �Ѵ�.
        	if (rs!=null)rs.close();
            if(stmt!=null) stmt.close();
            if(con!=null) con.close();
        }
    }
}
