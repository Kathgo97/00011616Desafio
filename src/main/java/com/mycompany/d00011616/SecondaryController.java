package com.mycompany.d00011616;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToNext() throws IOException {
        App.setRoot("dominio");
    }
}