package com.klodnicki.homework;
//
//Zaimplementuj nową klasę kolekcję, która będzie reprezentować (surprise, surprise) kolekcję dowolnych obiektów.
//        Powinna zawierać co najmniej metody:
//        add - dodaje element do kolekcji,
//        get - wyciąga element za pomocą indeksu,
//        remove - dwie metody. Pierwsza usuwa element z listy, podając indeks, drugiej podajesz obiekt, który chcesz usunąć,
//        size - zwraca ilość elementów na liście,
//        isEmpty - zwraca boolean czy kolekcja jest pusta.
//
//        Stwórz wtedy sobie klasę Main, w której przetestujesz czy wszystko działa (lub napisz pod to klasę testową z JUnit).


import java.util.*;

public class Collection<T> extends AbstractList<T> {
    private ArrayList<T> list;

    public Collection() {
        list = new ArrayList<>();
    }

    public boolean add(T object) {
        return list.add(object);
    }

    public T get(int index) {
        return list.get(index);
    }

    public T remove(int index) {
        return list.remove(index);
    }

    public boolean remove(Object o) {
        return list.remove(o);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
