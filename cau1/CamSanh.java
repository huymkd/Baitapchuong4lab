package Cau1;

public class CamSanh extends QuaCam {
    public String xuattencamsanh(){
        return ten="Cam Sanh`";
    }
    public double giabancamsanh(){
        super.setgiaban(45000);
        return this.getgiaban()*this.getcannang();
    }
}
