import java.util.Scanner;
public class TimeConversion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Seconds");
        int totalsecounds = sc.nextInt();

        int hour= totalsecounds / 3600;
        int remainingseconds= totalsecounds%3600;
        int minutes= remainingseconds/60;
        int secounds= remainingseconds%60;

        System.out.println("Hour= "+hour);
        System.out.println("Minute= "+minutes);
        System.out.println("Secound= "+secounds);
        sc.close();
    }
}
        

