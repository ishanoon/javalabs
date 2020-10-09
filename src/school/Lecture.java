package school;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lecture {

    //instance variables

    String name;
    String ID;
    String lecturerName;
    List<Student> studentList;


    //constructor

    public Lecture(String name, String ID, String lecturerName, List<Student> studentList) {
        this.name = name;
        this.ID = ID;
        this.lecturerName = lecturerName;
        this.studentList = studentList;
    }

    public Lecture(String name, String ID, String lecturerName) {
        this.name = name;
        this.ID = ID;
        this.lecturerName = lecturerName;
        this.studentList = new ArrayList<>();
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }


    //unique methods

    public void enter(Student newStudent){

        studentList.add(newStudent);

    }

    public double getHighestAverageGrade(){

        double max = 0;
        for (Student student: studentList) {
            if (student.getAverageGrade() > max){
                max = student.getAverageGrade();
            }
        }

        return max;
    }

    //utility methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lecture)) return false;
        Lecture lecture = (Lecture) o;
        return Objects.equals(name, lecture.name) &&
                Objects.equals(ID, lecture.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ID);
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", lecturerName='" + lecturerName + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
