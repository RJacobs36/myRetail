package myRetail;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {

    private int tcin;
    private ProductDescription product_description;

    public Item() {
    }

    public int getTcin() { return tcin; }

    public void setTcin(int tcin) { this.tcin = tcin; }

    public ProductDescription getProduct_description() {
        return product_description;
    }

    public void setProduct_description(ProductDescription product_description) {
        this.product_description = product_description;
    }

    @Override
    public String toString() {
        return "Item={id=" + tcin +
                ", product_description='" + product_description +
                '}';
    }
}