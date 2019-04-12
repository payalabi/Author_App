package dao;

import java.util.List;

import model.Author;

public interface AuthorDao {
	 void addAuthor(Author author);
	 void updateAuthor(Author author);
	 void deleteAuthor(Author author);
	 Author getAuthor(Long id);
	 List<Author> listAuthor();
      
}
