package com.ty.array1;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Solution {
	  public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
	        int[] res = new int[m+n];
	        int count =0;
	        for(int i=0;i<nums1.length;i++){
	           
	            if(nums1[i]!=0){
	               res[count] = nums1[i];
	               count++;
	            }
	        }
	        for(int j=0;j<nums2.length;j++){
	            if(nums2[j] != 0){
	                res[count] = nums2[j];
	                count++;
	            }
	        }
	        return res;
	    }

	public static void main(String[] args) {
		
		int[] nums1= {1,2,3,0,0,0};
		int a=3, b=3;
		int [] nums2= {2,5,6};
		int[] merge = merge(nums1, a, nums2, b);
		LinkedHashSet<Object> set = new LinkedHashSet<>();
		for (int i = 0; i < merge.length; i++) {
			set.add(merge[i]);
		}
		
		String string = Arrays.toString(merge);
		
		System.out.println(string);
		System.out.println(set);
		
	}

}
