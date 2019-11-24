package Appium.Appium;

public class InterviewPracice {

	public static void main(String[] args) {
		
		//parse to int and print
		int x = (int)6.5;
		System.out.println(x + "parse to int example");
		
		//
		for(int i=1;i<=x;i++) {
			if(i<3) {
				System.out.println("i less than " + i);
			}else {
				System.out.println("i greater than 3");
			}
			System.out.println(i + "loop result");
		}
		
		String str = "EHAB DYAB ALI"; 
        String[] arrOfStr = str.split(" ", 2); 
  
        for (String a : arrOfStr) 
            System.out.println(a);

		int years[]= new int[3];
		
//		int years[]= new int[] {1,2,3,4,5,6};
		years[0] = 10;
		years[1] = 20;
		years[2] = 30;
		System.out.println(years.length);
		
		
		for(int i=0;i<=years.length - 1;i++) {
			System.out.println(years[i]);
			
		}
		
        
    }
	

	}
