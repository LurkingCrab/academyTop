package main;



public class Main {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i++ - ++i);
//        System.out.println(i);
    }
        //        System.out.println("привте " + (12-10));
//        int count = 8;
//        int i = 0; // квадрат 8х8 пустой
//        while (i < count) {
//            int j = 0;
//            while (j < count) {
//                if (i == 0 || i == count - 1 || j == 0 || j == count - 1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int count = 10;// треугольник пустой
//        int a = 0;
//        while (a <= count) {
////            int i = 0;
////            while (i < count) {
//////                System.out.print(" ");
////                i++;
////            }
//            int j = 0;
//            while (j <= a) {
//                if (a == count || j == 0 || j == a) {
//                    System.out.print("9");
//                } else {
//                    System.out.print(" ");
//                }
//                j++;
//            }
//            System.out.println();
//
//            a++;
//
//        }
//        Scanner in = new Scanner(System.in);
//        System.out.println("¬ведите n: ");
//        int n = in.nextInt();
//        int[] x = new int[n];
//        System.out.println("»сходный массив");
//        for (int i = 0; i < n; i++) {
//            x[i] = (int) (Math.random() * 20);
//            System.out.print(x[i] + "\t");
//        }
//        System.out.println("\nArray after reshuffling:");
//        for (int i = 0; i < x.length; i += 2) {
//            System.out.print(x[i] + "\t");
//        }
//        for (int i = 1; i < x.length; i += 2) {
//            System.out.print(x[i] + "\t");
//        }
//        int[] arr = new int[]{10, 2, 4, 5, 11, 21, 34};
//        int evenCount= 0;
//        for (int j : arr) {
//            if (j % 2 == 0) evenCount++;
//
//        }
//        System.out.println("Even " + evenCount + "\nOdd " + (arr.length - evenCount));

//        int figure = 10;// пустой треугольник
//        int countSize = 0;
//        while (countSize <= figure) {
//            int countLine = 0;
//            while (countLine < figure - countSize) {
//                System.out.print(" ");
//                countLine++;
//            }
//            int count = 0;
//            while (count < 2 * countSize - 1) {
//                if (countSize == 1 || countSize == figure || count == 0 || count == 2 * countSize - 2) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//                count++;
//            }
//            System.out.println();
//            countSize++;
//        }
//        int count = 10;// пустой треугольник
//        int a = 0;
//        while (a <= count) {
//            int i = 0;
//            while (i < count - a) {
//                System.out.print(" ");
//                i++;
//            }
//            int j = 0;
//            while (j < 2 * a - 1) {
//                if (a == 1 || a == count || j == 0 || j == 2 * a - 2) {
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//                j++;
//            }
//            System.out.println();
//            a++;
//        }
//    }
//        int count = 10;// пустой треугольник
//        int a = 0;
//        while (a++ < count) {
//            int i = 0;
//            while (i < count) {
//                System.out.print(" ");
//                if (i++ == count - a - 1) {
//                    int j = 0;
//                    while (j++ < 2 * a + 1) {
//                        if (i == 1 || i == count || j == 0 || j == 2 * i - 2) {
//                            System.out.print("*");
//                        }
//                        System.out.println();
//                        break;
//                    }
//                }
//            }
//
//        }Џ
}
