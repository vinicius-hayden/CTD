package entities;

public class FactoryEmployee {

    private static FactoryEmployee instance;

    public FactoryEmployee() {
    }

    public static FactoryEmployee getInstance() {
        if (instance == null) {
            instance = new FactoryEmployee();
        }
        return instance;
    }

    public Employee createEmployee(String givenEmp) {
        if(givenEmp.equals("EMP-INT")) {
            return new EmployeeDepRelationship();
        } else if (givenEmp.equals("EMP-EXT")) {
            return new HiredEmployee();
        }
        return null;
    }

}
