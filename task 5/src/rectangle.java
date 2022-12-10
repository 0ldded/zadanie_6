public class rectangle extends Shape
{
    protected double width;
    protected double length;

    public rectangle(){}
    public rectangle (Double width, Double length)
    {
        this.length = length;
        this.width=width;
    }
    public rectangle(Double width, Double length, String color, Boolean filled)
    {
        this.length = length;
        this.width=width;
        this.color=color;
        this.filled=filled;
    }


    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }

    public Double getArea() {
        return length*width;
    }
    public Double getPerimetr() {
        return length+width;
    }
    public String toString() {
        return "Ширина: " + width + ";  Длина: " + length + "; Цвет: " + color + "; Заполненый: " + filled;
    }
}
