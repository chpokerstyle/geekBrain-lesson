package tasks.three;

public class Color {
 /** todo  4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
  * Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
  * если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
  * если больше 100 (100 исключительно) - “Зеленый”;
  */

 public void printColor(int value){
     if(value <=0) {
         System.out.println("красный");
     }else if (value>0 && value<=100){
         System.out.println("жёлтый");
     }else if (value>100){
         System.out.println("зелёный");
     }else {
         System.out.println("Я где-то ошибся. ОШИБКАААААААААА");
     }
 }
}
