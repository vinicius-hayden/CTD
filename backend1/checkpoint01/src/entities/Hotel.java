package entities;

public class Hotel {

    private Integer id;
    private String subsidiaryName;
    private String street;
    private String number;
    private String city;
    private String state;
    private boolean is5stars;

    public Hotel() {
    }

    public Hotel(Integer id, String subsidiaryName, String street, String number, String city, String state, boolean is5stars) {
        this.id = id;
        this.subsidiaryName = subsidiaryName;
        this.street = street;
        this.number = number;
        this.city = city;
        this.state = state;
        this.is5stars = is5stars;
    }

    public Hotel(String subsidiaryName, String street, String number, String city, String state, boolean is5stars) {
        this.subsidiaryName = subsidiaryName;
        this.street = street;
        this.number = number;
        this.city = city;
        this.state = state;
        this.is5stars = is5stars;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubsidiaryName() {
        return subsidiaryName;
    }

    public void setSubsidiaryName(String subsidiaryName) {
        this.subsidiaryName = subsidiaryName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isIs5stars() {
        return is5stars;
    }

    public void setIs5stars(boolean is5stars) {
        this.is5stars = is5stars;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", subsidiaryName = '" + subsidiaryName + '\'' +
                ", street = '" + street + '\'' +
                ", number = '" + number + '\'' +
                ", city = '" + city + '\'' +
                ", state = '" + state + '\'' +
                ", is5stars = " + is5stars +
                '}';
    }
}
