package by.jrr.optionalsynt;

import by.jrr.optionalsynt.bean.Product;
import by.jrr.optionalsynt.dao.ProductDao;

import java.util.Optional;

public class App {
    public static void main(String[] args) throws Exception {
        ProductDao dao = new ProductDao();
        Optional<Product> productOptional = dao.findProductById(4);

        //1.
        if(productOptional.isPresent()) {
            Product product = productOptional.get();
            product.myToString();
        }

        //2.
        Product product = productOptional.orElse(new Product());
        product.myToString();

        //3.
        Product product2 = productOptional.orElseGet(Product::new);
        product2.myToString();

        //4.
        productOptional.ifPresent(prod -> prod.myToString());
        productOptional.ifPresent(prod -> prod.myToString());

        //5.
        productOptional.ifPresentOrElse(
                prod -> prod.myToString(),
                () -> new IllegalStateException());
    }
}
