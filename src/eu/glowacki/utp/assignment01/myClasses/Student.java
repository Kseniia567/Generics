package eu.glowacki.utp.assignment01.myClasses;

import eu.glowacki.utp.assignment01.IAggregable;
import eu.glowacki.utp.assignment01.IDeeplyCloneable;


public final class Student implements IAggregable<Student, Double>, IDeeplyCloneable<Student> {

    private double _averageMark;

    public Student() {}

    public Student(double averageMark) {
        _averageMark = averageMark;
    }

    public double get_averageMark() {
        return _averageMark;
    }

    public void set_averageMark(double mark) {
        _averageMark =mark;
    }

    @Override
    public Double aggregate(Double intermediateResult) {
        return intermediateResult == null? _averageMark:_averageMark + intermediateResult;
    }

    @Override
    public Student deepClone() {
        return new Student(_averageMark);
    }
}
