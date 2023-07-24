/*
i/p:
{-2,-3,4,-1,-2,1,5,-3}

o/p:
{4,-1,-2,1,5}            // Maximum Sum is 7

*/

public class maximumSumAndSubArrayElements {
    
    public static int[] maxSubArray(int[] nums) {
        int max = nums[0],sum=0, start = 0,end = 0,currStart = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum > max) {
                max = sum;
                start = currStart;
                end = i;
            }

            if (sum < 0) {
                sum = 0;
                currStart = i + 1;
            }
        }

        int[] result = new int[3];
        result[0] = max; // Maximum sum
        result[1] = start; // Starting index of the subarray
        result[2] = end; // Ending index of the subarray

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0;i<size;i++)
          nums[i] = sc.nextInt();
          
        int[] ans = maxSubArray(nums);
        int start=ans[1],end=ans[2];

        while(start<=end) {
            System.out.print(nums[start] + " ");
            ++start;
        }
    }
}
