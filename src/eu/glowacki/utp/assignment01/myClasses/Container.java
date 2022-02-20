package eu.glowacki.utp.assignment01.myClasses;

import eu.glowacki.utp.assignment01.IAggregable;
import eu.glowacki.utp.assignment01.IContainer;
import eu.glowacki.utp.assignment01.IDeeplyCloneable;

import java.util.ArrayList;
import java.util.List;

public class Container<TElement extends IAggregable<TElement, TResult> & IDeeplyCloneable<TElement>, TResult> implements IContainer {

    private List<TElement> container = new ArrayList<>();


    @Override
    public List<TElement> elements() {
        return container;
    }

    @Override
    public TResult aggregateAllElements() {
        TResult res = null;
        for (TElement elem : container) {
            res = elem.aggregate(res);
        }
        return res;

    }

    @Override
    public TElement cloneElementAtIndex(int index) {
        return index >= container.size() || index < 0? null : container.get(index).deepClone();
    }

    public void add(TElement element) {
        container.add(element);
    }
}
