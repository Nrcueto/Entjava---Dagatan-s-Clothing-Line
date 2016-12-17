package apc.entjava.photogallery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Centi on 16/12/2016.
 */
@Entity
public class Item {
    private int itemId;
    private String product_name;
    private String price;
    private String size;
    private String qtyAvail;
    private String category;


    @Id
    @GeneratedValue
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Column(nullable=false, length=50)
    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    @Column(nullable=false, length=50)
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }

    @Column(nullable=false, length=50)
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    @Column(nullable=false, length=50)
    public String getQtyAvail() {
        return qtyAvail;
    }
    public void setQtyAvail(String qtyAvail) {
        this.qtyAvail = qtyAvail;
    }

    @Column(nullable=false, length=50)
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
