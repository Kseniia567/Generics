package unitTesting.test;
import eu.glowacki.utp.assignment01.myClasses.Student;
import org.junit.*;




public class StudentTest {

    private Student _student;
    private static final double AV_MARK = 4.65;


    @Before
    public void before() {
        _student = new Student();
        _student.set_averageMark(AV_MARK);
        Assert.assertEquals(AV_MARK, _student.get_averageMark(), 0.2);
    }

    @Test
    public void aggregate() {
        Double aggregate = _student.aggregate(null);
        Assert.assertEquals(aggregate, _student.get_averageMark(), 0.2);
        double init = 0.3;
        Assert.assertEquals(AV_MARK+init, _student.aggregate(init), 0.2);
    }

    @Test
    public void deepClone() {
        Student clone = _student.deepClone();
        Assert.assertEquals(_student.get_averageMark(), clone.get_averageMark(), 0.2);
        Assert.assertNotSame(_student, clone);
    }
}