import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StudentTest {
    @Test
    public void calculateUsername(){
        Student s2 = new Student("Harry", 22, "06-04-1999", 1231);
        String username = s2.getUsername();
        assertEquals("Harry22", username);
    }

    public static void main(String[] args){
        StudentTest test = new StudentTest();
        test.calculateUsername();
    }
}