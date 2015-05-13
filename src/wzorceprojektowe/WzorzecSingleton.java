/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorceprojektowe;

/**
 *
 * @author 124098
 */
public class WzorzecSingleton {

    private int licznik = 0;
    
    //żeby uniknąć automatycznego tworzenia domyślnego, publicznego, bezargumentowego konstruktora
    private WzorzecSingleton() {
    }

    private static class SingletonHolder {

        private final static WzorzecSingleton instance = new WzorzecSingleton();
    }

    public static WzorzecSingleton getInstance() {
        return SingletonHolder.instance;
    }

    public int dajLicznik() {
        return licznik;
    }

    public void ustawLicznik(int p_licznik) {
        this.licznik = p_licznik;
    }

}
