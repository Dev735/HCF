import java.util.HashSet;
public class Union {
    public static void main(String[] args){
        int[] arr1={1,2,3,5,8};
        int[] arr2={2,4,3,8,6,7,9};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
             set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
       }
         System.out.println(set);
    }
}
