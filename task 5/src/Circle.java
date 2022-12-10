public class Circle extends Shape
{
    protected Double radius;

    public Circle(){}
    public Circle(Double radius)
    {
        this.radius=radius;
    }
    public Circle(Double radius,String color, Boolean filled)
    {
        this.radius=radius;
        this.filled=filled;
        this.color=color;
    }

    public Double getRadius() { return radius; }
    public void setRadius(Double radius) { this.radius = radius; }

    public Double getArea() {
        return radius * radius * 3.14;
    }
    public Double getPerimetr() {
        return 2*radius*3.14;
    }
    public String toString() {
        return "Радиус: " + radius + "; Цвет: " + color + "; Заполненый: " + filled;
    }
}

