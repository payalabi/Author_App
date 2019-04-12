package dao;

import java.util.List;

import model.AuthorText;



public interface AuthorTextDao {
	void addAuthorText(AuthorText authortext);
	 void updateAuthorText(AuthorText authortext);
	 void deleteAuthorText(AuthorText authortext);
	 AuthorText getAuthorText(Long id);
	 List<AuthorText> listAuthorTexts();
	 List<AuthorText> listTextsbyAuthorId(Long Id); 
}
