package jp.te4a.spring.boot.myapp8;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBean {
  private Integer id ;
  private String title;
  private String writter;
  private String publisher;
  private Integer price;
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
