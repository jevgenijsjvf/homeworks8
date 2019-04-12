package HW12Final;

public interface BaseOperation<T extends Product>  {
    void addProduct(T item);
    T findById(Long id) throws ItemNotFoundException;
    T findByCategory(Enum Category);
    void delete(Long id);
}
