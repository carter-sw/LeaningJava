package mission.week7.day6;

public class SneakersPackage {
    private Sneakers sneakers;

    public SneakersPackage() {
    }

    public void setSneakers(Sneakers sneakers) {
        this.sneakers = sneakers;
    }

    public Sneakers beUnBoxed() {
        return sneakers;
    }
}
