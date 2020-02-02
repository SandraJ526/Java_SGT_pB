package lv.sandra.arraysandlists;

public class TestArraysAndLists {

	public static void main(String[] args) {

		String[] arr = new String[10];
		String [] arrWith = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		arrToString(arr);
		addElementToArr(arr);
		

	}

	public static void arrToString(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Index number is " + i + " " + arr[i]);
		}
	}
		
		public static void addElementToArr (String[] arr) {
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = arr[i] + i;
			}
		}
	}

