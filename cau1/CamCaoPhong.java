package Cau1;

public class CamCaoPhong extends QuaCam{
    public String xuattencamcaophong(){
        return ten="Cam Cao Phong";
    }
    public double giabancamcaophong(){
        super.setgiaban(25000);
        return this.getgiaban()*this.getcannang();
    }
}
