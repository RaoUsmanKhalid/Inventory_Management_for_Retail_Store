package inventory;

import utils.FileHandler;
import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<Product> products;

    public InventoryManager() {
        this.products = FileHandler.readProducts();
    }

    public void addProduct(Product product) {
        products.add(product);
        FileHandler.writeProducts(products);
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products in inventory.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    public void updateProduct(int id, int newQuantity) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setQuantity(newQuantity);
                FileHandler.writeProducts(products);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void deleteProduct(int id) {
        products.removeIf(product -> product.getId() == id);
        FileHandler.writeProducts(products);
    }
}
