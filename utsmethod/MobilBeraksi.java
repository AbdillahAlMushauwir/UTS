/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsmethod;

/**
 *
 * @author LENOVO
 */
public class MobilBeraksi {
    public static void main(String[]args){
        Mobil cars = new Mobil();
        
        cars.tipe = "Nissan Skyline GTR R34";
        cars.tahun = 2005;
        cars.printMobil();
    }
}
