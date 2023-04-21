public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.addProduct(new Product("Americano", 200, 100, 80))
                .addProduct(new Product("black tea", 150, 95, 70))
                .addProduct(new Product("cold water", 200, 10, 10));

        for (int i = 0; i < coffeeMachine.getList().size(); i++) {
            System.out.println(coffeeMachine.getList().get(i));
        }
        Product found = coffeeMachine.findProduct("Americano");
        System.out.printf("Found: %s %n", found);
        Product sold = coffeeMachine.sellProduct(found);
        System.out.printf("Sell: %s %n", found);
        System.out.printf("Money in machine: %s %n", coffeeMachine.getAmount());
        for (int i = 0; i < coffeeMachine.getList().size(); i++) {
            System.out.printf("Remaining goods: %s %n", coffeeMachine.getList().get(i));
        }
    }
}