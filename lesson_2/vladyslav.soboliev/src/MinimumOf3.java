public class MinimumOf3 {
public static void main(String[] params){
int num = Integer.parseInt(params[0]);
int num1 = Integer.parseInt(params[1]);
int num2 = Integer.parseInt(params[2]);
if (num <= num1 && num <= num2){
System.out.println("Минамальное число "+ num);
} else {
if (num1 <= num2){
System.out.println("Минимальное число " + num1);
} else {
System.out.println("Минимальное число " + num2);
}
}
}
}
