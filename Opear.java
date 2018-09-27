package    com.briup.day5;
public  class Opear
{
	public   String name;
	public   int age;
	public  double   salary;
	public  void   say(){
	  System.out.print(name);
	  System.out.print(age);
	}
	public   double  addSalary(double  addMoney){
	   salary =salary+addMoney;
	   return  salary;
	}
}