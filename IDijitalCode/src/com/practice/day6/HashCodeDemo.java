package com.practice.day6;

public class HashCodeDemo {
	public class JavaObjectHashcodeExample1 {  
	    static int last_roll = 100;    
	    int roll_no;   
	    // Constructor   
	    JavaObjectHashcodeExample1()   
	    {   
	        roll_no = last_roll;   
	        last_roll++;   
	    }   
	    public int hashCode()   
	    {   
	        return roll_no;   
	    }   
	    // Driver code   
	    public static void main(String args[])   
	    {   
	        JavaObjectHashcodeExample1 s = new JavaObjectHashcodeExample1();   
	        // Below two statements are equivalent   
	        System.out.println("HashCode : "+s);   
	    }   
	}