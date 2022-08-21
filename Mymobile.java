package week1;

public class Mymobile {
 String a;
 int b;
 boolean c;
 public void makeCall() {
	 b=12;
	 System.out.println("make call");
 }
 public void sendMsg() {
	 c=true;
	 System.out.println("send msg");
 }
 private void payBills() {
	 a="hello";
	 System.out.println("pay Bills");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Mymobile mobile=new Mymobile();
  mobile.makeCall();
  mobile.sendMsg();
  mobile.payBills();
  System.out.println(mobile.a);
  System.out.println(mobile.b);
  System.out.println(mobile.c);
	}

}
