package generics;

public class Doctor<T> {
    private T specialization;

    public Doctor(T specialization) {
        this.specialization = specialization;
    }

    public T getSpecialization() {
        return specialization;
    }

    public void doDoctorStuff(){
        System.out.println("doing doctor staff");
    }
}
