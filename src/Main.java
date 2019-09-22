import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("input a: ");
        int a = in.nextInt();
        System.out.println("input b: ");
        int b = in.nextInt();
        System.out.println("input c: ");
        int c = in.nextInt();
        int x1 = (int) (-b + Math.sqrt(b*b-4*a*c)/2*a);
        int x2 = (int) (-b - Math.sqrt(b*b-4*a*c)/2*a);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        int borderA = 7;
        int borderB = 10;
        int per = borderA*2 + borderB*2;
        int square = borderA * borderB;
        System.out.println("PER = " + per + "SQUARE = " + square);
        int perm = 40;
        int ls = perm/4;
        System.out.println("LS = " + ls);
        double g = 8;
        double q = 9;
        double d = 10;
        double j = (g + Math.sqrt(g*g+4*q*d)/2*q - (q*q*q*d) + Math.pow(g,-2));
        System.out.println(j);
    }
}
