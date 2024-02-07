package practicals;

		
		class person{

			String name;

			int age;

			public person(String name,int age) {

				this.name = name;

				this.age = age;

			}

		}


		class employee extends person{

			int employeeId;

			double salary;

			public employee(String name, int age,int empid,double salary) {

				super(name, age);

				this.employeeId = empid;

				this.salary = salary;

			}


		}

		public class Exp18 {


			public static void main(String[] args) {

				person p1 = new person("Jiyaaa",28);

				employee e1 = new employee("hiii",26,321,133245);

				

				System.out.print(p1.name+"  "+p1.age);

			}


		

	}