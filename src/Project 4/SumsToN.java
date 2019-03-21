import java.util.Scanner;

public class SumsToN {

    private static Scanner scan = new Scanner(System.in);

    public static void main (String args[]) {
        System.out.print("Enter a positive integer, enter 0 to exit: ");
        int input = scan.nextInt();
        if (input != 0) {getList(input);}
        else {System.out.println("Goodbye.");System.exit(0);}
    }

    private static void getList(int n) {
        getList(n, n, "");
    }
    private static void getList(int n, int max, String part) {
        if (n == 0) {
            System.out.println(part);
            return;
        }
        for (int i = 1; i <= Math.min(max, n); i++) {
            getList(n-i, i, i + " " + part);
        }
    }
}

//import java.lang.reflect.Array;
//import java.util.*;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Random;
// public static Random random = new Random();
//            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//            list = getList(input, list);
//            printList(list);
//        }
//    public static Integer getInput() {
//        System.out.print("Enter a positive Integer > 0: ");
//        Scanner scan = new Scanner(System.in);
//        return scan.nextInt();
//    }
//
//    public static ArrayList<ArrayList<Integer>> getList(int num, ArrayList<ArrayList<Integer>> list) {
//        ArrayList<Integer> sublist = new ArrayList<>();
//        sublist = getSubList(num, 0, sublist);
//
//        // empty list
//        if (list.isEmpty()) {
//            list.add(sublist);
//            return getList(num, list);
//        }
//
//        // check if new sublist
//        boolean repeat = false;
//        for (ArrayList<Integer> i : list) {
//            System.out.println("i = " + i + " sublist = " + sublist);
//            if (i.equals(sublist)) {
//                System.out.println("*****repeat list found!");
//                repeat = true;
//                sublist = new ArrayList<>();
//                getSubList(num, 0, sublist);
//                // return getList(num, list);
//            }
//        }
//        if (!repeat) {
//            System.out.println("*****new list found!");
//            System.out.println("*****sublist = " + sublist);
//            for (ArrayList<Integer> i : list) {
//                System.out.println("i = " + i + " sublist = " + sublist);
//                System.out.println("i.size() = " + i.size() + " sublist.size() = " + sublist.size());
//                if (sublist.size() >= i.size()) {
//                    list.add(list.indexOf(i), sublist);
//                    System.out.println("*****adding sublist " + sublist);
//                    System.out.println("*****list = " + list);
//                    return getList(num, list);
//                    // break;
//                }
//                else if (sublist.size() < i.size() && (list.indexOf(i) == list.size() - 1)) {
//                    list.add(sublist);// break;
//                    return getList(num, list);
//                }
//                else {
//                    continue;
//                }
//            }
//
//            list.add(sublist);
//            return getList(num, list);
            // return getList(num, list);
//         }
//      System.out.println("*****list = " + list);
//        ArrayList<Integer> sublist = new ArrayList<>();
//        sublist = getSubList(num, 0, sublist);
//        list.add(sublist);
//
//        if (list.size() < Math.pow(2, num - 2) - 1) {
//            System.out.println("2^(n - 1) = " + (Math.pow(2, num - 2) - 1));
//            ArrayList<Integer> sublist = new ArrayList<>();
//            // sublist = new ArrayList<>();
//            // sublist = getSubList(num, 0, sublist);
//            int total = 0;
//            for (Integer i : sublist) {
//                total += i;
//            }
//            if (total != num) {
//                sublist = new ArrayList<>();
//                getSubList(num, 0, sublist);
//                // return getList(num, list);
//            }
//            boolean repeat = false;
//            for (ArrayList<Integer> i : list) {
//                System.out.println("i = " + i + " sublist = " + sublist);
//                if (i.equals(sublist)) {
//                    System.out.println("repeat list found!");
//                    repeat = true;
//                    getSubList(num, 0, sublist);
//                    // return getList(num, list);
//                }
//            }
//            if (!repeat) {
//                if (list.isEmpty()) {
//                    list.add(sublist);
//                    return getList(num, list);
//                }
//                else {
//                    for (ArrayList<Integer> i : list) {
//                        System.out.println("i = " + i + " sublist = " + sublist);
//                        System.out.println("i.size() = " + i.size() + " sublist.size() = " + sublist.size());
//                        if (sublist.size() >= i.size()) {
//                            list.add(list.indexOf(i), sublist);
//                            return getList(num, list);
//                            // break;
//                        }
//                        else if (sublist.size() < i.size() && (list.indexOf(i) == list.size() - 1)) {
//                            list.add(sublist);// break;
//                            return getList(num, list);
//                        }
//                        else {
//                            continue;
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println("list.size() = " + list.size());
        // getList(num, list);
//        return list;
//    }
//
//    public static ArrayList<Integer> getSubList(int num, int sum, ArrayList<Integer> sublist) {
//        System.out.println("num = " + num);
//        System.out.println("sum = " + sum);
//        System.out.println("sublist = " + sublist);
//
//        int part = random.nextInt(num - sum) + 1;
//        System.out.println("part = " + part);
//        sum += part;
//        if (sublist.isEmpty()) {sublist.add(part);}
//        else {
//            for (int i = 0; i < sublist.size(); i++) {
//                System.out.println("i = " + sublist.get(i));
//                if (part <= sublist.get(i)) {
//                    System.out.println("part = " + part + " <= " + "i = " + sublist.get(i));
//                    sublist.add(i, part);break;
//                }
//                else if ((part > sublist.get(i)) && (i == sublist.size() - 1)) {
//                    System.out.println("part = " + part + " > " + "i = " + sublist.get(i));
//                    sublist.add(i + 1, part);break;
//                }
//                else {
//                    System.out.println("part = " + part + " > " + "i = " + sublist.get(i));
//                    continue;
//                }
//            }
//            // sublist.add(part);
//        }
//        System.out.println("num = " + num);
//        System.out.println("sum = " + sum);
//        System.out.println("sublist = " + sublist);
//
//        System.out.println("num = " + num + " sum = " + sum);
//
//        if (num - sum != 0) {return getSubList(num, sum, sublist);}
//        else {return sublist;}
//    }
//
//    public static void printList(ArrayList<ArrayList<Integer>> list) {
//        for (ArrayList<Integer> i : list) {
//            int check = 0;
//            for (Integer j : i) {
//                check += j;
//            }
//            System.out.println(i + " = " + check);
//        }
//    }


