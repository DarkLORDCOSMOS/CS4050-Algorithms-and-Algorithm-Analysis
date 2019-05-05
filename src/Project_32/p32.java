package Project_32;

import java.util.Scanner;
import java.io.*;

public class p32 {

    public static void main(String[] args) throws IOException {
        double cx, cy, vx, vy, dx, dy, wx, wy, rows, columns;
        Scanner input = new Scanner( System.in );

        final String OUTPUT_FILE = "p32.txt";
        FileWriter outputDataFile = new FileWriter(OUTPUT_FILE);
        PrintWriter outputFile = new PrintWriter(outputDataFile);

        rows = 4;
        columns = 19;

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

        outputFile.println("cx = " + cx);
        outputFile.println("cy = " + cy);
        outputFile.println("vx = " + vx);
        outputFile.println("vy = " + vy);
        outputFile.println("dx = " + dx);
        outputFile.println("dy = " + dy);
        outputFile.println("wx = " + wx);
        outputFile.println("wy = " + wy);

        outputFile.close();
        System.exit(0);
    }

}
