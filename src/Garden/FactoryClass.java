package Garden;

import java.util.HashMap;

public class FactoryClass{
    private static HashMap<String,Floare> storage = new HashMap<>();

    public FactoryClass(String name, int NumberOfPlants, float cost){
            storage.put(name, new Floare.FloareBuilder(name,NumberOfPlants,cost,NumberOfPlants,0,0,0).build());
    }


    public FactoryClass(String name, float cost, int NumberOfplantsSold, float price){
        Floare fl = storage.get(name);
        int NumberOfPlants = fl.GetNumberOfPlants();
        int RemainingPlants = fl.GetRemainingPlants();
        float Profit = fl.GetToalProfit();
        float Cash = fl.GetCash();
        int Sold = fl.GetSoldPlants();
        storage.replace(name, new Floare.FloareBuilder(name,NumberOfPlants,cost,RemainingPlants,Profit,Cash,Sold).setProfit(NumberOfplantsSold,price).build());

    }

    public static HashMap<String,Floare> GetHashMap(){
        return storage;
    }

    public static Floare GetObj(String name){
        return storage.get(name);
    }
}
