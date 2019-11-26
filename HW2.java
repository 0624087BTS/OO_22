interface Shape{
    abstract double getArea();
}
class Rectangle implements Shape{
    double length,width;
    public Rectangle(double l ,double w){
        length=l;
        width=w;
    }
     public double getArea(){
        return length*width;
    }
    public String toString(double n){
        return "Rectangle's area ="+n;
    }
}
class Triangle implements Shape{
    double base,height;
    public Triangle(double b ,double h){
        base=b;
        height=h;
    }
    public double getArea(){
        return base*height/2;
    }
    public String toString(double n){
        return "Triangle's area ="+n;
    }
}
public class Main{
    public static void main(String arg[]){
        Rectangle rec=new Rectangle(5,10);
        System.out.println(rec.toString(rec.getArea()));
        Triangle tri=new Triangle(10,10);
        System.out.println(tri.toString(tri.getArea()));
    }
}
