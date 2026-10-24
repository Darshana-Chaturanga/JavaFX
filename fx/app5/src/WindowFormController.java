import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class WindowFormController {
    public void openWindowBOnAction(ActionEvent actionEvent) throws Exception{
        URL url = getClass().getResource("WindowBForm.fxml");
        Parent load = FXMLLoader.load(url);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
