
public class testTest {

	public static void main(String[] args) {


		int[] num = {3, 1, 2, 4};
        int toFind = 3;
        boolean found = false;
        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }

	}


