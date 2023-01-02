package tutorial8;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {
        Set<Doctor> doctors = new TreeSet<>();

        doctors.add(new Doctor(40, "Tomasz"));
        doctors.add(new Doctor(1, "Konradek"));
        doctors.add(new Doctor(30, "Andrzej"));
        doctors.add(new Doctor(4, "Adam"));
        doctors.add(new Doctor(10, "Wojciech"));

        System.out.println(doctors);

        Set<Doctor> doctorsCustomSort = new TreeSet<>(new Comparator<Doctor>() {
            @Override
            public int compare(Doctor o1, Doctor o2) {
                return Integer.compare(o1.getName().length(), o2.getName().length());
            }
        });

        doctorsCustomSort.addAll(doctors);

        System.out.println(doctorsCustomSort);
    }
}
