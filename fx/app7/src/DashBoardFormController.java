import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardFormController {
   public AnchorPane contextWindow;

    public void openWindowAOnAction(ActionEvent actionEvent) throws IOException {
        setUi("WindowAForm");
    }

    public void openWindowBOnAction(ActionEvent actionEvent) throws IOException {
        setUi("WindowBForm");
    }

    private void setUi(String location) throws IOException {
        contextWindow.getChildren().clear();
        contextWindow.getChildren().add(
                FXMLLoader.load(getClass().getResource(location+".fxml"))
        );
    }
}
