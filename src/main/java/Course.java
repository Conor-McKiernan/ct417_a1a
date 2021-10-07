import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Module> moduleList;
    private List<Student> studentList;
    private LocalDate startDate;
    private LocalDate endDate;

    public Course(String courseName, LocalDate startDate, LocalDate endDate){
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
