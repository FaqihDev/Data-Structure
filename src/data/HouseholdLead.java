package data;

public class HouseholdLead {

    private Long id;

    private String name;

    private Kelompok kelompok;

    public HouseholdLead() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Kelompok getKelompok() {
        return kelompok;
    }

    public void setKelompok(Kelompok kelompok) {
        this.kelompok = kelompok;
    }

    public HouseholdLead(Long id, String name, Kelompok kelompok) {
        this.id = id;
        this.name = name;
        this.kelompok = kelompok;
    }
}
