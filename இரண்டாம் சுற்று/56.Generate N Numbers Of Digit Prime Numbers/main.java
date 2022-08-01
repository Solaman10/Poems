/*
A Digit prime number is whose sum of digit is also prime number. Ex: 41 is a digit prime number., becoz, 4+1=5 and 5 is a prime number. 17 is not a prime number.,
bcoz, 1+7=8 and 8 is not a prime number. 997 also digit prime, 9+9+7=25 -> 2+5=7 and 7 is prime number.

i/p:
Enter the size of how many digit prime numbers you want: 6

o/p:
2 3 5 7 11 23
------------------
i/p:
Enter the size of how many digit prime numbers you want: 10

o/p:
2 3 5 7 11 23 29 41 43 47
*/

import java.util.Scanner;

public class dgtPrmNumbr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size,prmNum=2,ind,dgtPrm=0,rem=0,sum=0,fnlSum=0,fnlRem=0;
        System.out.printf("Enter the how many numbers you want: ");
        size = sc.nextInt();

        while(size>=1)
        {
            for(ind=2;ind<prmNum;ind++)
            {
                if(prmNum%ind==0)
                    break;
            }
            if(ind==prmNum)
            {
                dgtPrm = prmNum;
                while(dgtPrm!=0)
                {
                    rem=dgtPrm%10;
                    sum+=rem;
                    dgtPrm/=10;
                }
                while(sum!=0)
                {
                    fnlRem=sum%10;
                    fnlSum+=fnlRem;
                    sum/=10;
                }

                if(fnlSum == 2||fnlSum == 3||fnlSum == 5||fnlSum == 7)
                {
                    System.out.printf("%d ",prmNum);
                    --size;
                }
                sum=0;
                rem=0;
                fnlRem=0;
                fnlSum=0;
            }
            ++prmNum;
        }
    }
}
