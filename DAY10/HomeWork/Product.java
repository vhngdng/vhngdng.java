public class Product {
    private int id;
    private String name;
    private String description;
    private int amount;
    private int price;
    private String unit;
    
    public Product(int id, String name, String description, int amount, int price, String unit) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.price = price;
        this.unit = unit;
    }

    @Override
    public String toString() {
        String text = " Name: " + name + " | ID: " + id + " | description: " + description
                + " | price: " + price + " | amount: " + amount + " | unit: " + unit + "\n";
        return text;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public String getUnit() {
        return unit;
    }

    public void setAmout (int amount){
        this.amount = amount;
    }
}
