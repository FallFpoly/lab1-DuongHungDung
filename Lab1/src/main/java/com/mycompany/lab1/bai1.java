/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {
    public static void main(String[] args) {
        try ( 
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ho va ten: ");
            String hoTen = scanner.nextLine();
            System.out.print("Diem TB: ");
            double diemTB = scanner.nextDouble();
            System.out.printf("%s %.2f diem\n", hoTen, diemTB);
        }
    }
    }
