
public class Pair {

	private int x;
	private int y;
	
	public Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	@Override
	public boolean equals(Object o){
		if(o == null){
			return false;
		} else if(!(o instanceof Pair)){
			return false;
		} else {
			Pair p = (Pair) o;
			if(this.x == p.getX() && this.y == p.getY()){
				return true;
			} else {
				return false;
			}
		}
	}
	
}
