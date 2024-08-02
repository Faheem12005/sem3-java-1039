import java.util.Scanner;
public class Program3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int gcd = 0;
        for(int i=2;i<=a && i<=b; i++){
            if(a%i == 0 && b%i ==0 ){
                gcd = i;
            }
        }
        int lcm = a*b/gcd;
        System.out.println("The lcm of " + a + " and " + b + " is " + lcm);
        scanner.close();
    } 
}
