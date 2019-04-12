package dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import model.AuthorText;
@Repository
public class AuthorTextDaoImp implements AuthorTextDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addAuthorText(AuthorText authortext) {
		// TODO Auto-generated method stub
		
		 sessionFactory.getCurrentSession().save(authortext);
	}

	@Override
	public void updateAuthorText(AuthorText authortext) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(authortext);
	}

	@Override
	public void deleteAuthorText(AuthorText authortext) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(authortext);
	}

	@Override
	public AuthorText getAuthorText(Long id) {
				AuthorText authortext = new AuthorText();
		try{
			authortext=(AuthorText)sessionFactory.getCurrentSession().get(AuthorText.class, id);	
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return authortext;
	}

	@Override
	public List<AuthorText> listAuthorTexts() {
		 @SuppressWarnings("unchecked")
	      TypedQuery<AuthorText> query = sessionFactory.getCurrentSession().createQuery("from AuthorText");
	      return query.getResultList();
	}

	@Override
	public List<AuthorText> listTextsbyAuthorId(Long Id) {
		
		@SuppressWarnings("unchecked")
	      TypedQuery<AuthorText> query = sessionFactory.getCurrentSession().createQuery("from AuthorText where aut_id="+Id);
	      return query.getResultList();
		
	
	}

}
