/**
 * Name:        Zubair Khalid
 * AG No:       2020-ag-1503
 * Assignment:  Binary Search implementation in java
 */

//external libraries
import java.util.Arrays;

//main *class file*(A class is always required to run a java program)
public class BinarySearch{

  //*main method*(When a program is compailed, compiler always search for a main method|Program starts from here)
  //control shifted to other methods or classes from here and result is returned by them for further use
  public static void main(String[] args) {

        // read the integers from a file(tinyAllowlist.txt)
        In in = new In(args[0]);

        //Convert received file(tinyAllowlist.txt) in the form of array
        int[] allowlist = in.readAllInts();

        // sort the array
        Arrays.sort(allowlist);

        // read integer key(tinyText.txt) from standard input; print if not in allowlist
        while (!StdIn.isEmpty()) {

            //read (tinyText.txt) line by line and check if values is present by using (indexOf) Method
            int key = StdIn.readInt();
            //if output or indexOf method is -1 then key is not present in array otherwise exist 
            if (BinarySearch.indexOf(allowlist, key) == -1)
                StdOut.println(key);
        }
    }


  /**
   * receives to arguments 
   * 1: allowlist as array (Sorted Array)
   * 2: key to search
   * if loop terminates, it means element not exists
   */
  public static int indexOf(int[] a, int key) {

        //Lower
        int lo = 0;
        //Higher
        int hi = a.length - 1;

        //Loop for iteration until get the value
        while (lo <= hi) {

            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }


}