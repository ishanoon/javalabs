package school;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {

    Lecture testLecture;



    @BeforeEach
    void setUp() {
        testLecture = new Lecture("OOP Fundamentals", "Test", "Test" );

    }

    @Test
    void enter() {
        //init testStudent
        Student testStudent= new Student("test","test",  Level.LEVEL1);

        //putting our testStudent into the testLecture object list
        testLecture.enter(testStudent);

        //checking if the testStudent is actually the first student in the list
        assertEquals(testStudent, testLecture.studentList.get(0));
    }

    @Test
    void getHighestAverageGrade() {


        // create 3 three new students (ts1, ts2, ts3)
        Student ts1 = new Student("TS1", "test1",  Level.LEVEL1);
        Student ts2 = new Student("TS2", "test2",  Level.LEVEL1);
        Student ts3 = new Student("TS3", "test3",  Level.LEVEL1);


        // add new grades to each test student
        List<Double> tgl1 = new ArrayList<>();
        tgl1.add(10.0);
        tgl1.add(10.0);
        ts1.setGradeList(tgl1);

        List<Double> tgl2 = new ArrayList<>();
        tgl2.add(20.0);
        tgl2.add(10.0);
        ts2.setGradeList(tgl2);

        List<Double> tgl3 = new ArrayList<>();
        tgl3.add(20.0);
        tgl3.add(20.0);
        ts3.setGradeList(tgl3);

        // add all three students to the lecture
        testLecture.enter(ts1);
        testLecture.enter(ts2);
        testLecture.enter(ts3);

        // assert that the highest average grade == 20
        assertEquals(20,testLecture.getHighestAverageGrade());

    }

    @Test
    void testNaughtyStudentGradeIsHigherThanShouldBe() {
        Student ts1 = new Student("TS1", "test1", Level.LEVEL1);
        NaughtyStudent ts2 = new NaughtyStudent("TS2", "test2", Level.LEVEL1);

        ts1.addGrade(10);
        ts1.addGrade(10);

        ts2.addGrade(10);
        ts2.addGrade(10);

        testLecture.enter(ts1);
        testLecture.enter(ts2);

        assertEquals(11,testLecture.getHighestAverageGrade());


    }
}