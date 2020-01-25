package lv.sandra;

import lv.sandra.geometric.Circle;
import lv.sandra.player.FootballPlayer;

public class TestJava {
	

	public static void main(String[] args) {
		
		FootballPlayer player = new FootballPlayer("Ronaldo", "Forward", 7, true, 184, 86);
		
		
		
				System.out.println(player.getName());
				System.out.println(player.getPosition());
				System.out.println(player.getShirtNumber());
				System.out.println(player.isBuild());
				System.out.println(player.getHeigth());
				System.out.println(player.getWeigth());
				
				
				player.setShirtNumber(10);
				
				System.out.println("__________________________");
				
				System.out.println(player.getName());
				System.out.println(player.getPosition());
				System.out.println(player.getShirtNumber());
				System.out.println(player.isBuild());
				System.out.println(player.getHeigth());
				System.out.println(player.getWeigth());
				
				
	}

}

