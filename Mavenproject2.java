/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        ArrayList<kopi> mtr = new ArrayList<>();
        
        mtr.add(new kopi( "Golda", "4.000 ribu"));
        mtr.add(new kopi("Gooday", "8.000 ribu"));
        mtr.add(new kopi("Starbucks", "60.000 ribu"));
        mtr.add(new kopi("Excelso", "30.000 ribu"));
        mtr.add(new kopi("Nescafe", "10.000 ribu"));
        
        for (kopi mt : mtr) {
            System.out.println("merk kopi"+ mt.merk + " dengan harga" + mt.harga);
        }
    }
}
