package data;

public enum EGender {
    MALE("Male"),
    FEMALE("Female");

    private String name;

    EGender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
