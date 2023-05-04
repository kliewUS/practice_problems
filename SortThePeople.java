public class SortThePeople {
    // 2418. Sort the people.
    // https://leetcode.com/problems/sort-the-people/
    // Create a TreeMap with type <Integer, String>
    // Put names as values and heights as keys.
    // Return the values
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> sorted = new TreeMap<Integer, String>(Collections.reverseOrder());
        String[] res = new String[names.length];

        Arrays.fill(res, "");

        for (int i = 0; i < names.length; i++) {
            sorted.put(heights[i], names[i]);
        }

        int j = 0;

        for (String name : sorted.values()) {
            res[j] = name;
            j++;
        }

        return res;
    }
}
