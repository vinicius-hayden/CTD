package br.com.com.dh.c23.class_assignment.entities;

public class Dentist {

    private Integer id;
    private String name;
    private String email;
    private String registrationNum;
    private boolean acceptsInsurance;

    public Dentist(Integer id, String name, String email, String registrationNum, boolean acceptsInsurance) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.registrationNum = registrationNum;
        this.acceptsInsurance = acceptsInsurance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Dentist() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNum() {
        return registrationNum;
    }

    public void setRegistrationNum(String registrationNum) {
        this.registrationNum = registrationNum;
    }

    public boolean isAcceptsInsurance() {
        return acceptsInsurance;
    }

    public void setAcceptsInsurance(boolean acceptsInsurance) {
        this.acceptsInsurance = acceptsInsurance;
    }
}
