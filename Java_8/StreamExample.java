package Java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class StreamExample {
    public static void main(String[] args) {
        List<Product> pl = new ArrayList<Product>();
        pl.add(new Product(101,"HP",25000));
        pl.add(new Product(102, "Acer", 35000));
        pl.add(new Product(103, "Dell", 45000));

        List<Float> pl2 = pl.stream()
                .filter(p-> p.price>=25000)
                .map(p-> p.price)
                .collect(Collectors.toList());
                System.out.println(pl2);
    }
}
