package net.friend.spring.data.model;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Column(name = "type_id")
    private int typeId;

    public Category(){
        this.name = "";
        this.typeId = -1;
    }

    public Category(String name, int typeId) {
        this.name = name;
        this.typeId = typeId;
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

    public int getTypeId()
    {
        return typeId;
    }

    public void setTypeId(int typeId)
    {
        this.typeId = typeId;
    }


    @Override
    public String toString()
    {
        return "Category[ID=" + id + ";name='" + name + "';TypeID="
                + typeId + "]";
    }
}
