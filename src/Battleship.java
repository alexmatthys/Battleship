
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


public class Battleship {
	
	private int size;
	private int[][] board;
	private Map<String, List<Pair>> ships = new HashMap<>();
	
	
	public Battleship(int size){
		this.size = size;
		board = new int[size][size];
	}
	
	public int[][] getBoardState(){
		int cntr = 0;
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[0].length; j++){
				System.out.print(board[i][j] + ", ");
				cntr++;
				if(cntr == 10){
					System.out.println();
					cntr = 0;
				}
			}
		}
		return board;
	}
	
	public void shoot(int x, int y){
		if(board[x][y] == 1){
			System.out.println("Hit");
			board[x][y] = 2;
			String s = "";
			for(Map.Entry<String, List<Pair>> map : ships.entrySet()){
				for(Pair p : map.getValue()){
					if(p.getX() == x && p.getY() == y){
						s = map.getKey();
					}
				}
			}
			if(!(s.isEmpty())){
				ships.get(s).remove(new Pair(x, y));
			}
		} else {
			System.out.println("Miss");
		}
		
		String destroyedShip = "";
		for(Map.Entry<String, List<Pair>> entry : ships.entrySet()){
			if(entry.getValue().isEmpty()){
				System.out.println("Your " + entry.getKey() + " has sunk!");
				destroyedShip = entry.getKey();
				break;
			}
		}
		if(!(destroyedShip.isEmpty())){
			ships.remove(destroyedShip);
		}
		if(ships.isEmpty()){
			System.out.println("All your ships have sunk, you lose!");
		}
	}
	
	public void placeShip(String shipName, List<Pair> coordinates){
		ships.put(shipName, coordinates);
		for(Pair p : coordinates){
			board[p.getX()][p.getY()] = 1;
		}
		System.out.println(shipName + " has been placed.");
	}
	
	
}











