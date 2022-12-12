package tutorial7.seasons;

public class SeasonPrinter {
    public static String printSeasonName(Seasons seasons){
        switch (seasons){
            case AUTUMN -> {
                return "Jesień";
            }
            case SPRING -> {
                return "Wiosna";
            }
            case SUMMER -> {
                return "Lato";
            }
            case WINTER -> {
                return "Zima";
            }
        }

        return "Nie rozpoznano";
    }
}
