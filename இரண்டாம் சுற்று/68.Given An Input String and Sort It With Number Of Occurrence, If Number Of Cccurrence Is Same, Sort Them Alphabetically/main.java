/*
i/p:
ZOHO
o/p:
OOHZ

i/p:
CORPORATION
o/p:
OOORRACINPT
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(sortString(input));
    }

    public static String sortString(String input) {
        int[] count = new int[26]; // Count occurrences of each letter
        for (char c : input.toCharArray())
            count[c - 'A']++;

        StringBuilder result = new StringBuilder();

        while (true) {
            int maxOccurrences = 0;
            char maxChar = ' ';

            for (int i = 0; i < 26; i++) {
                if (count[i] > maxOccurrences) {
                    maxOccurrences = count[i];
                    maxChar = (char) (i + 'A');
                }
            }

            if (maxOccurrences == 0)
                break;

            while (maxOccurrences > 0) {
                result.append(maxChar);
                maxOccurrences--;
            }

            count[maxChar - 'A'] = 0;
        }

        return result.toString();
    }
}
