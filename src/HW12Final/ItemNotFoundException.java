package HW12Final;

public class ItemNotFoundException extends Exception {
    public ItemNotFoundException (Long id) {
        super(String.format("Item with id %s does not exist", id));
    }
}
