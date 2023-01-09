package doctor;

public class Doctor {
    private String name;
    private String surname;

    public Doctor(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSpecialization(){
        throw new NullPointerException();
    }

}
