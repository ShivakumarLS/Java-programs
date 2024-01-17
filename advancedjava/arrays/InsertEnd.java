
import java.util.ArrayList;
import java.util.Arrays;

public class InsertEnd {

    public static void main(String[] args) {
        
        int [] arr = {12,32, 2 ,87, 22, 19, 30};
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        StringBuilder sb = new StringBuilder("ahjecv");
        sb.deleteCharAt(2);
        sb.insert(2,'k');
        System.out.println(sb.toString());
        list2.add(true);
        System.out.println(list2);
        
        for (int i=0 ;i <arr.length; i++){
            list.add(arr[i]);
            }
        list.add(65);
        arr = new int[8];
        int j=0;
        for(int i : list)
        {
            arr[j]=i;
            j++;
        } 
        Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
        System.out.println(Arrays.stream(arr));

    }
}
    
