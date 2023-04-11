package week4.examreview;

public class Bolt {

    private double diameterInches;
    private double lengthInches;

    public static final double LBS_MULTIPLIER = 0.05;
    public static final double USD_MULTIPLIER = 1.00;

    public Bolt(double diameterInches, double lengthInches){
        this.diameterInches = diameterInches;
        this.lengthInches = lengthInches;
    }

    public double getCost(){
        return 0;
    }

    public String getName(){
        return "Bolt";
    }

    public double getWeight(){
        return 0.0;
    }

    public void printBillOfMaterials(){
        System.out.println("Bill of Materials");
    }

    @Override
    public boolean equals(Object o){
        if(o == null){
            return false;
        }

        if(!(o instanceof Bolt)){
            return false;
        }

        if(o == this){
            return true;
        }

        Bolt compare = (Bolt)o;

        return this.getName().equals(compare.getName());

    }

}
