package data;

public enum ECategoryStudent {
    PRA_REMAJA("Pra Remaja"),
    REMAJA("Remaja"),
    PGM("PGM");

    ECategoryStudent(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
