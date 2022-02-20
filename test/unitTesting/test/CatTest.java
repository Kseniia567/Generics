package unitTesting.test;

import eu.glowacki.utp.assignment01.myClasses.Cat;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatTest {

    private Cat _cat;
    private static final String NAME = "Barsik";

    @Before
    public void before() {
        _cat = new Cat(NAME);
        Assert.assertEquals(NAME, _cat.get_name());
    }

    @Test
    public void aggregate() {
        String aggregate = _cat.aggregate(null);
        Assert.assertEquals(NAME, aggregate);
        final String init = "Cat";
        Assert.assertEquals((NAME + init), (_cat.aggregate(init)));
    }

    @Test
    public void deepClone() {
        Cat clone = _cat.deepClone();
        Assert.assertEquals(_cat.get_name(), clone.get_name());
        Assert.assertNotSame(_cat, clone);
    }
}