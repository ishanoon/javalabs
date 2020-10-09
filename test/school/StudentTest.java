package school;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student testStudent;

    @BeforeEach
    void setUp() {
        testStudent = new Student("Test", "testID");
    }

    @Test
    void testGetAverageGrade() {

        List<Double> testGradeList = new ArrayList<>();
        testGradeList.add(10.0);
        testGradeList.add(10.0);
        testStudent.setGradeList(testGradeList);

        assertEquals(10.0, testStudent.getAverageGrade());
    }
}