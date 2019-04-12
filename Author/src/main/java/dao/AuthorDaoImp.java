package dao;

import java.util.List;

import javax.persistence.TypedQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Author;
@Repository
public class AuthorDaoImp implements AuthorDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addAuthor(Author author) {
		// TODO Auto-generated method stub
		System.out.println(author.getFirstName()+author.getLastName());
		 //sessionFactory.getCurrentSession().save(author);
		 sessionFactory.getCurrentSession().saveOrUpdate(author);
			
		
	}

	@Override
	public List<Author> listAuthor() {
		 @SuppressWarnings("unchecked")
	      TypedQuery<Author> query = sessionFactory.getCurrentSession().createQuery("from Author");
	      return query.getResultList();
	}

	@Override
	public void updateAuthor(Author author) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(author);
		
	}

	@Override
	public void deleteAuthor(Author author) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(author);
	}

	/* (non-Javadoc)
	 * @see dao.AuthorDao#getAuthor(java.lang.Long)
	 */
	@Override
	public Author getAuthor(Long id) {

		Author author = new Author();
		try{
		author=(Author)sessionFactory.getCurrentSession().get(Author.class, id);
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return author;
	}

}
