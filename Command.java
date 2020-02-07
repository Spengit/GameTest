
public class Command {
//move, jump, standby
	private int scale;
	private int direction;
	
	public Command() {
		this.scale = this.direction = 0;
	}
	//Treating movement as vectors at the moment
	public Command(int scale, int direction) {
		this.setDirection(direction);
		this.setScale(scale);
	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	
}
