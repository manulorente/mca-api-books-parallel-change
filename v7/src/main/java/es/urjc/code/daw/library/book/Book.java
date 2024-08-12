package es.urjc.code.daw.library.book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id = null;
	
	private String title;
	
	private String preface;

	private Float detailedPrice;

	public Book() {}

	public Book(String nombre, String preface) {
		super();
		this.title = nombre;
		this.preface = preface;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPreface() {
		return this.preface;
	}

	public void setPreface(String preface) {
		this.preface = preface;
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Float getDetailedPrice() {
		return detailedPrice;
	}

	public void setDetailedPrice(Float detailedPrice) {
		this.detailedPrice = detailedPrice;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", preface=" + preface + ", detailedPrice=" + detailedPrice + "]";
	}

}
