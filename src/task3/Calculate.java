package task3;

public class Calculate {

    public double grossPrice(Product product){
        switch (product.getCategory()){
            case "podstawowa23":
                return 1.23 * product.getNetPrice();
            case "obniżona8":
                return 1.08 * product.getNetPrice();
            case "obniżona5":
                return 1.05 * product.getNetPrice();
            default:
                return product.getNetPrice();
        }
    }
}
