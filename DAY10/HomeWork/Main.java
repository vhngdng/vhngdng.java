import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> products = new ArrayList<>();

    public static void main(String[] args) {

        Product product1 = new Product(1, "apple", "eadible", 2, 30_000, "/kg");
        Product product2 = new Product(2, "television", "electronic", 100, 10_000_000, "/pc");
        Product product3 = new Product(3, "grape", "eadible", 5, 25_490, "/kg");
        Product product4 = new Product(4, "mobile phone", "electronic", 90, 7_000_000, "/pc");
        Product product5 = new Product(5, "table", "furniture", 1, 300_000, "/pc");
        Product product6 = new Product(6, "refrigerator", "electronic", 300, 6_500_000, "/pc");

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);

        System.out.println(products.toString());
        System.out.println("==============================================================");

        // Tim theo ten
        findByName();
        System.out.println("===============================================");
        // Tim theo ID
        findByID();
        System.out.println("===============================================");
        // Xoa product
        deleteProduct();
        System.out.println("===============================================");
        // Update amount
        updateAmountstatus();
        System.out.println("===============================================");

        // Unit duoi 5
        unitBelow5();
        System.out.println("===============================================");
        // Fine by value
        findByValue();
        System.out.println("===============================================");
    }

    // find by Name
    public static Product findByName() {
        Product productListFoundByName = null;
        System.out.println("Hay nhap ten muon tim: ");
        String word = scanner.nextLine();
        for (Product productList : products) {
            if (productList.getName().equals(word)) {
                productListFoundByName = productList;
            }
        }

        if (productListFoundByName == null) {
            System.out.println("Khong tim thay doi tuong");
        } else {
            System.out.println(productListFoundByName.toString());
        }
        return productListFoundByName;
    }

    // Find by ID
    public static Product findByID() {
        System.out.println("Hay nhap ID muon tim: ");
        int idNumber = scanner.nextInt();
        Product productFoundByID = null;
        for (Product list : products) {
            if (list.getId() == idNumber) {
                productFoundByID = list;
            }
        }

        if (productFoundByID == null) {
            System.out.println("Khong tim thay id nay");
        } else {
            System.out.println(productFoundByID.toString());
        }
        return productFoundByID;
    }

    // Xoa san pham
    public static void deleteProduct() {
        boolean isBoolean = false;
        Product productDel = null;
        while (true) {
            System.out.println("Xoa san pham theo ID hoac ten: (Name: 1)  |  (ID: 2)");
            int num = scanner.nextInt();
            scanner.nextLine();
            switch (num) {
                case 1: {
                    productDel = findByName();
                    products.remove(productDel);
                    System.out.println(products.toString());
                    return;
                }
                case 2: {
                    productDel = findByID();
                    products.remove(productDel);
                    System.out.println(products.toString());
                    return;
                }
                default: {
                    isBoolean = false;
                }

            }
        }
    }

    // Tim cac san pham co so luong duoi 5
    public static void unitBelow5() {
        System.out.println("San pham co so luong duoi 5 la: ");
        List<Product> productBelow5Unit = new ArrayList<>();
        for (Product i : products) {
            if (i.getAmount() < 5) {
                productBelow5Unit.add(i);
            }
        }
        if (productBelow5Unit.isEmpty()) {
            System.out.println("Khong co gia tri nao");
        } else {
            System.out.println(productBelow5Unit.toString());
        }
    }

    // Tim cac san pham theo gia

    public static void findByValue() {
        boolean isBoolean = false;
        List<Product> productVal = new ArrayList<>();
        while (true) {
            System.out.println("Tim theo gia: < 50.000: (1)  |  50.000 <= value < 100.000: (2)  |  >= 100.000: (3)");
            int num = scanner.nextInt();
            scanner.nextLine();
            switch (num) {
                case 1: {
                    for (Product temp : products) {
                        if (temp.getPrice() < 50_000) {
                            productVal.add(temp);
                        }
                    }
                    if (productVal.isEmpty()) {
                        System.out.println("Khong co san pham nao duoi 50.000");
                    } else {
                        System.out.println(productVal.toString());
                    }
                    return;
                }
                case 2: {
                    for (Product temp : products) {
                        if (temp.getPrice() >= 50_000 && temp.getPrice() < 100_000) {
                            productVal.add(temp);
                        }
                    }
                    if (productVal.isEmpty()) {
                        System.out.println("Khong co san pham nao trong khoang tu 50.000 den duoi 100.000");
                    } else {
                        System.out.println(productVal.toString());
                    }
                    return;
                }
                case 3: {
                    for (Product temp : products) {
                        if (temp.getPrice() >= 100_000) {
                            productVal.add(temp);
                        }
                    }
                    if (productVal.isEmpty()) {
                        System.out.println("Khong co san pham nao tren 100.000");
                    } else {
                        System.out.println(productVal.toString());
                    }
                    return;
                }
                default: {
                    isBoolean = false;
                }
            }
        }
    }

    //Update amount status

    public static void updateAmountstatus() {
        boolean isBoolean = false;
        Product productChangeValue = null;
        while (true) {
            System.out.println("Update so luong san pham theo ID hoac ten: (Name: 1)  |  (ID: 2)");
            int num = scanner.nextInt();
            scanner.nextLine();
            switch (num) {
                case 1: {
                    productChangeValue = findByName();
                    System.out.println("Cap nhat so luong: ");
                    int newAmount = scanner.nextInt();
                    productChangeValue.setAmout(newAmount);
                    System.out.println(productChangeValue.toString());
                    return;
                }
                case 2: {
                    productChangeValue = findByID();
                    System.out.println("Cap nhat so luong: ");
                    int newAmount = scanner.nextInt();
                    productChangeValue.setAmout(newAmount);
                    System.out.println(productChangeValue.toString());
                    return;
                }
                default: {
                    isBoolean = false;
                }

            }
        }
        
    }
}