package lifegame5;

public class Cell {

	private boolean status;
	private int neighbours;

	public Cell(boolean b, int i) {
		this.status =b;
		this.neighbours = i;
	}

	public void tick() {
		if (this.neighbours < 2)
			this.status= false;
		
		
	}

	public boolean getStatus() {
		
		return status;
	}

}
