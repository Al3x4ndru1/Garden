package Garden;

public class Floare {
    private String name;
    private int NumberOfPlants;
    private float ToalCost;
    private float CostPerPlant;
    private float TotalProfit;
    private float ProfitPerplant;
    private int SoldPlants;

    private int RemainingPlants;

    private float Cash;

    public String GetName(){return this.name;}
    public int GetNumberOfPlants(){return this.NumberOfPlants;}

    public float GetToalProfit(){
        return this.TotalProfit;
    }

    public float GetCostPerPlat(){return this.CostPerPlant;}

    public int GetRemainingPlants(){return this.RemainingPlants;}

    public int GetSoldPlants(){ return this.SoldPlants;}

    public float GetPricePerPlat(){return this.CostPerPlant;}


    public float GetCash(){return this.Cash;}
    private Floare(FloareBuilder builder){

        this.name = builder.name;
        this.NumberOfPlants = builder.NumberOfPlants;
        this.ToalCost = builder.ToalCost;
        this.CostPerPlant = builder.CostPerPlant;
        this.ProfitPerplant = builder.ProfitPerplant;
        this.TotalProfit = builder.TotalProfit;
        this.SoldPlants = builder.SoldPlants;
        this.RemainingPlants= builder.RemainingPlants;
        this.Cash = builder.Cash;

    }

    public static class FloareBuilder{
        private String name;
        private int NumberOfPlants=0;
        private float ToalCost;
        private float CostPerPlant;
        private float TotalProfit;
        private float ProfitPerplant;
        private int SoldPlants;
        private int RemainingPlants;

        private float Cash;

        public FloareBuilder(String name, int NumberOfPlants, float cost, int remainingPlants, float Profit, float Chash,int Sold){

            this.name = name;
            this.NumberOfPlants = NumberOfPlants;
            this.ToalCost = cost * NumberOfPlants;
            this.CostPerPlant = cost;
            this.RemainingPlants = remainingPlants;
            this.TotalProfit = Profit;
            this.Cash = Chash;
            this.SoldPlants=Sold;

        }

        public FloareBuilder setProfit(int NumberOfplantsSold, float price){

            if(this.SoldPlants!=0) {
                this.RemainingPlants = this.RemainingPlants - NumberOfplantsSold;
                this.SoldPlants = this.SoldPlants + NumberOfplantsSold;
                this.Cash = Cash + (price * NumberOfplantsSold);
                this.TotalProfit = (this.Cash + (price * NumberOfplantsSold)) - this.ToalCost;
                this.ProfitPerplant = this.TotalProfit / this.SoldPlants;
            }
            else {
                this.SoldPlants = NumberOfplantsSold;
                this.TotalProfit = (price * NumberOfplantsSold) - this.ToalCost;
                this.ProfitPerplant = this.TotalProfit / this.SoldPlants;
                this.RemainingPlants = this.RemainingPlants - NumberOfplantsSold;
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
