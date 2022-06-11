package entities;

public class Container {

    private Integer id;
    private String description;
    private String countryOrigin;
    boolean TransportingHarmfulMaterials;

    public Container(Integer id, String description, String countryOrigin, boolean transportingHarmfulMaterials) {
        this.id = id;
        this.description = description;
        this.countryOrigin = countryOrigin;
        TransportingHarmfulMaterials = transportingHarmfulMaterials;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public boolean isTransportingHarmfulMaterials() {
        return TransportingHarmfulMaterials;
    }

    public void setTransportingHarmfulMaterials(boolean transportingHarmfulMaterials) {
        TransportingHarmfulMaterials = transportingHarmfulMaterials;
    }

    @Override
    public String toString() {
        return "Container{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", countryOrigin='" + countryOrigin + '\'' +
                ", TransportingHarmfulMaterials=" + TransportingHarmfulMaterials +
                '}';
    }
}
