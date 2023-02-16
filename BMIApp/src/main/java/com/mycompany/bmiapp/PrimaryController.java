package com.mycompany.bmiapp;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int i = 100; 
        if(i > 100)
        App.setRoot("secondary");
    }
}
