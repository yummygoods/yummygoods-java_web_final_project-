package com.example.java_web_final_project;

public class ThingDto {

    protected String name;

    protected String description;

    protected String imageUrl;




    public ThingDto(String name, String description, String imageUrl)
    {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;

    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public void setImageUrl( String imageUrl )
    {
        this.imageUrl = imageUrl;
    }

}
