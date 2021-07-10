import java.util.*;
class Problem7{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Input a number:");
int num=sc.nextInt();
for(int i=1;i<=10;i++){
System.out.println(num+"x"+i+"="+num*i);
}
}
}