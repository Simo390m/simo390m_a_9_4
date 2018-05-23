package IV;

public class main
{
    public static void main(String[] args)
    {
        Car myCar = new Car();
        Truck myTruck = new Truck();
        MonsterTruck myMonster = new MonsterTruck();

        System.out.println(myCar);
        myCar.m1();
        myCar.m2();
        System.out.println(myTruck);
        myTruck.m1();
        myTruck.m2();
        myMonster.m1();
        myMonster.m2();
        System.out.println(myMonster);

    }
}
