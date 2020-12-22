package by.jrr.optionalsynt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    Long id;
    String name;
    String fabric;

    public void myToString() {
        this.toString();
    }
}
