package  com.briup.day5;
public   class YiWeiOp
{
	public  static  void main(String[] args){
		//带符号右移  如果是正数 前面补0
		//如果是负数 前面 补1 
	  int a = 128>>3;
	  System.out.println(a);
	  int  b  =129>>3;
	  System.out.println(b);
	  int  c  =25>>2;
	  System.out.println(c);

    //不带符号右移  不管正负数 前面统一补0

	  int d =-12>>>2;
	  System.out.println(d);
	  //<<  将2进制数往左边方向移动，在后面统一补0
	  int  e =10<<2;
      System.out.println(e);
	  int f =-10<<2;
	  System.out.println(f);
	}
}