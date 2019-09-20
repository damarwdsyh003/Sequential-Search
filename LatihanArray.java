/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet.pkg5.newpackage;

import java.util.Scanner;

/**
 *
 * @author Damar
 */
public class LatihanArray {
    public static void main(String[] args) {
        int cari;
        boolean found = false;
        int[] data = new int[]{29,4,10,94,96};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Data yang ingin dicari:");
        cari = input.nextInt();
        for (int i = 0; i < data.length; i++) {
            if(cari == data[i]){
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.println("~Data Ditemukan~");
        }else{
            System.out.println("~Data Tidak Ditemukan~");
        }
    }
}
