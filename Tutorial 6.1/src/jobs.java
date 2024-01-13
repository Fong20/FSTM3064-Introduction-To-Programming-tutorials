
public class jobs {
	public static void main(String [] args) {
		//Array
		//String[] jobs = new String[5];
		
		//or
		
		//Array size is 5
		String[] jobs = {"Developer","Tester","QA","Manager","Admin"};
		
		//jobs[0] = "Developer";
		//jobs[1] = "Tester";
		//jobs[2] = "QA";
		//jobs[3] = "Manager";
		//jobs[4] = "Admin";
		
		//The i is referred to the index value
		//for(int i = 0; i < 5; i++) {
			//System.out.println(jobs[i]);
			
		//Use length to prevent runtime error as the program only goes through the programmed array length
			for(int i = 0; i < jobs.length; i++) {
				System.out.println(jobs[i]);
			}
		}
	}

//}
