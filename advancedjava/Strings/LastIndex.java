package Strings;

public class LastIndex {
    public static int lastIndex(String haystack, String needle) {
        
        if (needle.length()==0) 
            return -1; 
    
        if(haystack.contains(needle))
            return haystack.indexOf(needle);
        return -1;
        }
        public static void main(String[] args) {
            String a = "-1200",b="issip";
            System.out.println(lastIndex(a,b));
       StringBuffer sb = new StringBuffer();
       sb.append(a.substring(1,a.length()));
       sb = sb.reverse();
       sb.insert(0, "-");
      
       System.out.println( Integer.parseInt(sb.toString()));
       
        
        }
}
