package com.guilherme;

import io.reactivex.subjects.PublishSubject;

import java.util.Arrays;
import java.util.List;

public class SubjectTest {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8);
        PublishSubject<Integer> subject = PublishSubject.create();
        subject.subscribe(x -> System.out.println("Emitindo valor " + x.toString())
                        , throwable -> System.out.println("Deu ruim -> " + throwable.getMessage())
                        , () -> System.out.println("Terminou de processar"));
        subject.onNext(9);
        l.forEach(subject::onNext);
        subject.onComplete();
    }

}
