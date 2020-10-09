package school;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    Register testRegister;

    @BeforeEach
    void setUp() {
        testRegister = new Register();
    }

    @Test
    void getRegisterList() {
        Student testStudent = new NaughtyStudent("Test", "testID", Level.LEVEL1);


        testRegister.addStudent(testStudent);
        assertEquals("Test", testRegister.getRegisterList().get(0).getName());
    }

    @Test
    void getRegisterByLevel() {

        for (int i = 0; i < 10; i++) {

            Student st;
            if (i % 2 == 0) {
                st = new Student("Test", "Test", Level.LEVEL1);
            }else{
                st = new Student("Test", "Test", Level.LEVEL2);
            }

            testRegister.addStudent(st);
        }

        assertEquals(5, testRegister.getRegisterByLevel(Level.LEVEL1).size());
    }


    @Test
    void testPrintOfStudentSortedByLevel() {
        for (int i = 0; i < 30; i++) {

            Student st;

            if (i % 2 == 0) {
                st = new Student("Test", "Test", Level.LEVEL1);
            }else if (i % 3 == 0){
                st = new Student("Test", "Test", Level.LEVEL2);
            }else {
                st = new Student("Test", "Test", Level.LEVEL3);
            }

            testRegister.addStudent(st);
        }

        assertTrue(testRegister.printReport() instanceof  String);

    }
}