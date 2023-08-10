package data;

public enum EDesa {

    THB("Taman Harapan Baru"),
    PUP("Pondok Ungu"),
    CBG("Chandrabaga"),
    PERUM("Perumnas"),
    HARJA("Harapan Jaya"),
    PGD("Pulogadung"),
    KRJ("Kranji"),
    BRN("Buaran"),
    CKG("Cakung");

    private String name;

    EDesa(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
