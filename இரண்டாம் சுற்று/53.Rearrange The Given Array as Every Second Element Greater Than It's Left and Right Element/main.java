/*
i/p:
7
1 2 3 4 5 6 7

o/p:
1 3 2 5 4 7 6
*/

import java.util.Arrays;
import java.util.Scanner;

class grtrThnLftAndRght {
  
	private static void swap_nums(int[] nums, int i, int j) {
    
		int t_nums = nums[i];
		nums[i] = nums[j];
		nums[j] = t_nums;
	}

	public static void rearrange_Array_nums(int[] nums)
	{
		for (int i = 1; i < nums.length; i += 2)
		{
			if (nums[i - 1] > nums[i]) {
				swap_nums(nums, i - 1, i);
			}

			if (i + 1 < nums.length && nums[i + 1] > nums[i]) {
				swap_nums(nums, i + 1, i);
			}
		}
	}

	public static void main (String[] args)
	{
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
		int[] nums= new int[size];
    for(int i=0;i<size;i++)
    {
      nums[i] = sc.nextInt();
    }
		rearrange_Array_nums(nums);
		System.out.println(Arrays.toString(nums));
	}
}
