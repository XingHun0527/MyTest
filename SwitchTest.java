package  com.briup.day5;
public   class SwitchTest
{
	public   void  test1(int  a){
	  switch(a){
	     case 1:
			  System.out.println("星期一");
		      break;
         case 2:
			  System.out.println("星期二");
		      break;
	     case 3:
		      System.out.println("星期三");
		      break;
        default:
			 System.out.println("输入的数据有误");
		      break;
	  }
	}

    public  void  howMuchDay(int  year,int mouth){
		 switch(mouth){
		    case 1: 
            case 3:
            case 5:
            case 7:
            case 8:
			case 10:
            case 12:
				  System.out.println(year+"年"+mouth+"月有31天");
			      break;
		    case 4: 
            case 6:
            case 9:
            case 11:
				 System.out.println(year+"年"+mouth+"月有30天");
			     break;
            case 2:
				String  str=
				this.isLeapYear(year)?"本月有29天":"本月有28天";
                System.out.println(str);
				break;
            default:
				System.out.println("你输入的月份有误");
			    break;
				
		 }
	}

    public   boolean  isLeapYear(int year){
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

	public  static  void main(String[] args){
	 SwitchTest  test  = new SwitchTest();
	 //test.test1(5);
	 test.howMuchDay(2020,2);
 
	}
}