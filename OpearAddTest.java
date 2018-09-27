package   com.briup.day5;
public  class OpearAddTest
{
	 public   double  salary;
	public   static  void  main(String[] args){
	   int  a  =10;
	   int b  =10;
	   System.out.println(a+b);//20
	   //字符串拼接
	   System.out.println(1+2+"hello");//3hello
	   System.out.println(1+"hello"+2);//1hello2
	   System.out.println("hello"+1+2);//hello12
	   System.out.println(true+"hello"+1+2);//truehello12
	  //构建对象
	  OpearAddTest   op  =new   OpearAddTest();
	  op.salary=5000;
	  System.out.println("原本的工资"+op.salary);
	  op.addSalary(2000);
	  
	  //使用对象调用对象中的方法
	  op.say("明天需要放假");
	  op.say("后天也要放假");
	  op.say("即使放假也要学习");
	  System.out.println("今年涨薪水了，现在的工资是"+op.salary);
	}
	//我想说
	public   void say(String str){
	  System.out.println("我想说"+str+"说完了");
	}
	//涨工资
	public  double   addSalary(double   addMoney){
	  salary = salary+addMoney;
	   return  salary;
	}
}