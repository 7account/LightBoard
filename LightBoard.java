public class LightBoard {
    private boolean[][] lights;
    public LightBoard(int numRows, int numCols) {
        lights = new boolean[numRows][numCols];
        for (int r = 0; r < lights[0].length; r++) {
            for (int c = 0; c < lights[0].length; c++) {
                if (Math.random() <= 0.4) lights[r][c] = true;
            }
        }
    }

    public boolean evaluateLight(int row, int col) {
        int numOnInCol = 0;
        for (int r = 0; r < lights.length; r++) {
            if (lights[r][col]) numOnInCol++;
        if (lights[row][col] && (numOnInCol % 2 == 0)) return false;
        else if (numOnInCol % 3 == 0) return false;
        if (lights[row][col] == true) return true;
        else return false;
        }
    }
}