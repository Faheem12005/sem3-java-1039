import java.util.Scanner;
public class Largest3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ;i++){
            arr[i] = scanner.nextInt();
        
        }
        boolean swapped;
        for(int i=0;i<n-1;i++){
            swapped = false;
            for(int j=0; j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
        if(arr.length>=3){
            System.out.println(arr[2]);
        }
        scanner.close();
    }    
}

