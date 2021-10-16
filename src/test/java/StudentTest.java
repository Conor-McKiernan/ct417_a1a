import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {
    private Student s1 = new Student("Harry", 22, "06-04-1999", 1231);
    private Module m1 = new Module("Linear Algebra", "MA203");
    private Course c1 = new Course("CS & IT", "2020-01-01", "2020-08-31");
    @Test
    public void createStudent(){
        String username = s1.getUsername();
        assertEquals("Harry22", username);
        assertEquals("Harry", s1.getName());
        assertEquals(22, s1.getAge());
        assertEquals("06-04-1999", s1.getDob());
        assertEquals(1231, s1.getId());
    }

    @Test
    public void createCourse(){
        assertEquals("CS & IT", c1.getCourseName());
        assertEquals(DateTime.parse("2020-01-01"), c1.getStartDate());
        assertEquals(DateTime.parse("2020-08-31"), c1.getEndDate());
    }

    @Test
    public void setListsForStudent(){
        ArrayList<Course> courses = new ArrayList<Course>(Arrays.asList(c1));
        ArrayList<Module> modules = new ArrayList<Module>(Arrays.asList(m1));
        s1.setCourseList(courses);
        s1.setModuleList(modules);
        assertEquals(modules, s1.getModuleList());
        assertEquals(courses, s1.getCourseList());
    }
    @Test
    public void setListsForModule(){
        ArrayList<Course> courses = new ArrayList<Course>(Arrays.asList(c1));
        ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(s1));
        m1.setCourseList(courses);
        m1.setStudentList(students);
        assertEquals(students, m1.getStudentList());
        assertEquals(courses, m1.getCourseList());
    }
    @Test
    public void setListsForCourse() {
        ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(s1));
        ArrayList<Module> modules = new ArrayList<Module>(Arrays.asList(m1));
        c1.setStudentList(students);
        c1.setModuleList(modules);
        assertEquals(modules, c1.getModuleList());
        assertEquals(students, c1.getStudentList());
    }
}