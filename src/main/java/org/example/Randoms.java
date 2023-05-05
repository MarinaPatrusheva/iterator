package org.example;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer>{
    protected Random random;
    private int min;
    private int max;
    public Randoms(int min, int max){
        this.min = min;
        this.max = max + 1;
        random = new Random();
    }
    @Override
    public Iterator<Integer> iterator() {
        return random.ints(min, max).iterator();
    }

}
