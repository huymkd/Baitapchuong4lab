package cau3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Circle cl=new Circle();
        System.out.print("Nhap radius: ");
        Scanner sc=new Scanner(System.in);
        cl.setradius(sc.nextDouble());
        System.out.println("Dien tich= "+cl.getarea());
        System.out.println("Chu vi= "+cl.getperimter());
        System.out.println("Mau`: "+cl.getcolor());
        System.out.println("Filled: "+cl.isfilled());
        
        Rectangle rl=new Rectangle();
        System.out.print("Nhap chieu dai: ");
        rl.setlength(sc.nextDouble());
        System.out.print("Nhap chieu rong: ");
        rl.setwidth(sc.nextDouble());
        System.out.println("Dien tich= "+rl.getarea());
        System.out.println("Chu vi= "+rl.perimeter());
        System.out.println("Mau`: "+rl.getcolor());
        System.out.println("Filled: "+rl.isfilled());
        
        Square sq= new Square();
        System.out.print("Nhap side: ");
        sq.setside(sc.nextDouble());
        System.out.println("Dien tich= "+sq.getarea());
        System.out.println("Mau`: "+sq.getcolor());
        System.out.println("Filled: "+sq.isfilled());
    }
}
