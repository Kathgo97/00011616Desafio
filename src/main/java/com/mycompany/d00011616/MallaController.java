package com.mycompany.d00011616;

import java.io.IOException;
import javafx.fxml.FXML;

public class MallaController {

    @FXML
    private void switchToNext() throws IOException {
        App.setRoot("tabla");
    }
}
