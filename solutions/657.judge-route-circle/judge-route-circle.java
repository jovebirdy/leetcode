class Solution {
    public boolean judgeCircle(String moves) {
        int horizontal = 0;
        int vertical = 0;
        char[] move;
        move = moves.toCharArray();
        for(int i = 0; i < move.length; i++){
            if(move[i] == 'U'){
                vertical ++;
            }else if(move[i] == 'D'){
                vertical --;
            }else if(move[i] == 'L'){
                horizontal ++;
            }else if(move[i] == 'R'){
                horizontal --;
            }
        }
        return vertical == 0 && horizontal == 0;
    }
}
