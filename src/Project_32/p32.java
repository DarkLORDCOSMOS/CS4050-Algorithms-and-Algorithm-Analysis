package Project_32;

import java.util.Scanner;
import java.io.*;

public class p32 {

    public static void main(String[] args) throws IOException {
        double cx, cy, vx, vy, dx, dy, wx, wy;
        Scanner keys = new Scanner( System.in );
        final String OUTPUT_FILE = "p32.txt";

        System.out.print("Enter x for first object center point, c: ");
        cx = keys.nextDouble();
        System.out.print("Enter y for first object center point, c: ");
        cy = keys.nextDouble();
        System.out.print("Enter x for velocity vector, v: ");
        vx = keys.nextDouble();
        System.out.print("Enter y for velocity vector, v: ");
        vy = keys.nextDouble();
        System.out.print("Enter x for second object center point, d: ");
        dx = keys.nextDouble();
        System.out.print("Enter y for second object center point, d: ");
        dy = keys.nextDouble();
        System.out.print("Enter x for velocity vector, w: ");
        wx = keys.nextDouble();
        System.out.print("Enter y for velocity vector, w: ");
        wy = keys.nextDouble();

        FileWriter outputDataFile = new FileWriter(OUTPUT_FILE);
        PrintWriter outputFile = new PrintWriter(outputDataFile);

        outputFile.println("cx = " + cx);
        outputFile.println("cy = " + cy);
        outputFile.println("vx = " + vx);
        outputFile.println("vy = " + vy);
        outputFile.println("dx = " + dx);
        outputFile.println("dy = " + dy);
        outputFile.println("wx = " + wx);
        outputFile.println("wy = " + wy);

        outputFile.close();
    }

}
