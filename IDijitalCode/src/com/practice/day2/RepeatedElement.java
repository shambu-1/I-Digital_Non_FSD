package com.practice.day2;

import java.util.LinkedHashSet;

public class RepeatedElement {

	public void freq(int arr[]) {

		for(int i =0; i<arr.length;i++) {
			int flag = 0;
			int res = arr[i];
			for(int j=0; j<arr.length; j++) {
				if(res == arr[j]) {
					flag++;
				}else {
					continue;
				}
			}
			if(flag > 1) {
				System.out.println(res + " is repeated " + flag + " times");
			}
		}
	}
	
	public void removeDuplicates(int[] a)
    {
        LinkedHashSet<Integer> set
            = new LinkedHashSet<Integer>();
 
        // adding elements to LinkedHashSet
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);
 
        // Print the elements of LinkedHashSet
        System.out.print(set);
    }
	
	public static void main(String [] arg) {
		RepeatedElement r = new RepeatedElement();
		
		int a[]={1,423,6,46,34,6 ,23, 1,13,53,4};
		
		r.freq(a);
		r.removeDuplicates(a);
		
	}
}
