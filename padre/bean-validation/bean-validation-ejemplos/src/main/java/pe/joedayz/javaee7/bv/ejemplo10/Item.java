package pe.joedayz.javaee7.bv.ejemplo10;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Item {

	// ======================================
	  // =             Attributes             =
	  // ======================================

	  protected Long id;
	  @NotNull
	  @Size(min = 4, max = 50)
	  protected String title;
	  protected Float price;
	  protected String description;

	  // ======================================
	  // =            Constructors            =
	  // ======================================

	  public Item() {
	  }

	  public Item(String title, Float price, String description) {
	    this.title = title;
	    this.price = price;
	    this.description = description;
	  }

	  // ======================================
	  // =           Public Methods           =
	  // ======================================

	  @NotNull
	  public Float calculatePrice(@DecimalMin("1.2") Float rate) {
	    return price * rate;
	  }

	  @DecimalMin("9.99")
	  public Float calculateVAT() {
	    return price * 0.196f;
	  }

	  // ======================================
	  // =          Getters & Setters         =
	  // ======================================

	  public Long getId() {
	    return id;
	  }

	  public String getTitle() {
	    return title;
	  }

	  public void setTitle(String title) {
	    this.title = title;
	  }

	  public Float getPrice() {
	    return price;
	  }

	  public void setPrice(Float price) {
	    this.price = price;
	  }

	  public String getDescription() {
	    return description;
	  }

	  public void setDescription(String description) {
	    this.description = description;
	  }

	  // ======================================
	  // =         hash, equals, toString     =
	  // ======================================

	  @Override
	  public String toString() {
	    final StringBuilder sb = new StringBuilder();
	    sb.append("Item");
	    sb.append("{id=").append(id);
	    sb.append(", title='").append(title).append('\'');
	    sb.append(", price=").append(price);
	    sb.append(", description='").append(description).append('\'');
	    sb.append('}');
	    return sb.toString();
	  }
}
