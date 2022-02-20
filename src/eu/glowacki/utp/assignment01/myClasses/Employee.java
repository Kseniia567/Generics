package eu.glowacki.utp.assignment01.myClasses;

import eu.glowacki.utp.assignment01.IAggregable;
import eu.glowacki.utp.assignment01.IDeeplyCloneable;

public final class Employee implements IAggregable<Employee, Integer>, IDeeplyCloneable<Employee> {

    private int _salary;

    public Employee(){
    }

    public Employee(int salary) {
        _salary = salary;
    }

    public int get_salary() {
        return _salary;
    }

    @Override
    public Integer aggregate(Integer intermediateResult) {
        return intermediateResult == null? _salary:_salary + intermediateResult;
    }

    @Override
    public Employee deepClone() {
        return new Employee(_salary);
    }
}
