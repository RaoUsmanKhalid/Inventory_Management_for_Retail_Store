package inventory;

import utils.Validation;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Update Product Quantity");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");
            int choice = Validation.getInt("Enter your choice: ");

            switch (choice) {
                case 1:
                    int id = Validation.getInt("Enter product ID: ");
                    String name = Validation.getString("Enter product name: ");
                    int quantity = Validation.getInt("Enter quantity: ");
                    double price = Validation.getDouble("Enter price: ");
                    manager.addProduct(new Product(id, name, quantity, price));
                    break;
                case 2:
                    manager.displayProducts();
                    break;
                case 3:
                    int updateId = Validation.getInt("Enter product ID to update: ");
                    int newQuantity = Validation.getInt("Enter new quantity: ");
                    manager.updateProduct(updateId, newQuantity);
                    break;
                case 4:
                    int deleteId = Validation.getInt("Enter product ID to delete: ");
                    manager.deleteProduct(deleteId);
                    break;
                case 5:
                    System.out.println("Exiting system...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
