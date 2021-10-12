import java.util.ArrayList;
import java.util.List;

public class SortByChoice {
    public static void main(String[] args) {
        // Test 1
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(3);
        list1.add(9);
        list1.add(1);
        list1.add(4);

        // Test 2
        List<Integer> list2 = new ArrayList<>();
        list2.add(7);
        list2.add(1);
        list2.add(7);
        list2.add(4);

        // Test 3
        List<Integer> list3 = new ArrayList<>();
        list3.add(-2);
        list3.add(1);
        list3.add(20);
        list3.add(-4);

        System.out.println("Test 1: " + sortByChoice(list1).toString());
        System.out.println("Test 2: " + sortByChoice(list2).toString());
        System.out.println("Test 3: " + sortByChoice(list3).toString());
    }

    public static List<Integer> sortByChoice(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        int sizeOfList = list.size();
        for (int i = 0; i < sizeOfList; i++) {
            int indexOfMinElement = searchIndexOfMinElement(list);
            result.add(list.get(indexOfMinElement));
            list.remove(indexOfMinElement);
        }
        return result;
    }

    public static int searchIndexOfMinElement(List<Integer> list) {
        int indexOfMinElement = 0;
        int minElement = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < minElement) {
                minElement = list.get(i);
                indexOfMinElement = i;
            }
        }
        return indexOfMinElement;
    }
}
