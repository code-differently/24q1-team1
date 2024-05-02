package com.adoptdifferently.model;
public class CatListing {

    private long id;
    private long ownerId;
    private String name;
    private String breed;
    private int age;
    private String location;
    private String description;

    public CatListing(long id, long ownerId, String name, String breed, int age, String location, String description) {
        this.id = id;
        this.ownerId = ownerId;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.location = location;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setOwnerId(long userId) {
        this.ownerId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CatListing [id=" + id + ", ownerId=" + ownerId + ", name=" + name + ", breed=" + breed + ", age=" + age
                + ", location=" + location + ", description=" + description + "]";
    }
}