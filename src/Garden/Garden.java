package Garden;

import Garden.FactoryClass;

import java.util.HashMap;

import static Garden.FactoryClass.GetHashMap;
import static Garden.FactoryClass.GetObj;
import static Garden.Floare.FloareBuilder.*;

public class Garden {

    public static void main(String[] args){
        new FactoryClass("Lalele",145, 340.4f);



        HashMap<String,Floare> a = GetHashMap();
        Floare b = a.get("Lalele");

        System.out.println(b);
        System.out.println(a);

        new FactoryClass("Mere",100,500.10f);
        a = GetHashMap();
        System.out.println(a);


        Floare fl = GetObj("Lalele");

        System.out.println(fl.GetName());
        System.out.println(fl.GetNumberOfPlants());
        System.out.println(fl.GetToalProfit());

        new FactoryClass("Lalele",145, 340.4f, 50, 150);
        fl = GetObj("Lalele");
        System.out.println(fl.GetName());
        System.out.println(fl.GetNumberOfPlants());
        System.out.println(fl.GetToalProfit());
    }


}
