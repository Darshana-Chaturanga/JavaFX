import java.util.ArrayList;

public class Database {
    public static ArrayList<Student> studentDb = new ArrayList<>();
    static {
        studentDb.add(new Student("93524835V","Darshana","33"));
        studentDb.add(new Student("96744334V","Nimal","38"));
        studentDb.add(new Student("93814385V","Kasun","34"));
        studentDb.add(new Student("97304712V","Amara","39"));
    }
}
