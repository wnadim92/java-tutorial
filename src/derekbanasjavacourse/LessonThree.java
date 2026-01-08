package derekbanasjavacourse;

public class LessonThree {

	public static void main(String[] args)
	{	
		char theGrade = 'z';
		
		switch (theGrade)
		{
		case 'A':
			System.out.println("Great job!");
			break;
		case 'B':
			System.out.println("Good job!");
			break;
		case 'C':
			System.out.println("Okay job!");
			break;
		default:
			System.out.println("Failed");
			break;
		}
	}
}
