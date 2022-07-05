/*
i/p:
9923

o/p:
Nine Thousand Nine Hundred and Twenty Three
*/

import java.util.Scanner;

public class numbsToWords {

    static String[] tens = {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    static String[] ones = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven",
                            "Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};

    public static String numberToWords(int num) {

        if(num == 0)
            return "zero";
        else
            return helper(num);
    }

    public static String helper(int num) {

        if(num>=1000000000) return (helper(num/1000000000) + " Billion " + helper(num%1000000000));
        if(num>=1000000) return (helper(num/1000000) + " Million " + helper(num%1000000));
        if(num>=1000) return (helper(num/1000) + " Thousand " + helper(num%1000));
        if(num>=100) return (helper(num/100) + " Hundred and " + helper(num%100)).trim();
        if(num>=20) return (tens[num/10]) + " " + helper(num%10).trim();
        return ones[num];
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        System.out.print(numberToWords(num));
    }
}
