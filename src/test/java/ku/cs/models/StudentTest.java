package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15 คะแนน")
    void testAddScore(){
        Student s = new Student("6xxxxxxxx", "StudentTest");
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade(){
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    public void testChangeName(){
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.changeName("June");
        assertEquals("June", s.getName());
    }

    @Test
    public void testStudentWithScore(){
        Student s = new Student("6xxxxxxxxx", "StudentTest",80.0);
        assertEquals("6xxxxxxxxx", s.getId());
        assertEquals("StudentTest", s.getName());
        assertEquals(80.0, s.getScore());
    }

    @Test
    public void testStudentWithoutGrade(){
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        assertEquals("6xxxxxxxxx", s.getId());
        assertEquals("StudentTest", s.getName());
        assertEquals(0.0, s.getScore());
    }
}