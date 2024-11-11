package vn.edu.ueh.thanhdnh.recyclerviewapp;

public class Contact {
    private int id;
    private String name;
    private String photo;
    private String telephone;

    // Constructor
    public Contact(int id, String name, String photo, String telephone) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.telephone = telephone;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    // toString method
    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
