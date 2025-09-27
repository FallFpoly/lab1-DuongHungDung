/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap canh cua khoi lap phuong: ");
            double canh = scanner.nextDouble();
            double theTich1 = canh * canh * canh;
            System.out.println("The tich : " + theTich1);
        }
    }
}