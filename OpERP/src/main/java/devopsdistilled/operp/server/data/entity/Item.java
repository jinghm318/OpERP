package devopsdistilled.operp.server.data.entity;

import javax.persistence.Entity;

@Entity
public class Item {
	
	private Long itemId;
	private Product product;
	private Brand brand;
}
