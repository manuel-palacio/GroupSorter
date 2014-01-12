package net.palacesoft.sfigroups

import org.junit.Before
import org.junit.Test


class GroupTest {
    def sfiGroupFactory = new GroupFactory()

    @Before
    public void setUp() {

        def product1 = new Product.Builder().
                withName("mudpump").
                withSfiGroup("a").
                withSfiSubGroup("b").
                withSfiGroupNumber(35).
                withSfiSubGroupNumber(1).build()

        def product2 = new Product.Builder().
                withName("barrelholder").
                withSfiGroup("c").
                withSfiSubGroup("d").
                withSfiGroupNumber(36).
                withSfiSubGroupNumber(1).build()

        def product3 = new Product.Builder().
                withName("bigbag").
                withSfiGroup("a").
                withSfiSubGroup("f").
                withSfiGroupNumber(35).
                withSfiSubGroupNumber(5).build()

        def product4 = new Product.Builder().
                withName("winch").
                withSfiGroup("c").
                withSfiSubGroup("h").
                withSfiGroupNumber(36).
                withSfiSubGroupNumber(3).build()


        sfiGroupFactory.addProducts(product1, product2, product3, product4)

    }

    @Test
    public void check_products_are_ordered() {
        assert sfiGroupFactory.getProducts()*.sfiGroup == ["a", "a", "c", "c"]
        assert sfiGroupFactory.getProducts()*.sfiSubGroup == ["b", "f", "d", "h"]
    }
}
