import java.util.Scanner;

public class Main {
 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);

  String message = "" ;

  System.out.println("BMI���v�Z���āA�얞�x��\�����܂�");

  System.out.println("�g�����wm�x�œ��͂��Ă�������(150cm�Ȃ�1.5�Ɠ��͂��Ă�������)");
  double height = scanner.nextDouble();
  System.out.println("�̏d���wKg�x�œ��͂��Ă�������(42.5kg�Ȃ�42.5�Ɠ��͂��Ă�������)");
  double weight = scanner.nextDouble();

  double bmi = weight / (height * height);
  
  if (bmi < 18.5) {
   message = "�₹�^";
 } else if (bmi >= 18.5 && bmi < 25) {
   message = "�W���̌n";
 } else if ( bmi >= 25 && bmi < 30){
   message = "�얞1�x";
 } else if (bmi >= 30 && bmi < 35 ) {
   message = "�얞2�x";
 }else if (bmi >= 35 && bmi < 40 ) {
   message = "�얞3�x";
 }else if (bmi >= 40 )
   message = "�얞4�x";



   System.out.println("���Ȃ���BMI��" + (double)Math.round(bmi*100)/100 + "�ł��B");
   System.out.println("���Ȃ���" + message + "�ł��B");

  }
}
