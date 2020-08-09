/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContohKonstruktor;

/**
 *
 * @author AfdalMaulana
 */
public class Konstruktor {
    public static void main(String[] args) {
        Tampil t = new Tampil();
        Data d = new Data(1, "Konstruktor");
    }
}
class Data{
    public Data(int a, String str){
            for(int x=0;x<=10;x++)
                System.out.println(x);
    }
}

class Tampil{
    public Tampil(){
        System.out.println("Contoh Konstruktor");
    }
}
