public class ElectricityBill {
   private String depName;
    private double ConsumedUnits;
    private static double TotalBill=0;

    public ElectricityBill(String depName,double ConsumedUnits){
        setDepName(depName);
        setConsumedUnits(ConsumedUnits);
        DevelopElectricityBill();
    }

    public ElectricityBill() {

    }

    public void setDepName(String depName){
        this.depName=depName;

    }
    public String getsetDepName(){
        return depName;
    }
    public void setConsumedUnits(double ConsumedUnits){
        this.ConsumedUnits=ConsumedUnits;
    }
    public double getConsumedUnits(){
        return ConsumedUnits;
    }
    public void DevelopElectricityBill(){
        double ElectricityBill;
        if(ConsumedUnits>0 && ConsumedUnits<=100){
            ElectricityBill=50.5 * ConsumedUnits;
            System.out.println("The units consumed by the department are: "+ElectricityBill);
            TotalBill+=ElectricityBill;
        }
        else if(ConsumedUnits>100 && ConsumedUnits<=200){
                ElectricityBill=100 * 50.5;
                ElectricityBill+=(ConsumedUnits-100)*64.5;
            System.out.println("The units consumed by the department are: "+ElectricityBill);
                TotalBill+=ElectricityBill;
            }
            else if(ConsumedUnits>200){
                ElectricityBill=200 * 64.5;
                ElectricityBill+=(ConsumedUnits-200)*75.5;
            System.out.println("The units consumed by the department are: "+ElectricityBill);
                TotalBill+=ElectricityBill;
            }

        }
        public static double getTotalBill(){
            return TotalBill;
    }
        public static void  setTotalBill( double TotalBill){
            ElectricityBill.TotalBill = TotalBill;
    }

}

