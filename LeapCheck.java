import java.util.Scanner;
public class LeapCheck {
    public static void IsLeap(int x){
        if(x % 4 == 0){
            if(x % 100 == 0){
                if(x % 400 == 0){
                    System.out.println("Leap Year");
                }else{
                    System.out.println("Normal Year");
                }
            }else{
                System.out.println("Leap Year");
            }
        }else{
            System.out.println("Normal Year");
        }
    }

    public static void main(String[] args) {
        while(true){
            System.out.print("Year: ");
            Scanner x = new Scanner(System.in);
            int year = x.nextInt();
            IsLeap(year);
            System.out.println("-----------------------");
        }
    }
}
