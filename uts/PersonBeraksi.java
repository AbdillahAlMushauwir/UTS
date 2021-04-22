/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author LENOVO
 */
public class PersonBeraksi {
    public static void main (String[] args){
        Person manusia = new Person();
        Person orang = new Person();
        
        orang.age = 52;
        orang.nama = "Mary Sharp";
        
        manusia.nama = "Joe Smith";
        manusia.age = 24;
        
        System.out.println("Nama : " + manusia.nama);
        System.out.println("Age : " + manusia.age);
        System.out.println("Nama : " + orang.nama);
        System.out.println("Nama : " + orang.age);
    }
}
