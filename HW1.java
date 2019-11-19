abstract class Cshape{
    protected String color;
    public void setcolor(String str){
        color=str;
    }
    public abstract viod show();
}
class CTriangle extrends Cshape{
    protected double a,b,c;
    public CTriangle(double a,double b,double c){
        a=a;
        b=b;
        c=c;
    }
    public void show(){
        system.out.print("color="+color+",");
        system.out.println("area="+0.5*a*b);
    }
}
public class Hw1{
    public static void main(String args[]){
        CTriangle t1 =new CTriangle(3,4,5);
        t1.setcolor("red");
        t1.show();
    }
}