package Garden;

public class Floare {
    private String name;
    private int NumberOfPlants;
    private float ToalCost;
    private float CostPerPlant;
    private float TotalProfit;
    private float ProfitPerplant;
    private int SoldPlants;


    public String GetName(){
        return this.name;
    }
    public int GetNumberOfPlants(){
        return this.NumberOfPlants;
    }

    public float GetToalProfit(){
        return this.TotalProfit;
    }
    private Floare(FloareBuilder builder){

        this.name = builder.name;
        this.NumberOfPlants = builder.NumberOfPlants;
        this.ToalCost = builder.ToalCost;
        this.CostPerPlant = builder.CostPerPlant;
        this.ProfitPerplant = builder.ProfitPerplant;
        this.TotalProfit = builder.TotalProfit;
        this.SoldPlants = builder.SoldPlants;

    }

    public static class FloareBuilder{
        private String name;
        private int NumberOfPlants=0;
        private float ToalCost;
        private float CostPerPlant;
        private float TotalProfit;
        private float ProfitPerplant;
        private int SoldPlants=0;

        public FloareBuilder(String name, int NumberOfPlants, float cost){

            this.name = name;
            this.NumberOfPlants = NumberOfPlants;
            this.ToalCost = cost;
            this.CostPerPlant = cost/NumberOfPlants;

        }

        public FloareBuilder setProfit(int NumberOfplants, float price){

            if(this.SoldPlants!=0) {
                this.SoldPlants = this.SoldPlants + NumberOfplants;
                this.TotalProfit = (this.TotalProfit + (price * NumberOfplants)) - this.ToalCost;
                this.ProfitPerplant = this.TotalProfit / this.SoldPlants;
            }
            else {
                this.SoldPlants = NumberOfplants;
                this.TotalProfit = (price * NumberOfplants) - this.ToalCost;
                this.ProfitPerplant = this.TotalProfit / this.SoldPlants;
            }

            return this;
        }

        public FloareBuilder setCost(int NumberOfPlants, float newcost){

                this.NumberOfPlants = this.NumberOfPlants + NumberOfPlants;
                this.ToalCost = this.ToalCost + newcost;
                this.CostPerPlant = this.ToalCost / this.NumberOfPlants;

            return this;
        }

        public Floare build(){
            return new Floare(this);
        }
    }
}
