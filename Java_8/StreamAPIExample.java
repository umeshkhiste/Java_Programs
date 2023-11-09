import java.util.*;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class StreamAPIExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding products
        productsList.add(new Product(1,"HP Laptop", 25000f));
        productsList.add(new Product(2,"Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenovo Laptop", 35000f));

        List<Float> productPriceList2 = productsList.stream()
                                        .filter(p->p.price>20000) // filtering data
                                        .map(p->p.price) // fetching price
                                        .collect(Collectors.toList());
        System.out.println(productPriceList2);
    }
}
