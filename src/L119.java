import java.util.ArrayList;
import java.util.List;

public class L119 {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> listToReturn = new ArrayList<Integer>();
        ArrayList<Integer> previousList;
        listToReturn.add(1);
        for (int i = 1; i<=rowIndex; i++) {
            previousList = new ArrayList<>(listToReturn);
            for (int j = 1; j<previousList.size(); j++) {
                listToReturn.set(j, previousList.get(j - 1) + previousList.get(j));
            }
            listToReturn.add(1);
        }
        return listToReturn;
    }
}
