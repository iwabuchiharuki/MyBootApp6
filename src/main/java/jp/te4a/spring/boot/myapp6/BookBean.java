package jp.te4a.spring.boot.myapp6;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookBean  {
	Integer id ;
	String title;
	String writter;
	String publisher;
	 Integer price;
	public BookBean(Integer valueOf, String title2, String writter2, String publisher2, Integer valueOf2) {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getWritter() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getPublisher() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getPrice() {
		// TODO Auto-generated method stub
		return null;
	}
	
}