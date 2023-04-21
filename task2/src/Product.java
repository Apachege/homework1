public class Product {
    public String getName() {
        return name;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getVolume() {
        return volume;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public Integer getCost() {
        return cost;
    }

    private String name;
    private Integer volume;
    private Integer temperature;
    private Integer cost;

    public Product(String name, Integer volume, Integer temperature, Integer cost) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %d, %d", name, volume, temperature, cost);
    }
}
