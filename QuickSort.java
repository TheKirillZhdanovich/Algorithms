import java.util.ArrayList;
import java.util.List;

public class QuickSort {

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

        System.out.println("Test 1: " + quickSort(list1).toString());
        System.out.println("Test 2: " + quickSort(list2).toString());
        System.out.println("Test 3: " + quickSort(list3).toString());
    }

    public static List<Integer> quickSort(List<Integer> listOfNumbers) {
        if (listOfNumbers.size() < 2) {
            return listOfNumbers;
        }
        else {
            int pivot = listOfNumbers.get(0);
            List<Integer> result = new ArrayList<>();
            result.addAll(quickSort(lessThanPivot(listOfNumbers, pivot)));
            result.add(pivot);
            result.addAll(quickSort(biggerThanPivot(listOfNumbers, pivot)));
            return result;
        }
    }

    public static List<Integer> lessThanPivot(List<Integer> list, int pivot){
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= pivot) {
                result.add(list.get(i));
            }
        }
        return result;
    }

    public static List<Integer> biggerThanPivot(List<Integer> list, int pivot){
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > pivot) {
                result.add(list.get(i));
            }
        }
        return result;
    }
}
