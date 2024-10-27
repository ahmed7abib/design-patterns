package creational_patterns.prototype;

public class RegularEmployee implements ProtoType, Cloneable {

    private int id;
    private String name;
    private Address address;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        String id = "Id: " + this.id;

        String name = "Name: " + this.name;

        String address = "Address: "
                + this.address.getCity()
                + ", "
                + this.address.getStreetName()
                + ", "
                + this.address.getBuilding();

        return id + "\n" + name + "\n" + address;
    }

    @Override
    public RegularEmployee copyInstance() {
        try {
            return (RegularEmployee) this.clone();
        } catch (Exception e) {
            return null;
        }
    }
}
