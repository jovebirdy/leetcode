class Solution {
    public int calPoints(String[] ops) {
        int sum = Integer.parseInt(ops[0]);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(Integer.parseInt(ops[0]));
        for(int i = 1; i < ops.length; i++){
            switch(ops[i]){
                case "D" : list.add(list.get(list.size()-1)*2); sum += list.get(list.size()-1); break;
                case "C" : sum -= list.get(list.size()-1); list.remove(list.size()-1); break;
                case "+" : list.add(list.get(list.size()-1) + list.get(list.size()-2)); sum += list.get(list.size()-1); break;
                default  : list.add(Integer.parseInt(ops[i])); sum += list.get(list.size()-1);
            }
        }
        return sum;
    }
}
