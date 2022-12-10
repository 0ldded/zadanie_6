public class Square extends rectangle
{
    public Square(){}
    public Square(Double side)
    {
        width=side;
        length=side;
    }
    public Square(Double side, String color, Boolean filled)
    {
        this.length = side;
        this.width=side;
        this.color=color;
        this.filled=filled;
    }

    public double getSide() {return width;}
    public void setSide(double side)
    {
        length =side;
        width=side;
    }

    public void setLength(double length) {
        this.length=length;
        this.width= length;
    }
    public void setWidth(double width) {
        this.length= width;
        this.width= width;
    }
    public String toString()
    {
        return "Длина стороны: " + length + "; Цвет: " + color + "; Заполненый: " + filled;
    }
}
