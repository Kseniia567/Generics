package unitTesting.test;

import eu.glowacki.utp.assignment01.myClasses.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class EmployeeTest {

    private Employee _emp;
    private static final int SAL = 3000;


    @Before
    public void before() {
        _emp = new Employee(SAL);
        Assert.assertEquals(SAL, _emp.get_salary());
    }
    @Test
    public void aggregate() {
        int aggregate = _emp.aggregate(null);
        Assert.assertEquals(SAL, aggregate);
        final int init = 200;
        Assert.assertEquals(SAL + init, (int) (_emp.aggregate(init)));
    }

    @Test
    public void deepClone() {
        Employee clone = _emp.deepClone();
        Assert.assertEquals(_emp.get_salary(), clone.get_salary());
        Assert.assertNotSame(_emp, clone);
    }
}