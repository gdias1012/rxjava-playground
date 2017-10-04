package com.guilherme;

import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.List;

public class Grouping {

    public static void main(String[] args) {
        List<Model> l = new ArrayList<>();
        l.add(new Model(1, "Text 1"));
        l.add(new Model(2, "Text 2"));
        l.add(new Model(3, "Text 3"));
        l.add(new Model(4, "Text 4"));
        l.add(new Model(5, "Text 5"));
        l.add(new Model(6, "Text 6"));
        l.add(new Model(7, "Text 7"));
        l.add(new Model(8, "Text 8"));
        l.add(new Model(9, "Text 9"));
        l.add(new Model(0, "Text 0"));
        l.add(new Model(1, "Text 1.1"));

        Observable.fromIterable(l)
                .groupBy(Model::getId)
//                .flatMap(group -> group.reduce((model, model2) -> Observable.create(model)))
                .subscribe(x -> System.out.println(x));
    }

}
