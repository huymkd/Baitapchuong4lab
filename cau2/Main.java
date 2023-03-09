package cau2;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle=new Bicycle();
        System.out.println(""+bicycle.xuattenbicycle());
        System.out.println("Mau`: "+bicycle.colorbicycle());
        System.out.println("Chay: "+bicycle.run());
        
        Car car=new Car();
        System.out.println(""+car.xuattencar());
        System.out.println("Mau`: "+car.colorcar());
        System.out.println("Model: "+car.model());
        System.out.println("chay: "+car.run());
    }
}
