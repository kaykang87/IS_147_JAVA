/* kyong kang
   kyongk1@umbc.edu
 */
package com.company;

public class Main {

    public static void main(String[] args)
    {
        MyArrayList arrayList = new MyArrayList();
        int[] ints = {1, 2, 3, 4, 5, 6};
        double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        char[] chars = {'H', 'E', 'L', 'L', 'O'};

        System.out.println(arrayList.printMyArray(ints));
        System.out.println(arrayList.printMyArray(doubles));
        System.out.println(arrayList.printMyArray(chars));
    }
}
