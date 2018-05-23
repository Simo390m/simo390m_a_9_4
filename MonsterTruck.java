package IV;

public class MonsterTruck extends Truck
{
    public void m1 ()
    {
        System.out.println("monster 1 ");
    }

    @Override
    public void m2()
    {
        super.m1();
        super.m2();

    }

    @Override
    public String toString()
    {
        return "monster " + super.toString();
    }
}
