
public class ArrayDuplicate {
	public static void main(String [] args) {
		
		String [] programming = {"Germany", "Holland", "China", "Malaysia", "Kenya", "Holland"};
		String result;
		
		for (int i = 0; i < programming.length; i++) {
		 result = programming[i];
		
		 for (int j = i + 1; j < programming.length; j++) {
			 if (result.equals(programming[j])) {
				 System.out.println("Duplicate value is:" + result);
		}
		}
		}
	}
}
