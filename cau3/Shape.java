package cau3;

public class Shape {
    private String color="red";
    private boolean filled=true; 
    public void shape(){
        
    }
    public void shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String getcolor(){
        return this.color;
    }
    public void setcolor(String color){
        this.color=color;
    } 
    public boolean isfilled(){
        return this.filled;
    }
    public void setfilled(boolean filled){
        this.filled=filled;
    }
    @Override
    public String toString() {
        return "Shape{color=" + color + ", filled=" + filled + "}";  
    }
}
