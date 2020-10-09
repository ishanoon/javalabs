package school;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {

    NaughtyStudent testNaughtyStudent;

    @BeforeEach
    void setUp() {
        testNaughtyStudent = new NaughtyStudent("Test", "testID", Level.LEVEL1);
    }

    @Test
    void testIfNaughtyIsASubClassOfStudent(){
        assertTrue(testNaughtyStudent instanceof Student);
    }

    @Test
    void testGetAverageGrade() {

        testNaughtyStudent.addGrade(10);
        testNaughtyStudent.addGrade(10);

        assertEquals(11, testNaughtyStudent.getAverageGrade());
    }
}