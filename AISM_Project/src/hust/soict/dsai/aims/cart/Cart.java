package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Media;

public class Cart {
	private List<Media> itemsOrdered = new ArrayList<Media>();
	
	public void addMedia(Media item) {
		if (itemsOrdered.contains(item) == true) {
			System.out.println("The item has been already ");
		}else {
			itemsOrdered.add(item);
			System.out.println("The item has been added");
		}
	}
	
	public void removeMedia (Media item) {
		if (itemsOrdered.size() == 0) {
			System.out.println("Don't have item in list");
		}else if(itemsOrdered.contains(item) == false){
			System.out.println("The item hasn't been in list");
		}else {
			itemsOrdered.remove(item);
			System.out.println("The item has been deleted");
		}
	}
	
	public float totalCost() {
		float totalCost = 0;
		for (Media item : itemsOrdered) {
			totalCost += item.getCost();
		}
		return totalCost;
	}
}
