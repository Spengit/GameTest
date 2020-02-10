
public class Player {

	private String name;
	private double score;
	private Command command;
	private HitBox hitBox;
	
	private class HitBox{
		private boolean[][] hitBoxArea;
		private final int X = 4;
		private final int Y = 4;
		
		private HitBox(){
			hitBoxArea = new boolean[][] {{false, true, true, false},
										  {false, true, true, false},
										  {true,  true, true, true },
										  {true, false, false, true}};
		}
		
		public int getX(){
			return X;
		}
		public int getY(){
			return Y;
		}
		public boolean getHit(int x, int y){
			return hitBoxArea[x][y];
		}
	}

	public Player() {
	this.name = "no-name";
	this.score = 0;
	
	hitBox = new HitBox();
	
	}
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return this.score;
	}

	public void setScore(double score) {
		this.score = score;
	}

}
