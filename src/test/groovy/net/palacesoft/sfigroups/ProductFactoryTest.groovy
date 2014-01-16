package net.palacesoft.sfigroups

import org.junit.Before
import org.junit.Test


class ProductFactoryTest {
    def sfiGroupFactory = new ProductFactory()

    @Before
    public void setUp() {

        def product1 = new Product.Builder().
                withName("mudpump").
                withSfiGroupNumber(35).
                withSfiSubGroupNumber(1).build()

        def product2 = new Product.Builder().
                withName("barrelholder").
                withSfiGroupNumber(36).
                withSfiSubGroupNumber(1).build()

        def product3 = new Product.Builder().
                withName("bigbag").
                withSfiGroupNumber(35).
                withSfiSubGroupNumber(5).build()

        def product4 = new Product.Builder().
                withName("winch").
                withSfiGroupNumber(36).
                withSfiSubGroupNumber(3).build()


        sfiGroupFactory.addProducts(product1, product2, product3, product4)

    }

    @Test
    public void check_products_are_ordered_according_to_groups() {
        assert sfiGroupFactory.getProducts()*.name == ["mudpump", "bigbag", "barrelholder", "winch"]
    }
}
