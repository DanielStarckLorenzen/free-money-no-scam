package com.example.freemoneynoscam.repository;

import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WriteToDatabase {

    private Connection conn = DatabaseConnectionManager.getConnection();

    public void create(String email){
        try {
            PreparedStatement pst = conn.prepareStatement("INSERT INTO stupidPeople (email) VALUES (?)");
            pst.setString(1, email);
            pst.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
