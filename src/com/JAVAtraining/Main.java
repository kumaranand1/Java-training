package com.JAVAtraining;

public class Largestarray {

    {
        public static void main (String args[])
        {
            int arr[] = {56, 67, 89, -98, 80};


            Asgn5 Asgn5 = new Asgn5();
            System.out.println(as.largestInArray(arr, arr.length));
        }
        public int largestInArray;( int arr[], int n)
        {
            int max = arr[0];
            for (int i = 0; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;

        }

    }
}