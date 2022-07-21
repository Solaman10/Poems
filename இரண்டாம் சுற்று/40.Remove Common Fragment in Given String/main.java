/*
i/p:
Every morning I want to do exercise regularly
Every morning I want to do meditation without fail
It is important that I want to be happy always

o/p:
Every morning do exercise regularly
Every morning do meditation without fail         // common fragment: I want to    -> is removed
It is important that be happy always
*/

import java.io.*;
import java.util.*;

public class rmveCmnFrgmnt{
    public static void main(String args[]){
        String s1 = "Every morning I want to do exercise regularly";
        String s2 = "Every morning I want to do meditation without fail";
        String s3 = "It is important that I want to be happy always";
        String[] words1=s1.split("\\s");
        String[] words2=s2.split("\\s");
        String[] words3=s3.split("\\s");

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<words1.length;i++) {
            for(int j=0;j<words2.length;j++) {
                for(int k=0;k<words3.length;k++) {
                    if(words1[i].equals(words2[j]) && words2[j].equals(words3[k]) && words3[k].equals(words1[i])) {
                        //Concatenating the returned Strings
                        sb.append(words1[i]+" ");
                    }
                }
            }
        }

        System.out.println(s1.replaceAll(sb.toString(), ""));
        System.out.println(s2.replaceAll(sb.toString(), ""));
        System.out.println(s3.replaceAll(sb.toString(), ""));
    }
}
