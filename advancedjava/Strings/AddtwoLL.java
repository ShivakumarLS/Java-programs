package Strings;

import java.util.ArrayList;

public class AddtwoLL {
    public static void main(String[] args) {
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(3);
        list2.add(5);
        list2.add(6);
        list2.add(4);
        String str1="",str2="";
        for(int i =list1.size()-1;i>-1;i--)
            str1+=list1.get(i);
        for(int i =list2.size()-1;i>-1;i--)
            str2+=list2.get(i);
        System.out.println(str1+" "+str2);
        int val = Integer.parseInt(str2)+Integer.parseInt(str1);
        char [] arr = (String.valueOf(val)).toCharArray();
        for(int i =arr.length-1;i>=0;i--)
            resultList.add(Character.getNumericValue(arr[i]));
        System.out.println(resultList.toString());

    }
}
