/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasyntaxpro9l2;
import java.util.Random;

/**
 *
 * @author David-pc
 */
public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
//        String[] array = {CERTAIN, DEFINITELY, MOST_LIKELY, OUTLOOK_GOOD, ASK_AGAIN_LATER, TRY_AGAIN, NO, VERY_DOUBTFUL};
//        int num = new Random().nextInt(8);
//        return  num < 0 && num > 7 ? null : array[num];

        int random = new Random().nextInt(8);
        if (random == 0) {
            return CERTAIN;
        } else if (random == 1) {
            return DEFINITELY;
        } else if (random == 2) {
            return MOST_LIKELY;
        } else if (random == 3) {
            return OUTLOOK_GOOD;
        } else if (random == 4) {
            return ASK_AGAIN_LATER;
        } else if (random == 5) {
            return TRY_AGAIN;
        } else if (random == 6) {
            return NO;
        } else if (random == 7) {
            return VERY_DOUBTFUL;
        } else {
            return null;
        }
    }
}
