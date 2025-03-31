package util;

import java.util.Scanner;

public class Validator {
    public static int ValidatorInt(Scanner sc) throws Exception {
        try {
            System.out.println("Nhap so nguyen");
            int a = sc.nextInt();
            return a;
        }catch(Exception e){
            throw new Exception("Vui long nhap lai");
        }
    }
    public static float ValidatorFloat(Scanner sc) throws Exception {
        try {
            System.out.println("Nhap so thuc(Float)");
            float a = sc.nextFloat();
            return a;
        }catch(Exception e){
            throw new Exception(e);
        }

    }
    public static Double ValidatorDouble(Scanner sc) throws Exception {
        try {
            System.out.println("Nhap so thuc(Double)");
            Double a = sc.nextDouble();
            return a;
        }catch(Exception e){
            throw new Exception(e);
        }
    }
    public static Boolean ValidatorBoolean(Scanner sc) throws Exception {
        try {
            System.out.println("Nhap vao true/false");
            Boolean a = sc.nextBoolean();
            return a;
        }catch(Exception e){
            throw new Exception(e);
        }
    }
    public static String ValidatorString(Scanner sc) throws Exception {
        try {
            System.out.println("Nhap vao mot chuoi");
            String a = sc.nextLine();
            return a;
        }catch(Exception e){
            throw new Exception(e);
        }
    }
}
