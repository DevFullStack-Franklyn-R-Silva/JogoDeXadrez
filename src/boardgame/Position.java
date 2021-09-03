package boardgame;

public class Position {
	private Integer row;
	private Integer column;

	// Constructor
	public Position(Integer row, Integer column) {
		this.row = row;
		this.column = column;
	}

	// Get and Set
	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}

	// Methods
	public void setValue(int row, int column) {

	}

	@Override
	public String toString() {
		return row + ", " + column;
	}
}
