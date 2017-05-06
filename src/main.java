import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Battleship b1 = new Battleship(10);
		b1.getBoardState();
		List<Pair> battleship = new ArrayList<>();
		Pair p1 = new Pair(2, 2);
		Pair p2 = new Pair(2, 3);
		Pair p3 = new Pair(2, 4);
		Pair p4 = new Pair(2, 5);
		battleship.add(p1);
		battleship.add(p2);
		battleship.add(p3);
		battleship.add(p4);
		System.out.println("Size of battleship map is: " + battleship.size());
		b1.placeShip("Battleship", battleship);
		b1.getBoardState();
		b1.shoot(2, 4);
		b1.shoot(2, 3);
		b1.shoot(2, 6);
		b1.shoot(2, 2);
		b1.shoot(2, 5);
		b1.getBoardState();
		
		

	}

}
