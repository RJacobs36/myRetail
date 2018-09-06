package myRetail;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

    private Item item;

    public Response() {
    }

    public Item getItem() { return item; }

    public void setItem(Item item) { this.item = item; }

    @Override
    public String toString() {
        return "Item=" + item;
    }
}
