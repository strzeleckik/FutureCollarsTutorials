package tutorial7;

public class TextChecker {

    public static int countAllLetters(String text){
        if(text == null){
            return 0;
        }
        return text.length();
    }

    public static boolean hasEvenLength(String text){
        if(text == null || text.isEmpty()){
            return false;
        }
        return text.length() % 2 == 0;
    }
}
