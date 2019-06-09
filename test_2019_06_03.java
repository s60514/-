package practise;

import java.util.Arrays;

/*
 * 快排
 */
public class test_2019_06_03{
    public static void quitSort(int arr[],int low, int high) {
	int l = low;
	int h = high;
	int p = arr[l];
	
	while(l<h){
	    while(l<h && p<=arr[h]){
		h--;
	    }
	    if(l<h){
		arr[l++] = arr[h];
	    }
	    
	    while(l<h && p>=arr[l]){
		l++;
	    }
	    if(l<h){
		arr[h--] = arr[l];
	    }
	}//end while
	arr[l] = p; 
	
	if(l-1>low) {
	    quitSort(arr, low, l-1);
	}
	
	if(h+1<high){
	    quitSort(arr, h+1, high);
	}
    }
    
    public static void main(String[] args) {
	int[] array = { 4, 1, 7, 6, 9, 2, 8, 0, 3, 5, 1, 2, 4, 2 };
	System.out.println(Arrays.toString(array));
	
	quitSort(array, 0, array.length-1);
	
	System.out.println(Arrays.toString(array));
    }
    
    
}
