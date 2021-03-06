import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Module> moduleList;
    private List<Student> studentList;
    private DateTime startDate;
    private DateTime endDate;

    public Course(String courseName, String startDate, String endDate){
        this.courseName = courseName;
        this.startDate = DateTime.parse(startDate);
        this.endDate = DateTime.parse(endDate);
        moduleList = new ArrayList<Module>();
        studentList = new ArrayList<Student>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Module> getModuleList() {
        return moduleList;
    }

    public void setModuleList(List<Module> moduleList) {
        this.moduleList = moduleList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return courseName;
    }
}
