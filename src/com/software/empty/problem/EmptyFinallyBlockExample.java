package com.software.empty.problem;

import java.sql.*;

public class EmptyFinallyBlockExample {

    public static void main(String args[]){

        // 접속 정보
        String connectionURL = "jdbc:postgresql://localhost:5432/movies;user=java;password=samples";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 드라이버 로드
            Class.forName("org.postgresql.Driver");

            // 연결 생성
            con = DriverManager.getConnection(connectionURL);

            // 쿼리 실행 클래스 생성
            stmt = con.createStatement();

            // 쿼리 실행 후 결과 반환 
            rs = stmt.executeQuery("select moviename, releasedate form movies");

            // 쿼리 결과 처리
            while (rs.next()) {
                System.out.println("Name= " + rs.getString("moviename")+ " Date= " + rs.getString("releasedate"));
            }
            
            //만약 이 코드에 도달하기 전에 오류가 발생한다면, 디비 접속은 정상적으로 종료될까?
            if (rs!=null)rs.close();
            if(stmt!=null) stmt.close();
            if(con!=null) con.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
        }
    }
}
