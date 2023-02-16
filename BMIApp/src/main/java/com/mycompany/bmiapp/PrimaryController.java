package com.mycompany.bmiapp;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int z = 10; 
        if(z < 10 && z != 2)
        App.setRoot("secondary");
    }
}
