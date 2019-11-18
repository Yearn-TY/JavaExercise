
public class CelsiusTemperatureTable {
    public static void main(String[] main){
        System.out.println("Fahreheit\t\tCelsius");
        System.out.println("===============================");
        for(int i=0;i<=20;i++){
            double c = 5.0/9*(i-32.0);
            System.out.printf("%d\t\t\t%.2f\n",i,c);
        }
    }
}
