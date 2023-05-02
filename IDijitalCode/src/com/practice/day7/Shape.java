package com.practice.day7;

public class Shape {

	private String type, color;
	
	public Shape(String type, String color) {
		super();
		this.type = type;
		this.color = color;
	}
	

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	public static void count(Shape [] s) {
		
		for(int i = 0; i<s.length;i++) {
			int flag = 0;
			for(int j = 0; j<s.length; j++) {
				if(s[i].getType() == s[j].getType()) {
					flag++;
//					s[j].setType("0");
				}
			}
			if(flag > 1){
				System.out.println(s[i].getType()+ " - " + flag);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape[] s = new Shape[5];
		
		s[0] = new Shape("Rectangle", "black");
		s[1] = new Shape("Trianle", "black");
		s[2] = new Shape("Circle", "black");
		s[3] = new Shape("Rectangle", "Yellow");
		s[4] = new Shape("Circle", "White");
		
		
		count(s);
	}

}
