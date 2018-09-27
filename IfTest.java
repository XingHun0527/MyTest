package   com.briup.day5;
public  class IfTest
{
	public   void   ifOverClass(String tongzhi){
	   if(tongzhi.equals("封楼")){
	     System.out.println("下课，回去休息");
	   }else{
	      System.out.println("继续上课");
	   }
	}

	public   void   ifOverClass1(String tongzhi){
	   if(tongzhi.equals("封楼")){
	     System.out.println("下课，回去休息");
	   }
	     System.out.println("继续上课");
	   
	}
   public  void   changeDay(int day){
      if(day==1){
	    System.out.println("星期一");
	  }else{
	      if(day==2){
		    System.out.println("星期二");
		  }else{
		     if(day==3){
			    System.out.println("星期三");
			 }else{
			   System.out.println("数字输入有误");
			 }
	  }
	  }
   }


      public  void   changeDay1(int day){
      if(day==1){
	    System.out.println("星期一");
	  }else if(day==2){
		   System.out.println("星期二");
	  }else if(day==3){
		  System.out.println("星期三");
	  }else{
	    System.out.println("输入日期有误");
	  }
     }


 public   boolean  sLeapYear(int year){
	 boolean   flag=true;
   // 能够被4 整除但是不能被100整除    ||   被400整除
   if((year%4==0 && year%100!=0)||year%400==0){

      System.out.println("今年是闰年");
	   flag=true;
   }else {
      System.out.println("今年是平年");
	   flag =false;
   }
     return   flag;
 }

}