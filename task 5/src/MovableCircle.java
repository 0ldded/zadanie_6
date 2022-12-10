public class MovableCircle implements movable
{

    private MovablePoint center;
    private double radius;

    public MovableCircle (int x, int y, int radius)
    {
        center = new MovablePoint(x, y);
        this.radius=radius;
    }
    public void sdvig() {
        System.out.println("Двигаем круг");
    }
}
