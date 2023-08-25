/*
input:
ABC
output:
A
AB
ABC
AC
ACB
B
BA
BAC
BC
BCA
C
CA
CAB
CB
CBA
(Similar like following output, but every word is printed in ascending order:
  A
  B C
  AB AC BA BC CA CB
  ABC ACB BCA BAC CBA CAB )
-------------------------------------------------------------------------------------
input:
ABCD
output:
A
AB
ABC
ABCD
ABD
ABDC
AC
ACB
ACBD
ACD
ACDB
AD
ADB
ADBC
ADC
ADCB
B
BA
BAC
BACD
BAD
BADC
BC
BCA
BCAD
BCD
BCDA
BD
BDA
BDAC
BDC
BDCA
C
CA
CAB
CABD
CAD
CADB
CB
CBA
CBAD
CBD
CBDA
CD
CDA
CDAB
CDB
CDBA
D
DA
DAB
DABC
DAC
DACB
DB
DBA
DBAC
DBC
DBCA
DC
DCA
DCAB
DCB
DCBA
*/

import java.util.TreeSet;
import java.util.Iterator;

public class allPermutationsOfGvnString {

    static TreeSet<String> set = new TreeSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // String str = "ABCD";
        generatePermutationsAndCombinations(str);

        Iterator itr = set.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }

    public static void generatePermutationsAndCombinations(String str) {
        int len = str.length();

        for (int i = 0; i < Math.pow(2, len); i++) {
            StringBuilder permutation = new StringBuilder();

            for (int j = 0; j < len; j++)
                if ((i / (int)Math.pow(2, j)) % 2 == 1)
                    permutation.append(str.charAt(j));

            addPermutation("", permutation.toString());
        }
    }


    public static void addPermutation(String prefix, String remaining) {
        int len = remaining.length();

        if (len == 0) {
            set.add(prefix);
            return;
        }

        for (int i = 0; i < len; i++)
            addPermutation(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1, len));
    }
}
