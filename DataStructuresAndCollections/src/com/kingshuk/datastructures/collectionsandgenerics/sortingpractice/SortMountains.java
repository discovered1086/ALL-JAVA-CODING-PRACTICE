package com.kingshuk.datastructures.collectionsandgenerics.sortingpractice;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Kingshuk
 * Date: 5/5/13
 * Time: 4:35 PM
 * To change this template use File | Settings | File Templates.
 */

class Mountain {
    private String name;
    private int height;

    Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    String getName() {
        return name;
    }

    int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return this.getName() +" " +this.getHeight();
    }
}

public class SortMountains {
    List<Mountain> mtn = new LinkedList<Mountain>();

    class NameCompare implements Comparator<Mountain> {
        public int compare(Mountain o1, Mountain o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    class HeightCompare implements Comparator<Mountain> {
        public int compare(Mountain o1, Mountain o2) {
            return o1.getHeight() > o2.getHeight() ? -1 : (o1.getHeight() == o2.getHeight()) ? 0 : 1;
        }
    }

    public static void main(String[] args) {
        new SortMountains().go();
    }

    private void go() {
        mtn.add(new Mountain("Longs", 14255));
        mtn.add(new Mountain("Elbert", 14433));
        mtn.add(new Mountain("Maroon", 14156));
        mtn.add(new Mountain("Castle", 14265));

        System.out.println("As entered \n" + mtn);
        Collections.sort(mtn,new NameCompare());

        System.out.println("By name \n"+mtn);

        Collections.sort(mtn,new HeightCompare());
        System.out.println("BY height \n"+mtn);
    }
}
