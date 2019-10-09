package net.friend.spring.data.model;

import javax.persistence.*;

@Entity
@Table(name = "item")
public class Item
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@Column(name = "category_id")
	private int categoryId;
	
	public Item()
	{
		this.name = "";
		this.categoryId = -1;
	}

	public Item(String name, int categoryId) {
		this.name = name;
		this.categoryId = categoryId;
	}

	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public int getCategoryId()
	{
		return categoryId;
	}

	public void setCategoryId(int categoryId)
	{
		this.categoryId = categoryId;
	}
	
	@Override
	public String toString()
	{
		return "Item[ID=" + id + ";Name='" + name + "';CategoryID=" + categoryId + "]";
	}
}
