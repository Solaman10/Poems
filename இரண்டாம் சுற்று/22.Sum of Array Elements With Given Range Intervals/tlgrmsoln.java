import java.util.*;
class HelloWorld {
    public static void slidewindowsum(int[] arr,int k)
    {
        int sum =0;
        ArrayList<Integer> list = new ArrayList<>();
        int num = k;
        for(int i=0;i<arr.length;i++)
        {
            if(num!=0)
            {
                num--;
                sum = sum + arr[i];
            }
           if(num==0 || i==arr.length-1)
            {
                list.add(sum);
                num=k;
                sum=0;
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
       slidewindowsum(arr,k);
        
    }
}
