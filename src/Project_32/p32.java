package Project_32;

import java.util.Scanner;
import java.io.*;

public class p32 {

    public static void main(String[] args) throws IOException {
        double cx, cy, vx, vy, dx, dy, wx, wy;
        int a1x, a1y, a2x, a2y, a3x, a3y, b1x, b1y, b2x, b2y, b3x, b3y, b4x, b4y;
        String[] headers = {"la", "mu1", "mu2", "mu3", "v1", "v2", "v3", "v4", "rhs"};
        int rows, columns;
        // String[] headers;
        Scanner input = new Scanner( System.in );

        final String OUTPUT_FILE = "p32.txt";
        FileWriter outputDataFile = new FileWriter(OUTPUT_FILE);
        PrintWriter outputFile = new PrintWriter(outputDataFile);

        a1x = 1; a1y = -1;
        a2x = 2; a2y = 1;
        a3x = -1; a3y = 3;
        b1x = -1; b1y = -1;
        b2x = 2; b2y = 0;
        b3x = -1; b3y = 1;
        b4x = -3; b4y = 0;

        rows = 5;
        columns = headers.length;

        System.out.print("Enter x for first object center point, c: ");
        cx = input.nextDouble();
        System.out.print("Enter y for first object center point, c: ");
        cy = input.nextDouble();
        System.out.print("Enter x for velocity vector, v: ");
        vx = input.nextDouble();
        System.out.print("Enter y for velocity vector, v: ");
        vy = input.nextDouble();
        System.out.print("Enter x for second object center point, d: ");
        dx = input.nextDouble();
        System.out.print("Enter y for second object center point, d: ");
        dy = input.nextDouble();
        System.out.print("Enter x for velocity vector, w: ");
        wx = input.nextDouble();
        System.out.print("Enter y for velocity vector, w: ");
        wy = input.nextDouble();


        outputFile.println(rows + " " + columns);

        for (int i = 1; i < rows; i ++) {
            if (i == 1) {
                outputFile.println("la");
            }
            outputFile.println("-");
        }

        for (String header: headers) {
            outputFile.println(header);
        }

        //        int j = 0; j < columns; j++) {
//            if (j == columns - 1) {
//                outputFile.println(dx + dy - cx - cy);
//            }
////            outputFile.println("-");
//        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0) {
                    if (j == 0) {
                        outputFile.print(1 + " ");
                    }
                    else {
                        outputFile.print("0 ");
                    }
                }
                if (i == 1) {
                    if (j == 0) {
                        outputFile.print(((int) (vx - wx)) + " ");
                    }
                    else if (j == 1) {
                        outputFile.print(a1x + " ");
                    }
                    else if (j == 2) {
                        outputFile.print(a2x + " ");
                    }
                    else if (j == 3) {
                        outputFile.print(a3x + " ");
                    }
                    else if (j == 4) {
                        outputFile.print(b1x + " ");
                    }
                    else if (j == 5) {
                        outputFile.print(b2x + " ");
                    }
                    else if (j == 6) {
                        outputFile.print(b3x + " ");
                    }
                    else if (j == 7) {
                        outputFile.print(b4x + " ");
                    }
                    else if (j == columns - 1) {
                        outputFile.print(((int) (dx - cx)) + " ");
                    }
                    else {
                        outputFile.print("0 ");
                    }
                }
                else if (i == 2) {
                    if (j == 0) {
                        outputFile.print(((int) (vy - wy)) + " ");
                    }
                    else if (j == 1) {
                        outputFile.print(a1y + " ");
                    }
                    else if (j == 2) {
                        outputFile.print(a2y + " ");
                    }
                    else if (j == 3) {
                        outputFile.print(a3y + " ");
                    }
                    else if (j == 4) {
                        outputFile.print(b1y + " ");
                    }
                    else if (j == 5) {
                        outputFile.print(b2y + " ");
                    }
                    else if (j == 6) {
                        outputFile.print(b3y + " ");
                    }
                    else if (j == 7) {
                        outputFile.print(b4y + " ");
                    }
                    else if (j == columns - 1) {
                        outputFile.print(((int) (dy - cy)) + " ");
                    }
                    else {
                        outputFile.print("0 ");
                    }
                }
                else if (i == 3) {
                    if (j == 1) {
                        outputFile.print(1 + " ");
                    }
                    else if (j == 2) {
                        outputFile.print(1 + " ");
                    }
                    else if (j == 3) {
                        outputFile.print(1 + " ");
                    }
                    else if (j == columns - 1) {
                        outputFile.print(1 + " ");
                    }
                    else {
                        outputFile.print("0 ");
                    }
                }
                else if (i == 4) {
                    if (j == 4) {
                        outputFile.print(1 + " ");
                    }
                    else if (j == 5) {
                        outputFile.print(1 + " ");
                    }
                    else if (j == 6) {
                        outputFile.print(1 + " ");
                    }
                    else if (j == 7) {
                        outputFile.print(1 + " ");
                    }
                    else if (j == columns - 1) {
                        outputFile.print(1 + " ");
                    }
                    else {
                        outputFile.print("0 ");
                    }
                }
//                else {
//                    outputFile.print("0 ");
//                }
            }
            if (i == 2) {

            }
            outputFile.println();
        }

//        outputFile.println("cx = " + cx);
//        outputFile.println("cy = " + cy);
//        outputFile.println("vx = " + vx);
//        outputFile.println("vy = " + vy);
//        outputFile.println("dx = " + dx);
//        outputFile.println("dy = " + dy);
//        outputFile.println("wx = " + wx);
//        outputFile.println("wy = " + wy);

        outputFile.close();
        System.exit(0);
    }

}
