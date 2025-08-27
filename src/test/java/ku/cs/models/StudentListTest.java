package ku.cs.models;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
  private StudentList sL;

  @BeforeEach
    void intial() {
      sL = new StudentList();
      sL.addNewStudent("6710451402","Bell");
      sL.addNewStudent("6710450821","June");
  }

    @Test
    public void testFindStudentById(){
        sL.findStudentById("6710450821");
        assertEquals("June", sL.findStudentById("6710450821").getName());
    }

    @Test
    void testFilterByName(){
        StudentList filtered = sL.filterByName("June");
        assertEquals(1, filtered.getStudents().size());
        assertEquals("June", filtered.findStudentById("6710450821").getName());
    }

    @Test
    void testGiveScoreToId(){
        sL.giveScoreToId("6710450821", 90.0);
        assertEquals(90.0, sL.findStudentById("6710450821").getScore());
}

    @Test
    void testViewGradeOfId(){
        sL.giveScoreToId("6710450821", 90.0);
        sL.viewGradeOfId("6710450821");
        assertEquals("A", sL.viewGradeOfId("6710450821"));
    }

    @Test
    void testAddNewStudentWithScore(){
      sL.addNewStudent("6710451216","Fong",80.0);
      assertEquals(80.0, sL.findStudentById("6710451216").getScore());
      assertEquals("Fong", sL.findStudentById("6710451216").getName());
      assertEquals("6710451216", sL.findStudentById("6710451216").getId());
    }

    @Test
    void testAddNewStudentWithoutScore(){
        sL.addNewStudent("6710451216","Fong");
        assertEquals(0.0, sL.findStudentById("6710451216").getScore());
        assertEquals("Fong", sL.findStudentById("6710451216").getName());
        assertEquals("6710451216", sL.findStudentById("6710451216").getId());
    }

}