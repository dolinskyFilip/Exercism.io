import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public boolean isPangram(String input) {
        String s = input.toLowerCase().replaceAll(" ", "");
        char[] ch = s.toCharArray();
        Set set= new HashSet();
        for (char c: ch) {
            set.add(c);
        }

        if (set.size()==26)
            return true;
        else
            return false;

    }

}
