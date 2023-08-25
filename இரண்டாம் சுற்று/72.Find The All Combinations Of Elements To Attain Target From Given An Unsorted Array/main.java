/*
input:
11                         // size of array
8 3 4 7 9 3 3 1 4 5 10    // array elements
10                       // target

output:
[3, 3, 3, 1]
[3, 4, 3]
[1, 4, 5]
[3, 3, 4]
[4, 3, 3]
[3, 7]
[4, 1, 5]
[9, 1]
[10]
[7, 3]
-----------------------------------------------
input:
11                         // size of array
8 3 4 7 9 3 3 1 4 5 10    // array elements
7                        // target

output:
[3, 3, 1]
[4, 3]
[3, 4]
[7]
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int indx=0;indx<size;indx++)
          arr[indx] = sc.nextInt();
        int target = sc.nextInt();
        // int[] arr = {8, 3, 4, 7, 9, 3, 3, 1, 4, 5, 10};
        // int target = 10;
        Set<List<Integer>> combinations = new HashSet<>();
        backtrack(arr, target,0,new ArrayList<Integer>(),combinations);

        for (List<Integer> combination : combinations)
            System.out.println(combination);
    }

    public static void backtrack(int[] arr, int target, int startIndex, ArrayList<Integer> currentCombination, Set<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int indx = startIndex; indx < arr.length; indx++) {
            if (arr[indx] <= target) {
                currentCombination.add(arr[indx]);
                backtrack(arr, target - arr[indx], indx + 1, currentCombination, result);
                currentCombination.remove(currentCombination.size() - 1);
            }
        }
    }
}
