package homework3;

public class Task4 {

//  Сломанный лифт
//  Лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж.
//  Лифт сломан. Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем
//  подьеме лифт превысил количество этажей, то считается что лифт поднялся на самый верх. Найдите
//  количество подьемов, которые понадобятся лифту.
//
//
//
//  Пример начальных данных:
//  H = 200, N = 50, M = 1
//  Ответ: 5
//  Объяснение:
//  Первый подьем: 50 - 1 = 49
//  Второй подьем: 49 + 50 - 1 = 98
//  Третий подьем: 98 + 50 - 1 = 147
//  Четвертый подьем: 147 + 50 - 1 = 196
//  Пятый подьем: выйти за пределы H.
//
//
//  Реализовать метод numberOfLifts(int floors, int stepUp, int stepDown)
//  Метод должен быть универсальным, то есть корректно работать с любым набором входных данных.

    public static void main(String[] args) {

        int floors = 200;
        int stepUp = 50;
        int stepDown = 1;
        int numLifts = numberOfLifts(floors, stepUp, stepDown);

        System.out.println(numLifts);
    }
        private static int numberOfLifts(int floors, int stepUp, int stepDown) {

            int numLifts = 0;
            int currentFloor = 0;

            while (currentFloor < floors) {
                currentFloor += stepUp;
                numLifts++;
                if (currentFloor >= floors) {
                    break;
                }
                currentFloor -= stepDown;
            }
            return numLifts;
        }

}
