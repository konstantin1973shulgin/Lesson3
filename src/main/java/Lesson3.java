

import java.util.Scanner;//импорт сканера




    public class Lesson3 {

        public static void main(String[] args) {
            guessTheNumber();
        }



        public static void guessTheNumber() {
            Scanner scan = new Scanner(System.in); //переменная scan относится к классу Scanner

            int a,b = 1;
            int n = (int) (Math.random() * 10);// получаем случайное число от 0 до 1, умнажаем на 10, приводим к целому (int)
            System.out.println("Угадай число от 0 до 9 \n\rДано 3 попытки для отгадывания");
            for (int i = 0; i < 3; i = i+1) { // цикл выполняется,пока b меньше 3
                System.out.println("Попытка " + (i + 1) + ": ");
                a = scan.nextInt();//считываем число с консоли
                if (a < n) System.out.println("Число больше!");
                if (a > n) System.out.println("Число меньше!");
                if (a == n) {
                    System.out.println("Вы угадали!");
                    System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                    b = scan.nextInt();
                    if (b == 1) {
                        guessTheNumber();// текуший метод вызывает сам себя
                        return;//завершение текушего метода
                    } else {
                        System.out.println("Спасибо за игру!");
                        break;//выход из цикла
                    }
                }
            }
            if (b == 1){
                System.out.println("Вы не угадали :(");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                b = scan.nextInt();//считываем число с консоли
                if (b == 1){
                    guessTheNumber();
                    return;
                }
            }

            System.out.println("Игра окончена!");
        }
    }

