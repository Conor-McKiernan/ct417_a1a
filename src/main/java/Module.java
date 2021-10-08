import java.util.ArrayList;
import java.util.List;

public class Module {
    private String moduleName;
    private String moduleId;
    private List<Student> studentList;
    private List<Course> courseList;

    public Module(String moduleName, String moduleId){
        this.moduleName = moduleName;
        this.moduleId = moduleId;
        studentList = new ArrayList<Student>();
        courseList = new ArrayList<Course>();
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void addStudent(Student s){
        studentList.add(s);
    }

    @Override
    public String toString() {
        return moduleName;
    }
}
