import static java.lang.System.out;

public class test
{
    public static void main(String[] args)
    {
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1.getPerimetr());// which version?
        System.out.println(s1.getArea());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimetr());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        Shape s3 = new rectangle(1.0, 2.0, "RED", false);//
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimetr());
        System.out.println(s3.getColor());

        rectangle r1 = (rectangle)s3; //downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);//Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());

        rectangle r2 = (rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getLength());
// Downcast Rectangle r2 к Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

        movable a = new MovableCircle();
        a.sdvig();

    }
}
