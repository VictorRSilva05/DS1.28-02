package com.biblioteca;
import java.time.*;
import java.util.*; 

public class Livro {
	//Victor Rafael da Silva
	public String title;
	public String subtitle;
	public String author;
	public String isbn;
	public LocalDate releaseDate;
	public String publisher;
	public List<Genre> genre = new ArrayList<Genre>();
	
	@Override 
	public String toString() {
		    return title + " - " + author;
		  }
}
