package Encapsulation_constructor;

public class Product {


    //Encapsulation
    private int _id;
    private String _name;

    public Product(int id, String name) {
        _id = id;
        _name=name;
    }
    public Product(){

    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }


}
