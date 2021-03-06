package uni.ulm.sopra.gomoku;

class Board {
    private final int boardSize;
    private final Field[][] fields;

    public Board(int size){
        this.fields = new Field[size][size];
        this.boardSize = size;

        for (int x = 0; x < boardSize; x++) {
            for (int y = 0; y < boardSize; y++) {
                setField(Field.Empty, x, y);
            }
        }

    }

    public Field getField(int x, int y) {
        return fields[x][y];
    }

    public void setField(Field field, int x, int y) {
        this.fields[x][y] = field;
    }
}
