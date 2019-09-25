package May12;

public class Product {
	  private String name; 
	  private float rating; 
	  private double price; 
	  private String productId;
	  
	  //create a method to set the value of all fields
	  public void initilizeAllFieldValue( String name,float rating, double price, String productId  ) {
		    this.name = name;
	        this.rating = rating;
	        this.price = price;
	        this.productId = productId;  
	        //OPTIONALLY
	        //you can do above by calling setter method
	  }
	  
	  public String getName() {
	    return name;
	  }
	  public void setName(String name) {
	    this.name = name;
	  }
	  public float getRating() {
	    return rating;
	  }
	  public void setRating(float rating) {
	    this.rating = rating;
	  }
	  public double getPrice() {
	    return price;
	  }
	  public void setPrice(double price) {
	    this.price = price;
	  }
	  public String getProductId() {
	    return productId;
	  }
	  public void setProductId(String productId) {
	    this.productId = productId;
	  } 
}
