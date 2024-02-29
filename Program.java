package com.biblioteca;
import java.time.*;

public class Program {
	{

		// Victor Rafael da Silva
		Livro l1 = new Livro();

		l1.title = "Lord of the rings part I";
		l1.subtitle = "The fellowship of the ring";
		l1.author = "J.R.R Tolkien";
		l1.isbn = "9780007136599";
		l1.releaseDate = LocalDate.of(1986, 04, 26);
		l1.publisher = "Harper Collins";

		Livro l2 = new Livro();

		l2.title = "AbcBolinhas";
		l2.subtitle = "O abc das bolinhas";
		l2.author = "Luciano Coelho";
		l2.isbn = "666666666666";
		l2.releaseDate = LocalDate.of(2001, 11, 9);
		l2.publisher = "Universidade do Planalto Catarinense";

		Reader r1 = new Reader();

		r1.name = "Victor Rafael da Silva";
		r1.sex = 0;
		r1.age = 19;

		r1.books.add(l1);
		r1.books.add(l2);

		System.out.println(r1.name + " books: ");
		for (Livro title : r1.books) {
			System.out.println(title);
		}

		System.out.println();

		Reader r2 = new Reader();
		r2.name = "Tio Guda";
		r2.sex = 0;
		r2.age = 24;

		r1.donateBook(l2, r2);

		System.out.println(r1.name + " books: ");
		for (Livro title : r1.books) {
			System.out.println(title);
		}

		System.out.println();

		System.out.println(r2.name + " books: ");
		for (Livro title : r2.books) {
			System.out.println(title);
		}

	}
}
