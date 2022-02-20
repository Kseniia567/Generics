package unitTesting.test;

import eu.glowacki.utp.assignment01.myClasses.Cat;
import eu.glowacki.utp.assignment01.myClasses.Container;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ContainerTest {

    Container <Cat, String> _container;
    Cat cat_1 = new Cat("Barsik");
    Cat cat_2;

    @Before
    public void before() {
        _container = new Container<>();
        List<Cat> list = new ArrayList<>();

        cat_2 = cat_1.deepClone();
        list.add(cat_1);
        list.add(cat_2);

        _container.add(cat_1);
        _container.add(cat_2);

        Assert.assertEquals(list, _container.elements());
    }


    @Test
    public void aggregateAllElements() {
        String s = cat_1.aggregate(cat_2.aggregate(null));
        String res = _container.aggregateAllElements();
        Assert.assertEquals(s, res);
    }

    @Test
    public void cloneElementAtIndex() {
        Cat x = _container.cloneElementAtIndex(0);
        Assert.assertEquals(x.get_name(), (_container.elements().get(0)).get_name());
        Assert.assertNotSame(x, _container.elements().get(0));
    }


}