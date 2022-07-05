import java.util.HashMap;
import java.util.Scanner;

public class gramPro {
    public static void main(String[] args) {
        int i,j,mid=0,k,count=0,len=0,temp;
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        mid=(0+str.length()-1)/2;
        len = str.length();
        char[] ans = new char[len];

        for(i=0;i<len;i++) 
        {
            ans[i] = str.charAt((mid + i) % len);

            for (k = len - 1; k > i; k--) 
            {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++)
            {
                System.out.print(ans[j]);
            }
            System.out.println();
        }
    }
}
