package com.example.freemoneynoscam.services;

import com.example.freemoneynoscam.repository.WriteToDatabase;
import org.springframework.web.context.request.WebRequest;

public class ValidateEmailService {
    WriteToDatabase writeToDatabase = new WriteToDatabase();

    public boolean isEmailValid(String email){
        //TODO implement logic such that we verify an e-mail is valid
        return true;
    }

    public void create(WebRequest req){
        String email = req.getParameter("email");
        writeToDatabase.create(email);
    }
}
