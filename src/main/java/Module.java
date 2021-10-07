import java.util.ArrayList;
import java.util.List;

public class Module {
    private String moduleName;
    private int moduleId;
    private List<Student> studentList;
    private List<Course> courseList;

    public Module(String moduleName, int moduleId){
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

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
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
}
