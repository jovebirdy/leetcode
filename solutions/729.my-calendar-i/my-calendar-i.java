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

/* faster solution, using binary tree
class MyCalendar2 {

    class Node {//节点有起始结束时间和左右子节点
        public Node(int start, int end) {
            l = start;
            r = end;
        }

        int l, r;
        Node left, right;
    }

    Node root = null;

    public boolean book(int start, int end) {
        if (root == null) {
            root = new Node(start, end);
        } else {
            Node cur = root;
            Node pre = null;//父节点
            boolean leftTag = false;//记录该插入的节点是左子还是右子
            while (cur != null) {
                pre = cur;
                if (end <= cur.l) {//应该在当前节点的左侧，往左子递归
                    leftTag = true;
                    cur = cur.left;
                } else if (start >= cur.r) {//应该在当前节点的右侧，往右子递归
                    leftTag = false;
                    cur = cur.right;
                } else {// 有重叠，不应该插入，返回false
                    return false;
                }
            }
            if (leftTag) {//根据tag确定是父亲的左子还是右子
                pre.left = new Node(start, end);
            } else {
                pre.right = new Node(start, end);
            }
        }
        return true;
    }
}
*/

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
