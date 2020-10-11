package school;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BagOfStudents {
    //instance variable
    List<Student> bag = new ArrayList<>();

    //constructors

    public BagOfStudents(List<Student> bag) {
        this.bag = bag;
    }


    //getter and setter


    public List<Student> getBag() {
        return bag;
    }

    public void setBag(List<Student> bag) {
        this.bag = bag;
    }

    //unique methods
    public void add(Student student1d){
        bag.add(student1d);

    }

    public void remove(Student student1){
        bag.remove(student1);
    }

    public void clear(){
        bag.clear();
    }


    //utility methods


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BagOfStudents that = (BagOfStudents) o;
        return Objects.equals(bag, that.bag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bag);
    }

    @Override
    public String toString() {
        return "BagOfStudents{" +
                "student=" + bag +
                '}';
    }
}
