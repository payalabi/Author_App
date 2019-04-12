package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.AuthorDao;
import model.Author;
@Service
public class ServiceDaoImp implements ServiceDao {

	@Autowired
	AuthorDao dao;
	@Transactional
	public void addAuthor(Author author) {
		// TODO Auto-generated method stub
		dao.addAuthor(author);
		
	}

	   @Transactional(readOnly = true)
	public List<Author> listAuthor() {
		// TODO Auto-generated method stub
	return dao.listAuthor();
	}

	   @Transactional
	public void updateAuthor(Author author) {
		// TODO Auto-generated method stub
		dao.updateAuthor(author);
	}

	   @Transactional
	public void deleteAuthor(Author author) {
		// TODO Auto-generated method stub
		dao.deleteAuthor(author);
	}

	   @Transactional
	public Author getAuthor(Long id) {
		// TODO Auto-generated method stub
		
		return dao.getAuthor(id);
	}

}
