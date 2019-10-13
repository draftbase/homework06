package task3;

public class Test {
    public static void main(String[] args) {
        Product product1 = new Product("Usluga1", "Naprawa", 100, "podstawowa23");
        Product product2 = new Product("Sprzedaz", "Ksiazki", 32, "obnizona5");
        Calculate calculate = new Calculate();
        System.out.println(calculate.grossPrice(product1));
        System.out.println(calculate.grossPrice(product2));
    }
}
