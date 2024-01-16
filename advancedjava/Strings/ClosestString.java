package Strings;

public class ClosestString {
static public int closestString(String [] strs, String str1,String str2)
{
    int first = -1;

    for(int i =0;i<strs.length;i++)
        {
            if(strs[i].equals(str1))
                first = i;
            if(strs[i].equals(str2) && first!=-1)
                return i-first;
                
        }
    return -1 ;
    }
public static void main(String[] args) {
    String  strs  [] = {"dfg", "dfg", "dfg", "dfg", "sdff"},str1 = "xcfgcbvx",str2="dfg";
    System.out.println(closestString(strs, str1, str2));
    
}
}
