import java.util.*;

public class TeamsForProject {

	public static void main(String[] args) {

		List names = new ArrayList();

		int groupSize = 0;

		Scanner sc = new Scanner(System.in);

		for (groupSize = 0; groupSize < 21; groupSize++) {
			System.out.println("Input name: ");

			String teamMate = sc.nextLine();
			

			names.add(teamMate);

		}
		
		System.out.println(names);
		

        Random generator = new Random();
        int offset = generator.nextInt(names.size() - 1) + 1;
        
        for(int i = 0; i < names.size(); i++)
        {
        	System.out.println(names.get(i) +
        			" is with " + names.get((i + offset) % names.size()));
        }
	}

}
