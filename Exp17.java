package practicals;
// import java.util.*;  used when we use scanner class

public class Exp17 {


	public static void main(String[] args) {

		student s1 = new student();

		s1.setdata(1, "Jiya", 80, 77, 60);

		s1.displaydata();

		System.out.print("Average is: "+ s1.avg());

	}


}


	
		class student{

			int studentId;

			String StudentName;

			int Sub1;

			int Sub2;

			int Sub3;

			

			void setdata(int studid,String studname,int sub1,int sub2,int sub3) {

				this.StudentName = studname;

				this.Sub1 = sub1;

				this.Sub2 = sub2;

				this.Sub3 = sub3;

			}

			

			void displaydata() {

				System.out.print("marks of student ");

				System.out.println(StudentName);

				System.out.println("Sub1 "+Sub1);

				System.out.println("Sub2 "+Sub2);

				System.out.println("Sub3 "+Sub3);

			}

			int avg(){

				return (Sub1+Sub2+Sub3)/3;

			}

		}






