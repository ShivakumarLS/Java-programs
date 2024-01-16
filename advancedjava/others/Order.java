import java.util.Arrays;

public class Order {

    public static void main(String[] args) {
        int [] a = {1,5,4,7,8};
        int [] ascending = new int[5],descending=new int[5];
        Arrays.sort(a);
       for(int i=0,j=a.length-1;i<a.length&&j>-1;i++,j--)
       {
        ascending[i]=a[i];
        descending[i]=a[j];
       }
       System.out.println("Ascending");
       for(int i : ascending)
       System.out.println(i);
       System.out.println("Descending");
       for(int i : descending)
       System.out.println(i);
    }
    
}
