package com.biblioteca;
import java.util.*; 

public class Reader {
	//Victor Rafael da Silva
	public String name;
	public byte sex;
	public byte age;
	public List<Livro> books = new ArrayList<Livro>();
	
	public void addBook(Livro book) {
		books.add(book);
	}
	
	public void removeBook(Livro book) {
		books.remove(book);
	}
	
	public void donateBook(Livro donatedBook, Reader receiver) {
		receiver.books.add(donatedBook);
		books.remove(donatedBook);
	}
}