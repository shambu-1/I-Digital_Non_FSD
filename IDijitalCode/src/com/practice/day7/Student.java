package com.practice.day7;

public class Student {

	private String name;
	private int phyMarks, chemMarks, mathMarks, rollnumber;
	
	
	

	public Student(String name, int phyMarks, int chemMarks, int mathMarks, int rollnumber) {
		super();
		this.name = name;
		this.phyMarks = phyMarks;
		this.chemMarks = chemMarks;
		this.mathMarks = mathMarks;
		this.rollnumber = rollnumber;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getPhyMarks() {
		return phyMarks;
	}




	public void setPhyMarks(int phyMarks) {
		this.phyMarks = phyMarks;
	}




	public int getChemMarks() {
		return chemMarks;
	}




	public void setChemMarks(int chemMarks) {
		this.chemMarks = chemMarks;
	}




	public int getMathMarks() {
		return mathMarks;
	}




	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}




	public int getRollnumber() {
		return rollnumber;
	}




	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}


	public static void pMark(Student[] s) {
		for(Student a : s) {
			int totalMark = a.chemMarks+a.mathMarks+a.phyMarks;
			int pMark = (totalMark*100)/300;
			System.out.println(a.getName() + " - " + pMark +"%");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student [] s = new Student[2];
		
		s[0] = new Student("A", 10, 20, 20, 1);
		s[1] = new Student("B", 30, 40, 40, 2);
		
		pMark(s);
	}

}
