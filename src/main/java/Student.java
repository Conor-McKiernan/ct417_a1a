import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String dob;
    private int id;
    private String username;

    private List<Course> courseList;
    private List<Module> moduleList;

    public Student(String name, int age, String dob, int id) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        username = name + age;
        courseList = new ArrayList<>();
        moduleList = new ArrayList<>();
    }

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public List<Module> getModuleList() {
        return moduleList;
    }

    public void setModuleList(List<Module> moduleList) {
        this.moduleList = moduleList;
    }

    public void addCourse(Course c){
        courseList.add(c);
    }
}
