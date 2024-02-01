package mission;

public class SneakerPackage {
    private Sneakers sneakers;

    public SneakerPackage() {
    }

    public void setAaSneakers(Sneakers sneakers) {
        this.sneakers = sneakers;
    }

    public Sneakers beUnBoxed() {
        return sneakers;
    }
}
