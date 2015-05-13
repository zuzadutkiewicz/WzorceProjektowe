/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorceprojektowe;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author 124098
 */
public class WzorzecIterator {

    private final int lenTab = 10;
    private final int tab[] = new int[lenTab];

    WzorzecIterator() {
        for (int i = 0; i < lenTab; i++)
            tab[i] = i;
    }

    public Iterator iterator() {
        return new IteratorXX();
    }

    class IteratorXX implements Iterator {

        private int current = 0;

        IteratorXX() {
            for (int i = 0; i < lenTab; i++) {
                tab[i] = i;
            }
        }

        @Override
        public boolean hasNext() {
            return (current < lenTab);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Object next() {
            if (current >= lenTab) {
                throw new NoSuchElementException("There are no elements size = " + current);
            }
            return tab[current++];
        }

    }
}
