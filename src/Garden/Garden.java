package Garden;

import Garden.FactoryClass;

import java.util.HashMap;

import static Garden.FactoryClass.GetHashMap;
import static Garden.FactoryClass.GetObj;
import static Garden.Floare.FloareBuilder.*;

public class Garden {

    public static void main(String[] args){
        new FactoryClass("Lalele",145, 1.4f);



        HashMap<String,Floare> a = GetHashMap();
        Floare b = a.get("Lalele");

        System.out.println(b);
        System.out.println(a);

        new FactoryClass("Mere",100,5.10f);
        a = GetHashMap();
        System.out.println(a);


        Floare fl = GetObj("Lalele");

        System.out.println("Name of the plant:" + '\t' + fl.GetName());
        System.out.println("Number of the plants:" + '\t' +fl.GetNumberOfPlants());
        System.out.println("Total Profit:" + '\t' +fl.GetToalProfit());
        System.out.println("Profit per plant:" + '\t' +fl.GetCostPerPlat());
        System.out.println("Number of plants Sold:" + '\t' + fl.GetSoldPlants());
        System.out.println("Remaining plants:" + '\t' + fl.GetRemainingPlants());
        System.out.println("Total Profit:" + '\t' +fl.GetToalProfit());

        System.out.println('\n');

        new FactoryClass("Lalele", 1.4f, 50, 5.7f);
        fl = GetObj("Lalele");
        System.out.println("Name of the plant:" + '\t' + fl.GetName());
        System.out.println("Number of the plants:" + '\t' +fl.GetNumberOfPlants());
        System.out.println("Remaining plants:" + '\t' + fl.GetRemainingPlants());
        System.out.println("Number of plants Sold:" + '\t' + fl.GetSoldPlants());
        System.out.println("Cash:" + '\t' + fl.GetCash());
        System.out.println("Total Profit:" + '\t' +fl.GetToalProfit());
        System.out.println("Profit per plant:" + '\t' +fl.GetCostPerPlat());
        System.out.println("Cost per plant:" + '\t' + fl.GetPricePerPlat());

        System.out.println('\n');

        new FactoryClass("Lalele", 1.4f, 51, 5.7f);
        fl = GetObj("Lalele");
        System.out.println("Name of the plant:" + '\t' + fl.GetName());
        System.out.println("Number of the plants:" + '\t' +fl.GetNumberOfPlants());
        System.out.println("Remaining plants:" + '\t' + fl.GetRemainingPlants());
        System.out.println("Number of plants Sold:" + '\t' + fl.GetSoldPlants());
        System.out.println("Cash:" + '\t' + fl.GetCash());
        System.out.println("Total Profit:" + '\t' +fl.GetToalProfit());
        System.out.println("Profit per plant:" + '\t' +fl.GetCostPerPlat());
        System.out.println("Cost per plant:" + '\t' + fl.GetPricePerPlat());
    }


}
