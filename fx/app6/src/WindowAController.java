import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;

public class WindowAController {
    public AnchorPane contextA;

    public void loadNextWindowOnAction(ActionEvent actionEvent) throws Exception{

       Parent load = FXMLLoader.load(getClass().getResource("WindowB.fxml"));
       Stage stage = (Stage) contextA.getScene().getWindow();
       stage.setScene(new Scene(load));

    }


}
