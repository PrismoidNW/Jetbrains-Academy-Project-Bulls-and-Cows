class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, java.util.List<Integer> list1, java.util.List<Integer> list2) {
        // implement the method
        list1.removeIf(e -> e != elem);
        list2.removeIf(e -> e != elem);

        return list1.size() == list2.size();
    }
}