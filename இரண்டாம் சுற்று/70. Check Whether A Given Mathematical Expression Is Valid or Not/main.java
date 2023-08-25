/*
input: 
(a+b)(a*b)
output: 
Valid

input:
(ab)(ab+)
output:
Invalid

input:
((a+b)
output:
Invalid
*/

import java.util.*;

public class Main{
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  int indx,len,brckt=0;
  String str;
  System.out.print("Enter the input: ");
  str = sc.nextLine();
  len=str.length();
  
  for(indx=0;indx<len;indx++){
      if(str.charAt(indx)=='(')
        brckt++;
      else if(str.charAt(indx)==')')
        brckt--;
      else if(str.charAt(indx)=='*'||str.charAt(indx)=='/'||str.charAt(indx)=='+'||str.charAt(indx)=='-'){
        if(str.charAt(indx-1)>=97 && str.charAt(indx-1)<=122 && str.charAt(indx+1)>=97 && str.charAt(indx+1)<=122)
            continue;
         else
             break;
    }
  }
  if(indx==len && brckt==0)
     System.out.print("Valid");
  else
     System.out.print("Invalid ");
 }
}
