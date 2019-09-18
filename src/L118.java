import java.util.ArrayList;
import java.util.List;

public class L118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listToReturn = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return listToReturn;
        }
        List<Integer> previousList = new ArrayList<>();
        previousList.add(1);
        listToReturn.add(previousList);
        for (int i = 1; i<numRows; i++) {
            ArrayList<Integer> newList = new ArrayList<>();
            previousList = listToReturn.get(i - 1);
            newList.add(1);
            for (int j = 1; j<previousList.size(); j++) {
                newList.add(previousList.get(j - 1) + previousList.get(j));
            }
            newList.add(1);
            listToReturn.add(newList);
        }
        return listToReturn;
    }
}
