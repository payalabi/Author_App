package service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AuthorTextDao;
import model.AuthorText;
@Service
@Transactional
public class ServiceAuthorTextImp implements ServiceAuthorText{

	@Autowired AuthorTextDao dao;
	@Override
	public void addAuthorText(AuthorText authortext) {
		
		dao.addAuthorText(authortext);
		
	}

	@Override
	public void updateAuthorText(AuthorText authortext) {
		
		dao.updateAuthorText(authortext);
	}

	@Override
	public void deleteAuthorText(AuthorText authortext) {
		dao.deleteAuthorText(authortext);
		
	}

	@Override
	public AuthorText getAuthorText(Long id) {
		
		return dao.getAuthorText(id);
	}

	
	@Override
	public List<AuthorText> listAuthorTexts() {
		
		return dao.listAuthorTexts();
	}

	@Override
	public List<AuthorText> listTextsbyAuthorId(Long Id) {
	
		return dao.listTextsbyAuthorId(Id);
	}

}
