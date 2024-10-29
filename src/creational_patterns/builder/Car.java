package creational_patterns.builder;

public class Car {

    private final String engin;
    private final String transmission;
    private final String color;
    private final int airBags;
    private final boolean sunRoof;
    private final boolean navigationSystem;

    private Car(CarBuilder carBuilder) {
        this.engin = carBuilder.engin;
        this.transmission = carBuilder.transmission;
        this.color = carBuilder.color;
        this.airBags = carBuilder.airBags;
        this.sunRoof = carBuilder.hasSunRoof;
        this.navigationSystem = carBuilder.hasNavigationSystem;
    }

    public String getEngin() {
        return engin;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getColor() {
        return color;
    }

    public int getAirBags() {
        return airBags;
    }

    public boolean isSunRoof() {
        return sunRoof;
    }

    public boolean isNavigationSystem() {
        return navigationSystem;
    }

    public static class CarBuilder {

        private final String engin;
        private final String transmission;
        private String color = "RED";
        private int airBags = 6;
        private boolean hasSunRoof = true;
        private boolean hasNavigationSystem = true;

        public CarBuilder(String engin, String transmission) {
            this.engin = engin;
            this.transmission = transmission;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setAirBags(int airBags) {
            this.airBags = airBags;
            return this;
        }

        public CarBuilder setHasSunRoof(boolean hasSunRoof) {
            this.hasSunRoof = hasSunRoof;
            return this;
        }

        public CarBuilder setHasNavigationSystem(boolean hasNavigationSystem) {
            this.hasNavigationSystem = hasNavigationSystem;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Engin: " + getEngin() + "\n" +
                "Transmission: " + getTransmission() + "\n" +
                "Color: " + getColor() + "\n" +
                "Air Bags: " + getAirBags() + "\n" +
                "Has Sun Roof: " + isSunRoof() + "\n" +
                "Has Navigation System: " + isNavigationSystem();
    }
}