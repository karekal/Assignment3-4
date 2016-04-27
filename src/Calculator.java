import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,answer=0;
		char operator;
Scanner input=new Scanner(System.in);
Maths maths=new Maths();
System.out.println("please enter num1:");
 a=input.nextDouble();
 Scanner input2= new Scanner(System.in);
 System.out.println("please enter operator:");
operator=input2.next().charAt(0);
Scanner input3=new Scanner(System.in);
System.out.println("please enter num2:");
b=input3.nextDouble();
switch(operator){
case '+': answer = Maths.add( a,b);
                   break;
case '-' : answer = Maths.sub(a,b);
                    break;
case '*' : answer = Maths.mul(a,b);
                    break;
case '/' : answer = Maths.div(a,b);
                    break;
case '^' : answer = Maths.pow(a,b);
                    break;

}
System.out.println(answer);

	}

}
