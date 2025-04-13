package classes;

import java.util.List;

public class Rack {
    int id;
    private List<Product> products;
    public boolean isEmpty(){
        return products.isEmpty();
    }

}
