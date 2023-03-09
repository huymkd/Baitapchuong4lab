package Cau1;

public class HoaQua {
    public String ten;
    public String nguongoc;
    public String xuatxu;
    public int ngaynhap;
    private double giaban;
    private int soluong;
    private int cannang;
    public void xuatten(){
        System.out.println(""+ten+"");
    }
    public double getgiaban(){
        return this.giaban;
    }
    public void setgiaban(double giaban){
        this.giaban=giaban;
    }
    public int getsoluong(){
        return this.soluong;
    }
    public void setsoluong(int soluong){
        this.soluong=soluong;
    }
    public double getcannang(){
        return this.cannang;
    }
    public void setcannang(int cannang){
        this.cannang=cannang;
    }
}
