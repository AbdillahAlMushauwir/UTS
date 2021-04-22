/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MTK;

/**
 *
 * @author LENOVO
 */
public class MatematikaCanggih {
     int hasil;
    double hasilD;

    void pertambahan (int a, int b,int c){
        hasil = a + b + c;
        System.out.println("(Pemjumlahan) " + a +" + "+ b +" + "+ c +" = " + getHasil() );
    }
    void perkalian (int a, int b, int c){
        hasil = a * b * c;
        System.out.println("(Perkalian) " + a +" * "+ b +" * "+ c + " = " + getHasil() );
    }

    int getHasil() {
        return hasil;
    }

    void modulus(double a, double b){
        hasilD = a % b;
        System.out.println("(Modulus) " + a +" % "+ b +" = " + getHasilD() );
    }
    double getHasilD() {
        return hasilD;
    }
}
