package Garden;

import java.util.HashMap;

public class FactoryClass{
    private static HashMap<String,Floare> storage = new HashMap<>();

    public FactoryClass(String name, int NumberOfPlants, float cost){
            storage.put(name, new Floare.FloareBuilder(name,NumberOfPlants,cost).build());
    }


    public FactoryClass(String name, int NumberOfPlants, float cost, int NumberOfplants, float price){

        storage.replace(name, new Floare.FloareBuilder(name,NumberOfPlants,cost).setProfit(NumberOfplants,price).build());

    }

    public static HashMap<String,Floare> GetHashMap(){
        return storage;
    }

    public static Floare GetObj(String name){
        return storage.get(name);
    }
}
