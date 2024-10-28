package creation_patterns.prototype;

public class Address {

    private String streetName;
    private String building;
    private String city;

    public Address(String streetName, String building, String city) {
        this.streetName = streetName;
        this.building = building;
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
