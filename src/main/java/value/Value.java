package value;

public class Value {
    public Value(String word, String row, String column, String bgcolor) {
        this.word = word;
        this.row = row;
        this.column = column;
        this.bgcolor = bgcolor;
    }

    private String word;
    private String row;
    private String column;
    private String bgcolor;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getBgcolor() {
        return bgcolor;
    }

    public void setBgcolor(String bgcolor) {

        this.bgcolor = bgcolor;
    }
}
