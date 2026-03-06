package question08;

public class Array {
	public static void main(String[] args) {
		int sum = 0;
		int intArray[][] = new int[3][4];
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = (int)(Math.random()*10);
				System.out.print(intArray[i][j]+"\t");
				sum += intArray[i][j];
			}
			System.out.println();
		}
		System.out.println("합은 "+sum);
	}
}
