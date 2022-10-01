package Encapsulation_constructor;

public class Main {
    public static void main(String[] args) {
        Product product= new Product();
        product.setId(1734);
        product.setName("Cemile");
        System.out.println(product.getId());
        System.out.println(product.getName());

        Product product1=new Product(123,"Cemile");
        System.out.println(product1.getId());
        System.out.println(product1.getName());

    }
}
