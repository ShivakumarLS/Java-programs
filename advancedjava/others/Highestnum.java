public class Highestnum {
    public static void main(String[] args) {
        
        int [] arr = {1,5,8,9};
        int max = -2147483648;
        for (int i : arr)
        {
            if(i>max)
             max=i;
        }
        System.out.println(max +" is the highest integer");
    }
    
}
