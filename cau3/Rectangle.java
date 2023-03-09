package cau3;

public class Rectangle extends Shape {
    private double width;
    private double length;
    public Rectangle(){
        this.width=1.0;
        this.length=1.0;
    }
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
    super.getcolor();
    super.setfilled(filled);
    this.length=length;
    this.width=width;
    }

    public double getwidth() {
        return this.width;
    }

    public void setwidth(double width) {
        this.width = width;
    }

    public double getlength() {
        return this.length;
    }

    public void setlength(double length) {
        this.length = length;
    }
    public double getarea(){
        return width*length;
    }
    public double perimeter(){
        return 2*( length + width );
    }
    @Override
    public String toString(){
        return "Shape{width"+width+",length"+ length +",color"+this.getcolor()+",fille"+this.isfilled()+"}";
    }
}
