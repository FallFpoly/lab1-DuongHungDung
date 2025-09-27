/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {
 public static void main(String[] args) {
     try (Scanner scanner = new Scanner(System.in)) {
         System.out.print("Nhap chieu dai: ");
         double dai = scanner.nextDouble();
         
         System.out.print("Nhap chieu rong: ");
         double rong = scanner.nextDouble();
         double chuVi = (dai + rong) * 2;
         double dienTich = dai * rong;
         double canhNho = Math.min(dai, rong);
         System.out.println("Chu vi hinh chu nhat: " + chuVi);
         System.out.println("Dien tich hinh chu nhat: " + dienTich);
         System.out.println("Canh nho nhat: " + canhNho);
     }
    }
}
