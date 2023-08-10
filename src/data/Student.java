package data;

public class Student {

    private Long id;

    private String name;

    private EDesa desa;

    private ECategoryStudent categoryStudent;

    private EKelompok kelompok;

    private EGender gender;

    private String email;

    private String phoneNumber;

    private Integer age;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student(Long id, String name, EDesa desa, ECategoryStudent eCategoryStudent, EKelompok kelompok, EGender gender, String email, String phoneNumber, Integer age) {
        this.id = id;
        this.name = name;
        this.desa = desa;
        this.categoryStudent = eCategoryStudent;
        this.kelompok = kelompok;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;

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

    public EDesa getDesa() {
        return desa;
    }

    public void setDesa(EDesa desa) {
        this.desa = desa;
    }

    public ECategoryStudent geteCategoryStudent() {
        return categoryStudent;
    }

    public void seteCategoryStudent(ECategoryStudent eCategoryStudent) {
        this.categoryStudent = eCategoryStudent;
    }

    public EKelompok getKelompok() {
        return kelompok;
    }

    public void setKelompok(EKelompok kelompok) {
        this.kelompok = kelompok;
    }

    public EGender getGender() {
        return gender;
    }

    public void setGender(EGender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desa=" + desa +
                ", eCategoryStudent=" + categoryStudent +
                ", kelompok=" + kelompok +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }
}
