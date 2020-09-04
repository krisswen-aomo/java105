package com.bianyi;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class TestOracle {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String username = "java103";
        String password = "123";
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        Connection connection = DriverManager.getConnection(url, username, password);
        CallableStatement statement = connection.prepareCall("{call update_emp_sal(?,?)}");
        statement.setInt(1,7788);  //设置输入参数
        statement.setInt(2,500);
        statement.execute();
    }
}
