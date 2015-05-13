/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorceprojektowe;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author 
 */
public class WzorceProjektowe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Test");
        WzorceProjektowe testJava = new WzorceProjektowe();
//        testJava.testujIterator();
        testJava.testujSingleton();

    }

    public void testujIteratorArrayList() {
        ArrayList<Integer> ar = new ArrayList<Integer>();

        ar.add(0);
        ar.add(1);
        ar.add(2);
        ar.add(3);

        Iterator iter1 = ar.iterator();
        Iterator iter2 = ar.iterator();

        while (iter1.hasNext()) {
            System.out.println("iter1=" + iter1.next());
        }

        while (iter2.hasNext()) {
            System.out.println("iter2=" + iter2.next());
        }

    }

    public void testujIterator() {
        WzorzecIterator testIterator = new WzorzecIterator();
        Iterator iter1 = testIterator.iterator();
        Iterator iter2 = testIterator.iterator();

        while (iter1.hasNext()) {
            System.out.println("iter1=" + iter1.next());
        }

        while (iter2.hasNext()) {
            System.out.println("iter2=" + iter2.next());
        }
    }
    
    public void testujSingleton()
    {
        WzorzecSingleton ws1 = WzorzecSingleton.getInstance();
        WzorzecSingleton ws2 = WzorzecSingleton.getInstance();
        
        System.out.println("ws1.dajLicznik():" + ws1.dajLicznik());
        System.out.println("ws2.dajLicznik():" + ws2.dajLicznik());
        ws1.ustawLicznik(12);
        System.out.println("ws1.dajLicznik():" + ws1.dajLicznik());
        System.out.println("ws2.dajLicznik():" + ws2.dajLicznik());
        
    }
}