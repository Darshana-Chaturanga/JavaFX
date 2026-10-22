import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainFormController {

    @FXML
    private ComboBox<String> cmbLangs;


    @FXML
    private RadioButton rdBtnMale;
    @FXML
    private RadioButton rdBtnFemale;

    @FXML
    private CheckBox chbxJava;
    @FXML
    private CheckBox chbxKotlin;
    @FXML
    private CheckBox chbxRuby;


    List<String> languages = new ArrayList<>(
            Arrays.asList("Java","PHP","Python","Kotlin")
    );

    public void initialize(){
        // initial val
        cmbLangs.setValue("Languages");

        for (String s : languages){
            cmbLangs.getItems().add(s);
        }
    }

    public void printGenderOnAction(ActionEvent actionEvent) {
        if(rdBtnMale.isSelected()){
            System.out.println("Male");
        } else if (rdBtnFemale.isSelected()) {
            System.out.println("Female");
        }else {
            System.out.println("Nothing selected");
        }
    }

    public void printSelctedLan(ActionEvent actionEvent) {
        System.out.println("Selected Languages : ");
        if(chbxJava.isSelected())
            System.out.println("\t\t\t\t\tJava");
        if(chbxKotlin.isSelected())
            System.out.println("\t\t\t\t\tKotlin");
        if(chbxRuby.isSelected())
            System.out.println("\t\t\t\t\tRuby");
    }
}
