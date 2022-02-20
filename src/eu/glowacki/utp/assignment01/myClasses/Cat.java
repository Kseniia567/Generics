package eu.glowacki.utp.assignment01.myClasses;

import eu.glowacki.utp.assignment01.IAggregable;
import eu.glowacki.utp.assignment01.IDeeplyCloneable;

public final class Cat implements IAggregable<Cat, String>, IDeeplyCloneable<Cat> {

    private String _name;

    public Cat() {
    }

    public Cat(String name) {
        _name = name;
    }


    public String get_name() {
        return _name;
    }


    @Override
    public String aggregate(String intermediateResult) {
        return intermediateResult == null ? _name : _name + intermediateResult;
    }

    @Override
    public Cat deepClone() {
        return new Cat(_name);
    }
}
