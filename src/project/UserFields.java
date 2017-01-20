package project;

public enum UserFields {
    NAME("firstName"), LAST_NAME("lastName"), CITY("city"), ID("id"), EMAIL("email");
    private String name;
    private UserFields(String name) {
        this.name = name;
    }

}
