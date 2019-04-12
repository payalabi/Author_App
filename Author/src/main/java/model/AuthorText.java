package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;


/**
 * @author payalabichandani
 *
 */
@Entity
@Table(name="Text_Master")
public class AuthorText {
	@Id
	@Column(name="Text_Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Long id;
	
	@Column(name="Title")
	 @Size(max = 20, min = 3, message = "{Author.name.invalid }")
	private String strTitle;
	
	@Column(name="Text")
	 @Size(max = 200, min = 3, message = "{Author.name.invalid }")
	private String strText;
	

	@Column(name="aut_id")
	private Long aut_id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStrTitle() {
		return strTitle;
	}
	public void setStrTitle(String strTitle) {
		this.strTitle = strTitle;
	}
	public String getStrText() {
		return strText;
	}
	public void setStrText(String strText) {
		this.strText = strText;
	}
	public Long getAut_id() {
		return aut_id;
	}
	public void setAut_id(Long aut_id) {
		this.aut_id = aut_id;
	}
	
	
}
