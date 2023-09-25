package labaratory_tasks_pt2.task2;

public class Storage {
    int  unitAmount;
    double costPerUnit;
    public Storage(){
        this.unitAmount = 0;
        this.costPerUnit =0;
    }
    public Storage(int unitAmount, double costPerUnit){
        this.unitAmount = unitAmount;
        this.costPerUnit = costPerUnit;
    }
    public void setUnitAmount(int unitAmount) {
        this.unitAmount = unitAmount;
    }

    public void setCostPerUnit(double costPerUnit) {
        this.costPerUnit = costPerUnit;
    }
    public double getTotalCost(){
        return unitAmount*costPerUnit;
    }
    public static int getTotalAmountOfUnits(Storage ... product){
        int unitsSum = 0;
        for (Storage p: product){
            unitsSum += p.unitAmount;
        }
        return unitsSum;
    }
}

