package com.mycompany.d00011616;

import java.io.IOException;
import javafx.fxml.FXML;

public class W1Controller {

    @FXML
    private void switchToNext() throws IOException {
        App.setRoot("w2");
    }
}
