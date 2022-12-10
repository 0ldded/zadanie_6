public abstract class Shape
{
    protected String color;
    protected Boolean filled;

    public Shape(){};
    public Shape(String color, Boolean filled)
    {
        this.color = color;
        this.filled=filled;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
    public void setFilled(Boolean filled)
    {
        this.filled = filled;
    }

    public Boolean isFilled()
    {
        return filled;
    }
    public String getColor()
    {
        return color;
    }

    public abstract Double getArea();
    public abstract Double getPerimetr();
    public abstract String toString();
}