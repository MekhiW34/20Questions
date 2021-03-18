package day2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class ClassworkQuestions {

            //1st Method
    //    public static int getLastIndex(String[] names) {
    //        return names.length - 1;
    //    }

            //2nd Method
    //    public static int getSecondToLastIndex(String[] names) {
    //        return names.length - 2;
    //    }

            //3rd Method
    //    public static String getFirstElement(String[] names) {
    //        String firstElement = names[0];
    //        return firstElement;
    //    }

            //4th Method
    //    public static String getLastElement(String[] names) {
    //        String lastElement = names[names.length -1];
    //        return lastElement;
    //    }

            //5th Method
    //    public static String getSecondToLastElement(String[] names) {
    //        String secondToLastElement = names[names.length - 2];
    //        return secondToLastElement;
    //    }

            //6th Method
    //        public static int getSum(int[] ints) {
    //        int sum = 0;
    //        for (int i: ints) {
    //        sum += i;
    //           }
    //           return sum;
    //}
            //7th Method
    //        public static double getAverage(int[] ints){
    //                double sum = 0;
    //                for (int x : ints) {
    //                    sum = sum + x;
    //                }
    //                return sum / ints.length;
    //            }

            //Method 8
    //        public static String extractAllOddNumbers(int[] numbers) {
    //            List<Integer> oddNums = new ArrayList<>();
    //            for (int i = 0; i < numbers.length; i++) {
    //                if (numbers[i] % 2 != 0) {
    //                    oddNums.add(numbers[i]);
    //                }
    //            }
    //            return oddNums.toString();
    //        }

            //Method 9
    //            public static String extractAllEvanNumbers(int[] numbers) {
    //                List<Integer> EvanNums = new ArrayList<>();
    //                for (int i = 0; i < numbers.length; i++) {
    //                    if (numbers[i] % 2 == 0) {
    //                        EvanNums.add(numbers[i]);
    //                    }
    //                }
    //                return EvanNums.toString();
    //        }


            //Method 10
    //    public static boolean contains(String[] names, String element) {
    //
    //        for (String name : names) {
    //            if (name.equals(element)) {
    //                return true;
    //            }
    //        }
    //        return false;

            //Method 11
    //        public static int getIndexByElement(String[] names, String element) {
    //            for (int i = 0; i < names.length; i++){
    //                if (element.equals(names[i]));
    //                return i;
    //            }
    //            return 1;

    //        }

            //Method 12
    //        public static void printOddNumbersInRange(int start, int end){
    //            for (int i = start; i < end; i++) {
    //                if (i % 2 != 0) {
    //                    System.out.println(i);  }
    //            }
    //        }
    //

            //Method 13
    //        public static String printGivenStringTimesNumberGiven(String str, int n) {
    //            System.out.println(str.repeat(n));
    //
    //            return str;
    //        }


            //Method 14
    //         public static String repeatFirstThreeLetters(String str, int n) {
    //             String firstThree;
    //            firstThree = str.substring(0, 3);
    //             System.out.println(firstThree.repeat(n));
    //
    //             return firstThree;
    //         }

            //Method 15
    // Write a java method to count all the words in a string
    //String tokenizer
    //         public static int WordsInAStringCounter(String str){
    //             StringTokenizer tokens = new StringTokenizer(str);
    //
    //
    //             return tokens.countTokens();
    //         }

            cd wee//Method 16
    //    A, E, I, O, U
//        public static int VowelsCounter(String str) {
//            int count = 0;
//            for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'|| str.charAt(i) == 'A' || str.charAt(i) == 'E'|| str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
//                    count++;
//                }
//            }
//
//
//        return count;
//        }

            //Method 17
//        Swap the first element in an array with the last element in an array and return
//    public static String[] swap(String[] stringArray) {
//        String food = stringArray[0];
//        stringArray[0] = stringArray[stringArray.length - 1];
//        stringArray[stringArray.length - 1] = food;
//
//        return stringArray;
//    }

            //Method 18
//    /**
//     * Given the following legend
//     *
//     * f   >>   7
//     * s   >>   $
//     * 1   >>   !
//     * a   >>   @
//     *
//     * your method should replace any character represented by a key in the legend, with its corresponding value.
//     * Input  = "The Farmer went to the store to get 1 dollar's worth of fertilizer"
//     * Output = "The 7@rmer went to the $tore to get ! doll@r'$ worth of 7ertilizer"
//     *
//     * output = The 7@rmer went to the $tore to get ! doll@r'$ worth o7 7ertilizer
//     */
//        public static String replaceCharacters(String str) {
//        String replaceString = str.replace('f', '7').replace('s', '$').replace('1', '!').replace('a', '@');
//
//
//        return replaceString;
//    }

            //Method 19
        //" The small brown dog hopped the fence " becomes " The Wu Tang Wu Hopped Wu Fence "
//    public static String replaceWuTangTwoThreeDivisible(String stringInput) {
//           String[] arrayOfStrings = stringInput.split(" ");
//           for (int i = 1; i < arrayOfStrings.length; i++) {
//               if ( i % 2 == 0) {
//                   arrayOfStrings[i -1] = "wu"; }
//                   else if ( i % 3 == 0) {
//                       arrayOfStrings[i -1] = "tang";
//               }
//           }
//
//        return String.join((" "),arrayOfStrings);
//    }


             //Method 20

//            public static String createStringOfFibonnaciUpToMax(int maxNumber) {
//
//                int n = maxNumber, i = 0, x = 1;
//                String fibonacci = "";
//
//                while (i <= maxNumber) {
//
//                    int sum = i + x;
//                    i = x;
//                    x = sum;
//
//                    fibonacci = fibonacci + i + " ";
//
//                }
//             return fibonacci;
//    }





    //----------------------------------------------------------------------------------------------------


    public static void main(String[] args) {


                // Question1
        //        String[] names = {"mekhi", "Ryan", "mike"};
        //        System.out.println(getLastIndex(names));

                //Question 2
        //        String[] names = {"mekhi", "Ryan", "mike", "Hunter"};
        //        System.out.println(getSecondToLastIndex(names));

                //Question 3
        //        String[] names = {"jared","mekhi", "Ryan", "mike", "Hunter"};
        //        System.out.println(getFirstElement(names));

                //Question 4
        //        String[] names = {"jared","mekhi", "Ryan", "mike", "Hunter","hanna"};
        //        System.out.println(getLastElement(names));

                //Question 5
        //       String[] names = {"mekhi","jared","myles","hunter"};
        //       System.out.println(getSecondToLastElement(names));


                //Question 6
        //       equals 36
        //       int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //       System.out.println(getSum(numbers));

                //Question 7
        //       System.out.println(getAverage(numbers));

                //Question 8
        //       System.out.println(extractAllOddNumbers(numbers));


                //Question 9
        //        System.out.println(extractAllEvanNumbers(numbers));


                //Question 10
        //        If name is in array it prints out true, if the name isnt in the array it prints out false
        //        String[] names = {"mekhi", "Ryan", "mike"};
        //        System.out.println(contains(names, "dawar"));


                //Question 11
        //System.out.println(getIndexByElement(names,"Ryan"));


                //Question 12
        //SOUT in Method
        //printOddNumbersInRange(1, 100);

                //Question 13
        //System.out.println(printGivenStringTimesNumberGiven("lol",4));

                 //Question 14
        //System.out.println(repeatFirstThreeLetters("hello", 3));

                //Question 15
        //System.out.println(WordsInAStringCounter("Oh hello good morning!"));

                //Question 16
        //System.out.println(VowelsCounter("I love the gym"));

                //Questions 17
        //System.out.println(Arrays.toString(swap(names)));

                //Question 18
        //System.out.println(replaceCharacters("The farmer went to the store to get 1 dollar's worth of fertilizer"));

                //Question 19
        //System.out.println(replaceWuTangTwoThreeDivisible("The small brown dog hopped the fence "));

                //Question 20
        //System.out.println(createStringOfFibonnaciUpToMax(500));





        }
    }
