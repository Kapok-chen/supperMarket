package com.hang.pojo;

public class BookInfo {

	private Integer Id;
	private String BookName;
	private String Author;
	private Integer CategoryId;
	private String Publisher;
	private Double Price;
	private String Photo;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public Integer getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(Integer categoryId) {
		CategoryId = categoryId;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public String getPhoto() {
		return Photo;
	}
	public void setPhoto(String photo) {
		Photo = photo;
	}
	@Override
	public String toString() {
		return "BookInfo [Id=" + Id + ", BookName=" + BookName + ", Author=" + Author + ", CategoryId=" + CategoryId
				+ ", Publisher=" + Publisher + ", Price=" + Price + ", Photo=" + Photo + "]";
	}
	public BookInfo(Integer id, String bookName, String author, Integer categoryId, String publisher, Double price,
			String photo) {
		super();
		Id = id;
		BookName = bookName;
		Author = author;
		CategoryId = categoryId;
		Publisher = publisher;
		Price = price;
		Photo = photo;
	}
	public BookInfo() {
		super();
	}

	
}
