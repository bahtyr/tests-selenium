package pojos;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<Product> list;

    public Cart() {
        this.list = new ArrayList<>();
    }

    public List<Product> getAllProducts() {
        return list;
    }

    public void addProduct(Product product) {
        list.add(product);
    }

    public int getTotalPrice() {
        int sum = 0;
        for (Product product : list)
            sum += product.getPrice();
        return sum;
    }
}
