class MyCalendar {

    TreeMap<Integer, Integer> map;
    public MyCalendar() {
      map = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        Integer floor = map.floorKey(end - 1);
        if (floor != null && (floor >= start || map.get(floor) > start))
            return false;
        map.put(start, end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
