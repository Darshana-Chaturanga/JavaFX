import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.Optional;

public class MainFormController {

    public TableView<StudentTm> tblStudent;
    public TableColumn<StudentTm,String> colNic;
    public TableColumn<StudentTm,String> colName;
    public TableColumn<StudentTm,String> colAge;
    public TableColumn<StudentTm,Button> colOption;

    public void initialize(){
        colNic.setCellValueFactory(new PropertyValueFactory<>("nic"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAge.setCellValueFactory(new PropertyValueFactory<>("Age"));
        colOption.setCellValueFactory(new PropertyValueFactory<>("btn"));

        loadTable();
    }

    private void loadTable(){
        ObservableList<StudentTm> studentObList = FXCollections.observableArrayList();
        for(Student st : Database.studentDb){
            Button btn = new Button("Delete");
            studentObList.add(new StudentTm(
                    st.getNic(),
                    st.getName(),
                    st.getAge(),
                    btn
            ));
            btn.setOnAction(event -> {
                Alert alert = new Alert
                        (Alert.AlertType.CONFIRMATION,"Aru you sure", ButtonType.YES,ButtonType.NO);
                Optional<ButtonType> buttonType = alert.showAndWait();
                if(buttonType.get()==ButtonType.YES){
                    Database.studentDb.remove(st);
                    System.out.println(st.getName());
                    loadTable();
                    new Alert(Alert.AlertType.INFORMATION,"Student Deleted Sucessfully. name : "+ st.getName()).show();
                }

            });
        }
        tblStudent.setItems(studentObList);
    }
}
