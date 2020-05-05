package classandmethodExample;

public class Loans {
    public int calculateMartgage(int month,int monthlyPaymnet){
        int result =monthlyPaymnet*(360-month);
        return result;
    }
    public double calculateCarInsurance(int carPrice,int months){
        double insurance=(carPrice/months)*0.9-months;
        return insurance;
    }


}
