import java.util.HashMap;
import java.util.Scanner;

public class SubarraySumEqualK {


    public static int SubarraySum(int[] arr,int target){
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
       for(int i=0;i<arr.length;i++){
           sum+=arr[i];
               if(map.containsKey(sum-target)){
                ans+=map.get(sum-target);
               }
               map.put(sum,map.getOrDefault(sum,0)+1);
       }
        return ans;
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of Array:");
         int n=sc.nextInt();
         int[] arr=new int[n];
         System.out.println("\nEnter Elements:");
         for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
         }
         System.out.print("\nEnter Traget Sum:");
         int target=sc.nextInt();
          System.out.print("\nOutput is:");   
         System.out.println(SubarraySum(arr,target));


    }
}
