import java.util.Scanner;
class car
{
    long price;
    string brand;
    string model;
    car()
    {
        brand = Tata ;
         System.out.println(brand);
        model = punch EV;
         System.out.println(model);
         price = 1200000;
         System.out.println(price);
    }
    car(long price)
    {
        this price = price;
        System.out.println(price);
    }
    car(string brand){
        this brand = brand;
        System.out.println(brand);
    }
    car(string model;long price)
    {
        this model = model;
        System.out.println(model);
        this price = price;
        System.out.println(price);
    }
    car(string brand;string model)
    {
        this brand = brand;
        System.out.println(brand);
        this model = model;
        System.ou.println(model);
    }
    car(string brand;string model;long price)
    {
        this brand = brand;
        System.out.println(brand);
        this model = model;
        System.out.println(model);
        this price = price;
        System.out.println(price);
    }
    public static void main (string [] agr)
    {
        car a = new car();
        car b = new car(benz);
        car c = new car(8000000);
        car d = new car(kia;1400000);
        car e = new car(Tata;punch);
        car f = new car(kia;EV;2300000);
    }
}