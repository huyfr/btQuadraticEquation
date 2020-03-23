import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a=sc.nextDouble();
        System.out.print("Nhap b: ");
        double b=sc.nextDouble();
        System.out.print("Nhap c: ");
        double c=sc.nextDouble();

        QuadraticEquation quadraticEquation= new QuadraticEquation(a,b,c);
        double delta=quadraticEquation.getDiscriminant();

        if (delta>0){
            System.out.println("Phuong trinh co 2 nghiem phan biet");
            System.out.println("Nghiem 1: "+quadraticEquation.getRoot1());
            System.out.println("Nghiem 2: "+quadraticEquation.getRoot2());
        } else if (delta==0){
            System.out.print("Phuong trinh co 1 nghiem: "+quadraticEquation.getRoot1());
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
