package Task4_05;

public class MyArea {
    final double PI = 3.14;
    static void areaOfCircle(double radius){
        MyArea pi=new MyArea();
        double square=pi.PI*Math.pow(radius, 2);
        // якщо оголосимо PI як final static, то можемо звертатись
        // без використання об'єкту класа
        System.out.println("Square of circle = "+square);

    }
}
