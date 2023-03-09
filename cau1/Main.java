package Cau1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("1. Tao'");
        System.out.println("2. Cam thuong`");
        System.out.println("3. Cam Sanh`");
        System.out.println("4. Cam Cao Phong");
        System.out.print("Chon chuc nang: ");
        Scanner sc=new Scanner(System.in);
        int chon = sc.nextInt();
        switch (chon) {
            case 1:
                QuaTao qt=new QuaTao();
                System.out.println( ""+qt.xuattentao());
                System.out.print("Nhap so luong can mua: ");
                qt.setsoluong(sc.nextInt());
                System.out.println("Gia la: "+qt.giabantao());
                break;
            case 2:
                QuaCam qc=new QuaCam();
                System.out.println(""+qc.xuattencam());
                System.out.print("Nhap so kg can mua: ");
                qc.setcannang(sc.nextInt());
                System.out.println("Gia la: "+qc.giabancam());
                break;
            case 3:
                CamSanh cs=new CamSanh();
                System.out.println(""+cs.xuattencamsanh());
                System.out.print("Nhap so kg can mua: ");
                cs.setcannang(sc.nextInt());
                System.out.println("Gia la: "+cs.giabancamsanh());
                break;
            case 4:
                CamCaoPhong ccp=new CamCaoPhong();
                System.out.println(""+ccp.xuattencamcaophong());
                System.out.print("Nhap so kg can mua: ");
                ccp.setcannang(sc.nextInt());
                System.out.println("Gia la: "+ccp.giabancamcaophong());
                break;
            default:
                System.out.println("Ban da nhap sai! ");
        }
    }
}
