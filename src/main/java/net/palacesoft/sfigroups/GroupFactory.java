package net.palacesoft.sfigroups;

import java.util.*;

public class GroupFactory {

    private Set<Product> products = new TreeSet<Product>();


    public void addProducts(Product... product) {
        products.addAll(Arrays.asList(product));
    }

    public Collection<Product> getProducts() {
        return Collections.unmodifiableSet(products);
    }
}
