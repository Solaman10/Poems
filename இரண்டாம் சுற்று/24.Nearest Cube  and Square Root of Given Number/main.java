/*
i/p: 
18
o/p:
3

i/p:
87
o/p:
4
*/


import java.util.Scanner;

public class nearstCubeRoot {
    public static void main(String[] args) {

        int numbs = 1, preCub = 0, postCub = 0, preSqre=0, postSqre=0, difrnc1=0, difrnc2=0, num, i;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (i = numbs; i < num * 2;i=numbs*numbs*numbs)
        {
            if (i < num)
            {
                preCub = i;
                preSqre=numbs;
                ++numbs;
                postSqre=numbs;
            }
            if (i > num)
            {
                postCub = i;
                break;
            }
        }
        difrnc1=num-preCub;
        difrnc2=postCub-num;
        if(difrnc1<difrnc2)
            System.out.println(preSqre);
        else
            System.out.println(postSqre);
    }
}
