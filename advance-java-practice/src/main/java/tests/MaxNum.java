package tests;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by OMPRAKASH on 9/24/2016.
 */
public class MaxNum {

    public static void main(String[] args) {

        ArrayList<String> lis = new ArrayList<>();

        lis.add("98");
        lis.add("78");
        lis.add("79");
        lis.add("9");

        helperUtil(lis);

        for(String s : lis){
            System.out.println(s);
        }

    }
 private static void helperUtil(ArrayList<String> lis){

     Collections.sort(lis, new MyComparator() );


 }


}
