package createclass;

public class RoadBike extends BicycleParent {
    public int tireSize;
    public String handleBar;

    public RoadBike(int gear,int speed,int tireSize,String handleBar){
        super(gear,speed);
        this.tireSize= tireSize;
        this.handleBar = handleBar;

    }
    public void changeTireSize(int newTire){

    }


    public String toString(){
        return (super.toString()+
        "\n tire size "+this.tireSize+ "\n handle Bar "+this.handleBar );

    }
}
