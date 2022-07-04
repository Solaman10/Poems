/*
i/p:
10101
11100

o/p:
110001
*/

import java.util.Scanner;

public class sumOfTwoBinaries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int binary1, binary2;
        binary1 = sc.nextInt();
        binary2 = sc.nextInt();
        int[] sum = new int[20];
        int ind=0, carry=0;

        while(binary1 != 0 || binary2 != 0)
        {
            sum[ind++] = (binary1%10+binary2%10+carry)%2;
            carry = (binary1%10+binary2%10+carry)/2;
            binary1 = binary1/10;
            binary2 = binary2/10;

            if(carry!=0)
                sum[ind]=carry;
        }

        while(ind>=0)
            System.out.print(sum[ind--]);
    }
}
