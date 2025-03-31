package util;

import java.util.Scanner;

public class Validator {
    public static int ValidatorInt(Scanner sc) throws Exception {
        try {
            System.out.println("Nhap so nguyen");
            int a = sc.nextInt();
            return a;
        }catch(Exception e){
            System.out.println("Khong dung dinh dang");
        }
        return 0;
    }
    public static float ValidatorFloat(Scanner sc) throws Exception {
        sc.nextLine();
        try {
            System.out.println("Nhap so thuc(Float)");
            float a = sc.nextFloat();
            return a;
        }catch(Exception e){
            System.out.println("Khong dung dinh dang");
        }
        return 0;

    }
    public static Double ValidatorDouble(Scanner sc) throws Exception {
        sc.nextLine();
        try {
            System.out.println("Nhap so thuc(Double)");
            Double a = sc.nextDouble();
            return a;
        }catch(Exception e){
            System.out.println("Khong dung dinh dang");
        }
        return (double) 0;
    }
    public static Boolean ValidatorBoolean(Scanner sc) throws Exception {
        sc.nextLine();
        try {
            System.out.println("Nhap vao true/false");
            Boolean a = sc.nextBoolean();
            return a;
        }catch(Exception e){
            System.out.println("Khong dung dinh dang");
        }
        return false;
    }
    public static String ValidatorString(Scanner sc) throws Exception {
        sc.nextLine();
        try {
            System.out.println("Nhap vao mot chuoi");
            String a = sc.nextLine();
            return a;
        }catch(Exception e){
            System.out.println("Khong dung dinh dang");
        }
        return null;
    }
    public static String ValidatorEmail(Scanner sc) throws Exception {
        sc.nextLine();
        try {
            System.out.println("Nhap vao email");
            String a = sc.nextLine();
        }catch(Exception e){
            System.out.println("Khong dung dinh dang");
        }
        return null;
    }
}
