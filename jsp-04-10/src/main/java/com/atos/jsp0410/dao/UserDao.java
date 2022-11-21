package com.atos.jsp0410.dao;

import com.atos.jsp0410.factory.ConnectionFactory;
import com.atos.jsp0410.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {

public boolean validaLogin(User user){

    boolean validacao = false;

    String sql = "SELECT * FROM b7hlhdcg9mkxk3lyokgh.USERS WHERE NAME_USER = ? and PASSWOR_USER = ?";

    Connection connection = null;
    PreparedStatement ps = null;

    try{
        connection = ConnectionFactory.connectMySql();
        ps = connection.prepareStatement(sql);
        ps.setString(1,user.getUsername());
        ps.setString(2,user.getPassword());

        ResultSet resultSet = ps.executeQuery();

        validacao = resultSet.next();

    }catch (Exception e){
        e.printStackTrace();
        System.out.println("Problema no validaLogin");
    }

    return validacao;
}
}
