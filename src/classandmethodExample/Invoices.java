package classandmethodExample;

public class Invoices {
    public String evaluateElectric(int consumption) {
        String result = "";
        if (consumption > 500 && consumption < 1000) {
            result = "Good Job";
        } else if (consumption >= 1000 && consumption < 1500) {
            result = "Not Bad";

        } else if (consumption >= 1500) {
            result = "Start to save Energy";
        } else {
            System.out.println("Consumption is out of scope");
        }
        return result;
    }
    public String evaluateInternet(int speed){
        String result="";
        if(speed>300){
            result=" Good speed";

        }
        else if(speed>100){
            result=" Super good";

        }
        else{
            result="speed of scope";

        }
        return result;
    }
}
