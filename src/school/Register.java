package school;

import java.util.*;

public class Register {

    //instance variables
    List<Nameable> registerList;


    //constructor

    public Register(List<Nameable> registerList) {
        this.registerList = registerList;
    }

    public Register() {
        this.registerList = new ArrayList<>();
    }

//    public Register(List<Student> students){ }

    //getters and setters

    public List<Nameable> getRegisterList() {
        return registerList;
    }

    public void setRegisterList(List<Nameable> registerList) {
        this.registerList = registerList;
    }


    //unique methods

    public void addStudent(Nameable student){
        registerList.add(student);
    }

    public List<String> getRegisterByLevel(Level studentLevel){
        List<String> listOfStudentNames = new ArrayList<>();

        for(Nameable nameOfStudent: registerList){
            Student student = (Student) nameOfStudent;

            if(student.getLevel() == studentLevel){
                listOfStudentNames.add(nameOfStudent.getName());
            }
        }

        return listOfStudentNames;

    }

//    public Map<Level, List<Student>> getRegisterByLevel(Level studentLevel, Student students){
//        Map<Level, List<Student>> listOfStudentNames = new HashMap<Level, List<Student>>();
//
//        return listOfStudentNames ;
//
//    }


    public String printReport(){
        List<String> listOfStudentInFirstYear = new ArrayList<>();
        List<String> listOfStudentInSecondYear = new ArrayList<>();
        List<String> listOfStudentInThirdYear = new ArrayList<>();

        for(Nameable nameOfStudent: registerList){

            Student student = (Student) nameOfStudent;

            if(student.getLevel() == Level.LEVEL1){
                listOfStudentInFirstYear.add(nameOfStudent.getName());
            }
            else if(student.getLevel() == Level.LEVEL2){
                listOfStudentInSecondYear.add(nameOfStudent.getName());
            }
            else {
                listOfStudentInThirdYear.add(nameOfStudent.getName());
            }
        }
    return "List of first years: " + listOfStudentInFirstYear.toString() + "\n" +
            "List of second years: " + listOfStudentInSecondYear.toString() + "\n" +
            "List of third years: " + listOfStudentInThirdYear.toString() + "\n" ;

    }

//    public List<Student> sort(Comparator<Student> studentComparator){
//        List<Student> studentList = new ArrayList<>();
////        studentComparator.reversed(studentList);
//
//        return studentList;
//    }

    //utility methods


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Register)) return false;
        Register register = (Register) o;
        return Objects.equals(registerList, register.registerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registerList);
    }


    @Override
    public String toString() {
        return "Register{" +
                "registerList=" + registerList +
                '}';
    }
}
