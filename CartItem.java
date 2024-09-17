


public class CartItem {
    Product product;
    int quantity;

    public CartItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return product.name + " (x" + quantity + ") - $" + (product.price * quantity);
    }
}
