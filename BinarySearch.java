import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        // Test 1
        int elementToSearch1 = 3;
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        // Test 2
        int elementToSearch2 = -4;
        List<Integer> list2 = new ArrayList<>();
        list2.add(-4);
        list2.add(-1);
        list2.add(3);
        list2.add(4);
        
        System.out.println("Test 1: " + binarySearch(elementToSearch1, list1));
        System.out.println("Test 2: " + binarySearch(elementToSearch2, list2));
    }

    public static int binarySearch(int element, List<Integer> list){
        int left_limit = 0;
        int right_limit = list.size() - 1;
        int current_index = (left_limit + right_limit) / 2;

        while (left_limit != right_limit) {
            if(list.get(current_index) == element) {
                return current_index;
            }
            else if (list.get(current_index) > element) {
                right_limit = current_index;
                current_index = (left_limit + right_limit) / 2;
            }
            else {
                left_limit = current_index;
                current_index = (left_limit + right_limit) / 2;
            }
        }
        return current_index;
    }
}
