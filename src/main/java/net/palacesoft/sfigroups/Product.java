package net.palacesoft.sfigroups;

import java.util.UUID;

public final class Product implements Comparable<Product> {
    private String id = UUID.randomUUID().toString();
    private String name;
    private String sfiGroup;
    private String sfiSubGroup;
    private int sfiGroupNumber;
    private int sfiSubGroupNumber;

    private Product() {
    }

    public static class Builder {

        private Product product = new Product();

        public Builder withName(String name) {
            product.name = name;
            return this;
        }

        public Builder withSfiGroup(String sfiGroup) {
            product.sfiGroup = sfiGroup;
            return this;
        }

        public Builder withSfiSubGroup(String sfiSubGroup) {
            product.sfiSubGroup = sfiSubGroup;
            return this;
        }

        public Builder withSfiGroupNumber(int sfiGroupNo) {
            product.sfiGroupNumber = sfiGroupNo;
            return this;
        }

        public Builder withSfiSubGroupNumber(int sfiSubGroupNo) {
            product.sfiSubGroupNumber = sfiSubGroupNo;
            return this;
        }

        public Product build() {
            return product;
        }

    }


    public String getSfiGroup() {
        return sfiGroup;
    }

    public String getSfiSubGroup() {
        return sfiSubGroup;
    }

    public int getSfiGroupNumber() {
        return sfiGroupNumber;
    }

    public int getSfiSubGroupNumber() {
        return sfiSubGroupNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (!id.equals(product.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public int compareTo(Product o) {
        int sfiGroup = this.getSfiGroupNumber() - o.getSfiGroupNumber();
        int sfiSubGroup = this.getSfiSubGroupNumber() - o.getSfiSubGroupNumber();
        return sfiGroup == 0 ? sfiSubGroup : sfiGroup;
    }
}
