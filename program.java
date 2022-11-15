package package_p3;

public class car {
    int car_model;
    double car_price;
    car(int model,double price)
    {
        car_model=model;
        car_price=price;
    }
    void print()
    {
        System.out.println("car model="+car_model+"car price="+car_price);
    }
}
class car_demo
{
    public static void main(String args[])
    {
        car obj=new car(123,34567899.90);
        obj.print();
    }
}
