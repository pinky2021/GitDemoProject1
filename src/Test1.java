
public class Test1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int marks = 40;
		
		if(marks > 85) {
			System.out.println("A Grade");
		}else if(marks <= 85 && marks > 70) {
			System.out.println("B Grade");
		}else if(marks <= 70 && marks > 60) {
			System.out.println("C Grade");
		}else if(marks <= 60 && marks > 50) {
			System.out.println("D Grade");
		}else {
			System.out.println("Failed");
		}
	}

}

