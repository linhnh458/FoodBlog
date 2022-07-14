package Test;

import Models.RecommendVideo;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SplitArrayString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
//        System.out.print("Enter a number: ");
//        int numAfterDecimalPoint = sc.nextInt() ;
//        String pi = String.valueOf(Math.PI);
//        for (int i = 0; i <= numAfterDecimalPoint + 1; i++) {
//            System.out.print(pi.charAt(i));
//        }

        String str = "loWeR";
        System.out.println("Enter a letter: ");
        String letter = sc.next();
        if(letter.equals("U")){
            str = str.toUpperCase();
        }
        if(letter.equals("L")){
            str = str.toLowerCase();
        }
        System.out.println(str);
    }
}
