/**
 * Created by Claudiu on 5/11/2016.
 */
import BubbleSort.SortArray;

//import SortArray;


public class Console
{
    public static void main(String args[])
    {
        int arr[] = {2, 1, 3, 5, 4, 6};

        SortArray.sortLowToHigh(arr);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
