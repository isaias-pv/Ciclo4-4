package com.example.reto2.modelos;

public class Servicio {
    private int id;
    private String title;
    private String description;
    private byte[] image;

    public Servicio(int id, String title, String description, byte[] image) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public Servicio() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
