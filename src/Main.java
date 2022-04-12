import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    //Method declarations
    public static void transpositionSort(ArrayList<Object> a, int size){
        //fix me
    }
    public static void mergeSort(ArrayList<Object> a, ArrayList<Object> tmp, int left, int right){
        //fix me
    }
    public static void mergeSortedLists(ArrayList<Object> a, ArrayList<Object> tmp, int left, int middle, int right){
        //fix me
    }

    public static void main(String [] args){
        //.....
        //....
        ArrayList<Object> list=new ArrayList<Object>();   // list to be sorted
        ArrayList<Object> tmp=new ArrayList<Object>();   // temporary workspace
        //fill list
        //....
        //...
        //Create a copy from list for Transition sort
        ArrayList <Object> list2=new ArrayList<Object>();
        for(int i=0;i<list.size();i++)
            list2.add(list.get(i));

        // sort list using mergesort
        mergeSort(list, tmp, 0, list.size());
        //sort list2 using Bubble sort
        transpositionSort(list2, list2.size());

           }
}
