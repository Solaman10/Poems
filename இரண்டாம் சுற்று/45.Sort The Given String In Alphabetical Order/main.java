/*
i/p:
computer

o/p:
cemoprtu
----------------------------
i/p:
qwertyuiopasdfghjklzxcvbnm

o/p:
abcdefghijklmnopqrstuvwxyz
*/

import java.util.Scanner;

public class sortStrngByAlphabeticalOrder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String strng;
        strng = sc.nextLine();
        int i,j;
        char[] arr = strng.toCharArray();

        for(i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]);
        }
    }
}
