import javafx.scene.control.Button;

public class StudentTm {

    private String nic;
    private String name;
    private String age;
    private Button btn;

    public StudentTm() {
    }

    public StudentTm(String nic, String name, String age, Button btn) {
        this.nic = nic;
        this.name = name;
        this.age = age;
        this.btn = btn;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
