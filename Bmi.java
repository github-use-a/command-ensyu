import java.util.Scanner;

public class Main {
 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);

  String message = "" ;

  System.out.println("BMIを計算して、肥満度を表示します");

  System.out.println("身長を『m』で入力してください(150cmなら1.5と入力してください)");
  double height = scanner.nextDouble();
  System.out.println("体重を『Kg』で入力してください(42.5kgなら42.5と入力してください)");
  double weight = scanner.nextDouble();

  System.out.println("身長を『m』で入力してください(150cmなら1.5と入力してください)");
  double height2 = scanner.nextDouble();
  System.out.println("体重を『Kg』で入力してください(42.5kgなら42.5と入力してください)");
  double weight2 = scanner.nextDouble();


  double bmi = weight / (height * height);
  double bmi2 = weight2 / (height2 * height2);

  
  if (bmi < 18.5) {
   message = "やせ型";
 } else if (bmi >= 18.5 && bmi < 25) {
   message = "標準体系";
 } else if ( bmi >= 25 && bmi < 30){
   message = "肥満1度";
 } else if (bmi >= 30 && bmi < 35 ) {
   message = "肥満2度";
 }else if (bmi >= 35 && bmi < 40 ) {
   message = "肥満3度";
 }else if (bmi >= 40 )
   message = "肥満4度";


   if (bmi2 < 18.5) {
   message = "やせ型";
 } else if (bmi2 >= 18.5 && bmi2 < 25) {
   message = "標準体系";
 } else if ( bmi2 >= 25 && bmi2 < 30){
   message = "肥満1度";
 } else if (bmi2 >= 30 && bmi2 < 35 ) {
   message = "肥満2度";
 }else if (bmi2 >= 35 && bmi2 < 40 ) {
   message = "肥満3度";
 }else if (bmi2 >= 40 )
   message = "肥満4度";



   System.out.println("あなたのBMIは" + (double)Math.round(bmi*100)/100 + "です。");
   System.out.println("あなたは" + message + "です。");


   System.out.println("あなたのBMIは" + (double)Math.round(bmi2*100)/100 + "です。");
   System.out.println("あなたは" + message + "です。");

  }
}
