import com.sun.nio.sctp.SctpMultiChannel;

import java.util.ArrayList;
import java.util.Scanner;

public class sumOfArrElemntsWithGivnMultipleLngth {
    public static void main(String[] args) {

        int length, tempLength, sum = 0, i,n;
      
        System.out.print("Enter the size of array: ");
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
      
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        System.out.print("Enter the Elements: ");
        for(i=0;i<n;i++) {
            arr.add(input.nextInt());
        }

        Scanner sca = new Scanner(System.in);
        System.out.print("Enter the Range Interval: ");
        length = sca.nextInt();
        tempLength=length;

        for(i=0;i<n;i++) {
            if(tempLength!=0) {
                tempLength--;
                sum+=arr.get(i);
            }
            if(tempLength==0 || i==n-1) {
                System.out.print(sum + " ");
                tempLength=length;
                sum=0;
            }
        }
    }
}




