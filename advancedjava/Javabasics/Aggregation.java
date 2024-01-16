package Javabasics;

class Address {

    String house, city, state;

    public Address(String house, String city, String state) {
        this.house = house;
        this.city = city;
        this.state = state;
    }

}

public class Aggregation {
    Address address;
    int id;
    String name;

    public Aggregation(Address address, int id, String name) {
        this.address = address;
        this.id = id;
        this.name = name;
    }

    
    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.house);
    }

    public static void main(String[] args) {
        Address add = new Address("asd", "szd", "asd");
        Aggregation agg = new Aggregation(add, 0, "helio");
        agg.display();

    }

}
