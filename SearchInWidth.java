import java.util.*;

public class SearchInWidth {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("You", List.of("Maggy", "Jack", "Alex", "Zorro"));
        graph.put("Maggy", List.of("Franky", "Robin", "Jack", "You"));
        graph.put("Jack", List.of("Poul", "Victor", "You", "Maggy"));
        graph.put("Alex", List.of("Joe", "You", "Zorro"));
        graph.put("Zorro", List.of("Alex", "Alexander", "Victor", "Bob", "You"));

        // Searching for a person which length of name = ?
        // Test 1
        System.out.println(searchInWidth(graph, 9));

        // Test 2
        System.out.println(searchInWidth(graph, 3));

        // Test 3
        System.out.println(searchInWidth(graph, 10));
    }

    public static String searchInWidth(Map<String, List<String>> graph, int lengthOfName) {
        Queue<String> queue = new PriorityQueue<>();
        queue.addAll(graph.get("You"));
        List<String> viewed = new ArrayList<>();
        while (!queue.isEmpty()) {
            String person = queue.poll();
            if (!viewed.contains(person)) {
                if (person.length() == lengthOfName) {
                    return person;
                }
                else {
                    if (graph.get(person) != null)
                        queue.addAll(graph.get(person));
                    viewed.add(person);
                }
            }
        }
        return "There is not person which length of name = " + lengthOfName;
    }
}
