package apc.entjava.photogallery;

import apc.entjava.photogallery.businesslogic.ItemService;
import apc.entjava.photogallery.model.Item;
import apc.entjava.photogallery.dao.ItemDao;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;


@ManagedBean
public class ItemBean implements Serializable {

    private ItemService itemService = new ItemDao();

    private Item item;

    public Item getItem() {
        if(this.item==null) {
            this.item = new Item();
        }
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String addItem() {
            this.itemService.addItem(item);
            return "login";
    }


}

