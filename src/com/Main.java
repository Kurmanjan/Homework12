package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;



public class Main {


    public static void main(String[] args) {
        myList();

    }

    private static void myList() {

        ArrayList<String> a = new ArrayList<>();
        a.add("Добрый день пользователь А, как дела");
        a.add("Добрый вечер пользователь А, как дела");
        a.add("Доброе утро пользаватель А, как дела");
        a.add("Добрые ночи пользователь А, как дела");
        a.add("Спокойно ночи пользаватель А, как дела");

        Iterator<String> iteratorA = a.iterator();
        while (iteratorA.hasNext()) {
            String s = iteratorA.next();
            System.out.println(s);
        }

        ArrayList<String> b = new ArrayList<>();
        b.add("Добрый день пользаватель Б, как дела");
        b.add("Добрый вечер пользаватель Б, как дела");
        b.add("Доброе утро пользаватель Б, как дела");
        b.add("Добрые ночи пользаватель Б, как дела");
        b.add("Спокойно ночи пользаватель Б, как дела");

        Iterator<String> iteratorB = b.iterator();
        while (iteratorB.hasNext()) {
            String e = iteratorB.next();
            System.out.println(e);
        }

        System.out.println("_____________________________");

        ArrayList<String> c = a;
        iteratorA = a.iterator();
        iteratorB = b.iterator();
        Collections.reverse(b);


        while (iteratorA.hasNext()) {
            String s = iteratorA.next();
            String e = iteratorB.next();
            System.out.println(s);
            System.out.println(e);
        }


        Collections.sort(c, (s, t1) -> {
            if (s.length() < t1.length())
            return -1;
            else{
                return 1;
            }
        });
        System.out.println("______________________");
        System.out.println(c);

    }
}






