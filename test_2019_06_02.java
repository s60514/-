package practise;

import java.util.Arrays;

/*
 * 需求 数组从小到大 再从大到小排序 快速找到最大值
 */
public class test_2019_06_02{

    public static void main(String[] args) {
	
	int[] array = { 1,2,3,4,5,55,66,88,77,66,55,44,11,2 };
	
	System.out.println(Arrays.toString(array));
	
	int low = 0;
	int high = array.length;
	int p = (low+high)/2;
	while(high-3>low){
	    if( array[p]< array[p+1]){
		low = p;
	    }else{
		high = p;
	    }
	    p = (low+high)/2;
	}
	p = array[low];
	for(int i=low; i<=high; i++){
	    if(p<array[i]){
		p = array[i];
	    }
	}
	
	System.out.println(p);
    }
    
}
