package com.gmail.at.kotamadeo.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.Random;
import java.util.stream.IntStream;

public class Randoms implements Iterable<Integer> {
    private final PrimitiveIterator.OfInt primitiveIterator;


    public Randoms(int min, int max) {
        Random random = new Random();
        IntStream intStream = random.ints(min, max + 1);
        this.primitiveIterator = intStream.iterator();
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return primitiveIterator.nextInt();
            }
        };
    }
}
