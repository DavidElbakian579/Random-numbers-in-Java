/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasyntaxpro9l2;

/**
 *
 * @author David-pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* 1
        В этой задаче предстоит реализовать метод generateNumber(), 
        который будет возвращать случайное число от 0 до 99.
        В методе generateNumber() используй метод Math.random().
        */
        System.out.println(generateNumber());
        
        /* 2
        В этой задаче тебе предстоит реализовать метод getPrediction() в классе MagicBall, который будет работать как шар предсказаний.
        Он случайным образом возвращает фразу-ответ на заданный вопрос. В методе getPrediction() нужно использовать метод nextInt(int) класса Random, который должен возвращать значения от 0 до 7 включительно.
        В зависимости от результата работы метода nextInt(int) возвращается один из вариантов ответа:
        0 -> Бесспорно
        1 -> Определённо да
        2 -> Вероятнее всего
        3 -> Хорошие перспективы
        4 -> Спроси позже
        5 -> Попробуй снова
        6 -> Мой ответ — нет
        7 -> Весьма сомнительно
        Иначе вернуть null.        
        */
        
        System.out.println("Заработаю ли я себе на BMW?");
        System.out.println(MagicBall.getPrediction());
    }
    
    
    
    public static int generateNumber() {
        return  (int) (Math.random() * 100);
    }
    
}
