import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class MainFormController {

    public TextField txtName;
    public TextField txtAge;

    public void printDataOnAction(ActionEvent actionEvent) {

        String name = txtName.getText();
        String age = txtAge.getText();

        System.out.println("Name : " + name + ", Age : " + age);
    }


    public void printNameOnAction(KeyEvent keyEvent) {
        System.out.println(txtName.getText());
    }
}