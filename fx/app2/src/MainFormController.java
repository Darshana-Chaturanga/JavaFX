import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MainFormController {

    @FXML
    TextField txtInput;
    @FXML
    TextField txtAnswer;


    // This runs AFTER all FXML components have been injected.
    public void initialize(){
        txtInput.textProperty().addListener((observable, oldValue, newValue) -> {
//            System.out.println("old : " + oldValue);
//            System.out.println("new : " + newValue);
            txtAnswer.setText(newValue);
        });
    }
}
