abstract class Figure {

 double  dim1,dim2;
 
 abstract void area();
}

class Rectangle extends Figure {
    void area(double d1, double d2){
        dim1 = d1;
        dim2 = d2;
       double a = dim1*dim2;
       System.out.println("Area" +a);
    }
}
class Triangle extends Figure {
    void area(double d1, double d2){
        dim1 = d1;
        dim2 = d2;
        double a = (dim1*dim2)/2;
        System.out.println("Area=" + a);
    }

}

public class AbstractDemo{
    public static void main(String[] args){
         Rectangle r1 = new Rectangle();
    r1.area(1.3 , 1.1);
    Triangle t1 = new Triangle();
    t1.area(12, 11);

    

    }

    
}