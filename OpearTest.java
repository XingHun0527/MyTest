package   com.briup.day5;

public   class OpearTest{
  public  static  void main(String[] args){
	  //  == :
	  int   a =10;
	  int b  =10;
	  System.out.println(a==b);//true
	  Opear o1  = new Opear();//com.briup.day4.Opear@12
      Opear o2  = new Opear();//com.briup.day4.Opear@13
      System.out.println(o1);
	  System.out.println(o2);
	  System.out.println(o1==o2);//false
	  //为了比较对象更加方便  除了==之外，Java在Object存放一个equals ,
	  //也可以用来比较是不是相等
	  System.out.println(o1.equals(o2));//false
	  /*this=o1=com.briup.day4@12
	  obj =o2=com.briup.day4@13
     */
	  //System.out.println(a.equals(b));

	  String   str ="hello";
	  String str1="hello";
	  System.out.println(str==str1);//true

	  String  str3  = new String("hello");
	  String  str4  = new String("hello");
	  System.out.println(str3==str4);//false
	  System.out.println(str3.equals(str4));//true
  }
}