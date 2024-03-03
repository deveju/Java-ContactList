package project;

public class Contact {
    public String name;
    public int age;
    public String email;
    public String country;
    public String address;
    public Contact() {}

    public Contact(String name, int age, String email, String country, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.country = country;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("\n---- Contact %s ----\nName: %s, %dy \nE-Mail: %s \nAddress: %s, %s\n---------------------------", name, name, age, email, country, address);
    }
}
