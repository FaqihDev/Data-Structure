package data;

public enum EKelompok {

    KLP1("Kelompok 1"),
    KLP2("Kelompok 2"),
    KLP3("Kelompok 3"),
    KLP4("Kelompok 4"),
    KLP5("Kelompok 5"),
    KLP6("Kelompok 6"),
    KLP7("Kelompok 7"),
    KLP8("Kelompok 8");


    private String name;

    EKelompok(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
