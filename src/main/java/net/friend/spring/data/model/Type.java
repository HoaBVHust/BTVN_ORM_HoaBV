package net.friend.spring.data.model;

import javax.persistence.*;

@Entity
@Table(name = "type")
public class Type
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	public Type()
	{
		name = "";
	}

	public Type(String name) {
		this.name = name;
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
}
