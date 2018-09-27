package  com.briup.day5;
public  class OpearTest2
{
	public  static  void  main(String[] args){
	   int a=3;int b=2;
	  
	   boolean  c =true,d=true;
	   System.out.println(3&2);//2
	   System.out.println(c&d);
	   System.out.println(3|2);//3
	   System.out.println(c|d);
	   System.out.println(3^2);//
	   System.out.println(c^d);
	   System.out.println(~2);

	 //  System.out.println(~(true));错  ~不能作用于 boolean
	
	  System.out.println(true&&false);
	  System.out.println(true||false);
      int str  =10>3?(10-3):(3-10）;
	  System.out.println(str);
	  /*
	    声明一个方法，我给传递一个分数过去 ，你帮我判断出
		这个分数对应 优秀  90
		良好 
		
		80---90
		及格
		  60-70
		不及格 60
	  */
	}
}