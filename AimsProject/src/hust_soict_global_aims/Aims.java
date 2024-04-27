package hust_soict_global_aims;
import hust_soict_global_aims_store.*;
import hust_soict_globalict_aims_media.*;
import hust_soict_globalict_aims_cart_Cart.*;

import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    return;
                case 1:
                    viewStore(store, cart, scanner);
                    break;
                case 2:
                    updateStore(store, scanner);
                    break;
                case 3:
                    seeCurrentCart(cart, scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }   
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void viewStore(Store store, Cart cart, Scanner scanner) {
        storeMenu();
        int choice = scanner.nextInt();
        switch (choice) {
            case 0:
                System.out.println("Returning to main menu...");
                break;
            case 1:
                Media media = Store.seeMediaDetail(store, scanner); // Gọi phương thức tĩnh từ lớp Store
                
                mediaDetailsMenu(); // Hiển thị menu chi tiết cho phương tiện
                int detailChoice = scanner.nextInt();
                switch (detailChoice) {
                    case 0:
                        break;
                    case 1:
                        if (media != null) { 
                            cart.addMedia(media); 
                            System.out.println("Media \"" + media.getTitle() + "\" added to cart.");
                        } else {
                            System.out.println("No media available to add to cart.");
                        }
                        break;
                    case 2:
                        store.playMedia(store, scanner);
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose again.");
                        break;
                }
                break;
        }
    }
    
    

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
        }

    public static void updateStore(Store store, Scanner scanner) {
        System.out.println("Options:");
        System.out.println("1. Add a media to the store");
        System.out.println("2. Remove a media from the store");
        System.out.println("0. Back");
        System.out.print("Please choose an option: ");
    
        int choice = scanner.nextInt();
    
        switch (choice) {
            case 0:
                System.out.println("Returning to main menu...");
                break;
            case 1:
                store.addMediaToStore(scanner);
                break;
            case 2:
                store.removeMediaFromStore(store,scanner);
                break;
            default:
                System.out.println("Invalid choice. Please choose again.");
                break;
        }
    }
    

    public static void seeCurrentCart(Cart cart, Scanner scanner) {
        cartMenu();
        int choice = scanner.nextInt();
        switch (choice) {
            // Implement logic for seeing current cart
        }
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter media in cart");
        System.out.println("2. Sort media in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
}
