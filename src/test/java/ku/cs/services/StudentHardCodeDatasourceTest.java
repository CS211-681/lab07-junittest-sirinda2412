package ku.cs.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ku.cs.models.StudentList;

class StudentHardCodeDatasourceTest {
    @Test
    public void testStudentHardCodeDatasource() {
        StudentHardCodeDatasource stu = new StudentHardCodeDatasource();
        stu.readData();
        assertEquals(4,stu.readData().getStudents().size());
        assertEquals("6710400001",stu.readData().getStudents().get(0).getId());
        assertEquals("6710400002",stu.readData().getStudents().get(1).getId());
        assertEquals("6710400003",stu.readData().getStudents().get(2).getId());
        assertEquals("6710400004",stu.readData().getStudents().get(3).getId());
    }
}