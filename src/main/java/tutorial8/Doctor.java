package tutorial8;

public class Doctor implements Comparable<Doctor> {

    private int experienceYears;
    private String name;

    public Doctor(int experienceYears, String name) {
        this.experienceYears = experienceYears;
        if(name == null){
            this.name = "Nieznany";
        } else {
            this.name = name;
        }

    }

    @Override
    public int compareTo(Doctor o) {
        return Integer.compare(this.experienceYears, o.experienceYears);
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "dr. " + this.name + ", doswiadczenie: " + this.experienceYears;
    }
}
