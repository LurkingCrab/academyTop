package main.homework.jule_5_year_23.contours_of_figures.loop_while;

public class ContoursOfFiguresLoopWhile {
    public static void main(String[] args) {
      getCountSize();

//        while (countSize <= 8) {
//            int count = 0;
//            while (count <= countSize) {
//                if (countSize == 8 || count == 1 || count == countSize) {
//                    System.out.print('*');
//                } else {
//                    System.out.print(' ');
//                }
//                count++;
//            }
//            System.out.println();
//            countSize++;
//        }
    }

    private static int getCountSize() {
        int countSize = 0;
        while (countSize <= 8) {
            int countLine = 0;
            while (countLine < 8 - countSize) {
                System.out.print(" ");
                countLine++;
            }
            int count = 0;
            while (count < 2 * countSize - 1) {
                if (countSize == 1 || countSize == 8 || count == 0 || count == 2 * countSize - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                count++;
            }
            System.out.println();
            countSize++;
        }
        return countSize;
    }

}