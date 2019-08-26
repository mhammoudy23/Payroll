import java.util.*;

class payroll {
float hours;
int sales;
float ot;
int pay;
int choice;
int wage;
float salary;

	public payroll(float hours,int sales,int choice,float ot, int pay, int wage, float salary){
		this.hours=hours;
		this.sales=sales;
		this.ot = ot;
		this.pay = pay;
		this.choice = choice;
		this.wage = wage;
		this.salary = salary;

	}
	public void menu(int choice) {
		switch(choice) {
		case 1:
			SalEmp(pay);
			break;
		
		case 2:
			HourEmp( hours, ot, wage,  pay);
			break;
		case 3:
			ComEmp( pay);
			break;
		case 4:
			BaseEmp(sales, salary);
			break;
		case 5:
			PeiceEmp(pay);
			break;
		}
	}
	
	public void SalEmp(int pay) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the salary of the employee?");
		salary=scanner.nextInt();
	}
private void HourEmp(int hours, float ot, int wage, int pay) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the hourly wage of this employee?");
        wage=scanner.nextInt();
		System.out.Println("How many hours has thos employee worked this week?");
		hours=scanner.nextInt();
		if(hours>40){
			ot=hours-40;
			hours=-ot;
			pay=wage(1.5) * ot;

		}

	}
public static int ComEmp(int pay) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("what percentage of the comission would you like for this employee?");
		float com = scanner.nextFloat(System.in);
		System.out.println("Total sales?" );
        int sales = scanner.nextInt( System.in );
		pay = (int) (sales * com);
		return pay;
	}
public static int BaseEmp(int sales, int salary) {
    Scanner scanner = new Scanner(System.in);
    System.out.println( "Employee Salary?" );
    salary = scanner.nextInt();
    salary *= 1.1;
    System.out.println( "total sales?" );
    int sales = scanner.nextInt();
    System.out.println( "Comission percentage?" );
    float com = scanner.nextFloat();

}
public static int PeiceEmp(int pay) {
    Scanner scanner = new Scanner(System.in);
    System.out.println( "Peices sold?" );
    int qty = scanner.nextInt();
    System.out.println( "comission per peice?" );
    int com = scanner.nextInt();
    com *= 1.01;
    pay = qty(com);
    return pay;
	}
	public void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please select the type of employee");
		System.out.println("1.Salaried Employee");
		System.out.println("2.Hourly Employee");
		System.out.println("3.Commission Employee");
		System.out.println("4.Base Salaried Comission Employee");
		System.out.println("5.Price Workers");
        choice = scanner.nextInt();
        menu(choice);
		
	}

}
