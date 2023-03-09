package cau3;

public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getside() {
        return super.getwidth();
    }

    public void setside(double side) {
        super.setwidth(side);
        super.setlength(side);
    }

    public void setwith(double side) {
        super.setwidth(side);
    }

    @Override
    public void setlength(double side) {
        super.setwidth(side);
    }

    /**
     *
     * @return
     */
    @Override
    public double getarea() {
        return this.getside() * this.getside();
    }

    @Override
    public String toString() {
        return "Square{side" + this.getside() + ",color" + this.getcolor() + ",filled" + this.isfilled() + "}";
    }
}
