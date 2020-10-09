package school;

import java.util.List;

public class NaughtyStudent extends Student {

    double cheatIncreaseRate;

    public NaughtyStudent(String name, String ID, List<Double> grades, Level studentLevel) {
        super(name, ID, grades, studentLevel);
        this.cheatIncreaseRate = 0.1;
    }

    public NaughtyStudent(String name, String ID, Level studentLevel) {
        super(name, ID, studentLevel);
        this.cheatIncreaseRate = 0.1;
    }

    @Override
    public Double getAverageGrade() {
        double avg = super.getAverageGrade();
        avg += avg * cheatIncreaseRate;
        return avg;
    }
}
