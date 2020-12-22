package by.jrr.optionalsynt.dao;

import by.jrr.optionalsynt.bean.Product;

import java.util.Optional;
import java.util.Random;

public class ProductDao {

    public Optional<Product> findProductById(long id) {
//        return Optional.empty();
//        return Optional.of(new Product());
        return Optional.ofNullable(productFabrique());
    }

    private Product productFabrique() {
        if(new Random().nextBoolean()) {
            return new Product();
        }
        return null;
    }
}
