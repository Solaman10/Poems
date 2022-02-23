/*
i/p: str1 : aabbccddee
     str2 : ffgghhiijj
o/p: true


i/p: str1 : abbcccddddeeeee
     str2 : ffgghhhiiiijjjjj
o/p: false
*/



import java.util.Scanner;

public class RplceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a1 = new String();
        String a2 = new String();
        Scanner sca = new Scanner(System.in);
        a1 = sc.nextLine();
        a2 = sca.nextLine();
        int i, j, count = 0, count2 = 0, flag = 0;

        if (a1.length() != a2.length()) {
            System.out.println("false");
        }
        else if (a1.length() == a2.length()) {
            for (i = 0; i < a1.length(); i++) {
                for (j = i + 1; j < a2.length(); j++) {
                    if (a1.charAt(i) == a1.charAt(j)) {
                        ++count;
                        if (a2.charAt(i) == a2.charAt(j)) {
                            ++count2;
                            if (count == count2) {
                                flag = 1;
                            } else {
                                flag = 2;
                            }
                        }
                    }


                }
            }
            if (flag == 1) {
                System.out.println("true");
            } else if (flag == 2) {
                System.out.println("false");
            }
        }
    }
}
