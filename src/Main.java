public class Main {
    public static void main(String[] args){
        BmiService service = new BmiService();
        double bmi = service.calculate(86.6,1.86);
        System.out.println (bmi);
    }
}
