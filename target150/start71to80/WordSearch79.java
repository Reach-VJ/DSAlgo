package target150.start71to80;

public class WordSearch79 {

    public static void main(String [] args) {
        char[][] grid = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        String word = "ABD";
        WordSearch79 wordSearch = new WordSearch79();
        boolean found = wordSearch.exist(grid,word);
        System.out.println("Word found in grid --> "+found);
    }


    public boolean exist(char[][] board, String word) {
        boolean exists = false;
        for(int i = 0 ; i < word.length(); i++) {
            for(int j = 0; j < word.length(); j++) {
                if(exist(board,word,i,j,0))
                    return true;
            }
        }
        return exists;
    }

    public boolean exist(char[][] board, String word, int i, int j, int index) {
        if(index == word.length())
            return true;
        if(i < 0 ||  j < 0 || i >= word.length() || j >= word.length() || board[i][j] != word.charAt(index)) {
            return false;
        }
        char ch = board[i][j];

        boolean exist = (exist(board,word,i,j+1,index+1) ||
                exist(board,word,i,j-1,index+1) ||
                exist(board,word,i+1,j,index+1) ||
                exist(board,word,i+1,j,index+1));

        board[i][j] = ch;
        return exist;
    }
}
