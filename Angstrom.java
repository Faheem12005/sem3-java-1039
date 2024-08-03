import java.util.Scanner;

public class Angstrom{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int ognum = num;
    int check = 0;
    while(num!=0){
      int a = num%10;
      check = check + (a*a*a);
      num = num / 10;
    }
    System.out.println(check);
    if(check == ognum){
      System.out.println("The number is an angstrom number");
    }
    scanner.close();
  }
}