package com.practice.day7;

public class Library {

	public String book_name, author_name;
	private int number_copies;
	
	
	
	public Library(String book_name, String author_name, int number_copies) {
		super();
		this.book_name = book_name;
		this.author_name = author_name;
		this.number_copies = number_copies;
	}


	
	public String getBook_name() {
		return book_name;
	}



	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}



	public String getAuthor_name() {
		return author_name;
	}



	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}



	public int getNumber_copies() {
		return number_copies;
	}



	public void setNumber_copies(int number_copies) {
		this.number_copies = number_copies;
	}

	public static void borrow(Library [] book, int i) {
		if(book[i].number_copies > 0) {
			System.out.println("The book "+ book[i].getBook_name()+ " has been borrowed");
			 System.out.println("Number of copies of book "+book[i].getBook_name() +" is "+ (--book[i].number_copies));
		}
		else {
			 System.out.println("No book available");
			 
		}
	}
	
	public static void Return(Library [] book, int i) {
		System.out.println("The book "+ book[i].getBook_name()+ " has been returned");
			System.out.println("Number of copies of book "+book[i].getBook_name() +" is "+ (++book[i].number_copies));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library [] book = { new Library("A", "A1", 1),
							new Library("B", "B1", 1)};
		
		borrow(book, 0);
		Return(book, 0);
	}
	

}
