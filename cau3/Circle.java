package cau3;

public class Circle extends Shape {
    private double radius;
    public Circle(){
        super();
        this.radius=1.0;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle (String color, double radius, boolean filled){
        super.setfilled(filled);
        super.getcolor();
        this.radius=radius;
    }
    public double getradius(){
        return this.radius;
    }
    public void setradius(double radius){
        this.radius=radius;
    }
    public double getarea(){
        return radius*radius*Math.PI;
    }
    public double getperimter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{radius=" + radius + ",color" + this.getcolor() + ",filled"+ this.isfilled() + "}";
        
    }
}
