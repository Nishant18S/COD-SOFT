import java.util.Scanner;
class Student
{
	String Name;
    double Result;
    double percent;
	double Grade;
	int math;
	int physics;
	int chemistry;
	int english;
	int ad;
	int csw;
	static Scanner obj=new Scanner(System.in); 
	void Input()
	{
		System.out.print("Name:");
		Name=obj.nextLine();
		System.out.print("Mathematics=");
		 math=obj.nextInt();
		System.out.print("Physics=");
		 physics=obj.nextInt();
		System.out.print("Chemistry=");
		 chemistry=obj.nextInt();
		System.out.print("English=");
		 english=obj.nextInt();
		System.out.print("Algorithim Design=");
		 ad=obj.nextInt();
		System.out.print("Computer Science Workshop=");
		 csw=obj.nextInt();
		
	}
	double Total_Marks()
	{
		 Result=math+physics+chemistry+english+ad+csw;
		 //System.out.println(" Total Marks of Student " + Name + " is: " +Result);
		 return Result;
	}
	double Average_Percentage()
	{
		percent=Result/6;
		//System.out.println(" Average Percentage of Student " + Name + " is: " +percent);
		return percent;
	}
	String Grade()
	{
		if(percent>=30 && percent<50)
		{
			//System.out.println(Name + " has got Grade = "+ " ["+"E"+"] ");
			return "E";
		}
		else if(percent>=50 && percent<65)
		{
			//System.out.println(Name + " has got Grade = "+ " ["+"D"+"] ");
			return "D";
		}
		else if(percent>=65 && percent<80)
		{
			//System.out.println(Name + " has got Grade = "+ " ["+"C"+"] ");
			return "C";
		}
		else if(percent>=80 && percent<90)
		{
			//System.out.println(Name + " has got Grade = "+ " ["+"B"+"] ");
			return "B";
		}
		else if(percent>=90 && percent<100) 
		{
			//System.out.println(Name + " has got Grade = "+ " ["+"A"+"] ");
			return "A";
		}
		else
			return " You are FAIL";
		 
	}
	void Display()
	{
		System.out.println("*****Student Grade Calculator*****");	
		System.out.println();
		System.out.println("Name\tMath\tPhysics\t\tChemistry\tEnglish\t\tAlgorithim Design\tCSW\t");
		System.out.println(Name +"\t"+ math +"\t"+ physics +"\t\t"+ chemistry +"\t\t"+ english +"\t\t"+ ad +"\t\t\t"+ csw);
	}
	
	 
}

public class Task_2 
{
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std=new Student();
		std.Input();
		System.out.println();
		std.Display();
		double A=std.Total_Marks();
		double B=std.Average_Percentage();
        String P=std.Grade();
        System.out.println("Total Mark= " + A+" Average Percentage= " + B+" Grade= " + P);
        System.out.println("Total Mark\tAverage Percentage\tGrade");
		System.out.println(+A +"\t\t"+ B +"\t" + P);
        
	 }

}
