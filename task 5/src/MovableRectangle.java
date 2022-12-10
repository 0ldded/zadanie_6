public class MovableRectangle implements movable
{
    MovablePoint topLeft, bottomRight;
    int speedX, speedY;
    void checkSpeed()
    {
        if(speedY != speedX)
        {
            speedY = speedX;
        }
    }
    MovableRectangle(int x1, int y1, int x2, int y2, int speedX, int speedY)
    {
        topLeft = new MovablePoint(x1,y1);
        bottomRight = new MovablePoint(x2, y2);
        this.speedX =speedX;
        this.speedY=speedY;
        checkSpeed();
    }

    @Override
    public void sdvig(){ System.out.println("Двигаем пряумогольник");}
}
