package HW12Final;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
    Long id;
    String name;
    BigDecimal price;
    Enum Category;
    BigDecimal discount=new BigDecimal(0);
    String description = "empty";

    public Product(String name, BigDecimal price, Enum category) {
        this.name = name;
        this.price = price;
        Category = category;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Enum getCategory() {
        return Category;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) &&
                Objects.equals(name, product.name) &&
                Objects.equals(price, product.price) &&
                Objects.equals(Category, product.Category) &&
                Objects.equals(discount, product.discount) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, Category, discount, description);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", Category=" + Category +
                ", discount=" + discount +
                ", description='" + description + '\'' +
                '}';
    }
}
