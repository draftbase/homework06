package task3;

public class Product {
    private String name;
    private String desc;
    private double netPrice;
    private String category;

    public Product() {
    }

    public Product(String name, String desc, double netPrice, String category) {
        this.name = name;
        this.desc = desc;
        this.netPrice = netPrice;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(double price) {
        this.netPrice = netPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
