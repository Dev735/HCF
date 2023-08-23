import java.util.*;
public class Intersection {
    public static void main(String[] args){
        int[] arr1={1,2,3,5,8};
        int[] arr2={2,4,3,8,6,7,9};
        int[] IS=new int[10];
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
             set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                  
                   IS[count]=arr2[i];
                   count++;
            }

       }
       System.out.println("Intersection count: " + count);
       System.out.print("Intersection elements: ");
       for (int i = 0; i < count; i++) {
           System.out.print(IS[i] + " ");
       }
    }
}
