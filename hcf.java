import java.util.Scanner;
public class hcf2 {
    public static void main(String[] args){
        int a,b,hc=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Fisrt no. ");
        a=sc.nextInt();
        System.out.println("Enter second no. ");
        b=sc.nextInt();
        for(int i=1;i<=a && i<=b ; i++ ){
            if(a%i==0 && b%i==0)
                hc=i;
            
        }
        System.out.println("The HCF is " +hc);

    }

}

