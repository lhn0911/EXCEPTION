package presentation;

import util.Validator;

import java.util.Scanner;

public class test {
    public static void main(String[] args) throws  Exception {
        Scanner sc = new Scanner(System.in);
        int a = Validator.ValidatorInt(sc);
        float b = Validator.ValidatorFloat(sc);
        Double c = Validator.ValidatorDouble(sc);
        String d = Validator.ValidatorString(sc);
        Boolean e = Validator.ValidatorBoolean(sc);
    }
}
