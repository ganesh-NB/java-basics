import java.util.*;
public class linear{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter value  of n");
    int n=sc.nextInt();
    int numbers[]=new int[n];
    System.out.println("Enter your numbers");
    // input
    for(int i=0;i<n;i++){
         numbers[i]=sc.nextInt();
    }
    System.out.println("enter value to search");
    int x=sc.nextInt();

    //output
    for(int i=0;i<n;i++){
        if(x==numbers[i]){
            System.out.println(" found at"+i);
        }
    }

    }
}
