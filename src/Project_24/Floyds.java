package Project_24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Floyds {

    private static int numVertices;

    public static void main(String[] args) throws FileNotFoundException {
        int[][] d0 = input(args[0]);
        int[][] v0 = new int [numVertices][numVertices];

        for (int i = 0; i < numVertices; i++){
            for (int j = 0; j < numVertices; j++){
                v0[i][j] = 0;
            }
        }

        floyds(d0, v0, 0);
    }

    private static int[][] input(String inputFile) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(inputFile));
        numVertices = scan.nextInt();
        int[][] d0 = new int [numVertices][numVertices];
        for (int i = 0; i < numVertices; i++){
            for (int j = 0; j < numVertices; j++){
                d0[i][j] = scan.nextInt();
            }
        }
        return d0;
    }

    private static void floyds(int[][] chart, int[][] vertices, int count) {
        if (count == 0) { print(count++, chart, vertices); }
        chart = getShortestPath(chart, vertices, count);
        print(count, chart, vertices);
        if (count == numVertices) {
            return;
        }
        else {
            floyds(chart, vertices,count + 1);
        }
    }

    private static int[][] getShortestPath(int[][] chart, int[][] vertices, int count) {
        for (int k = 0; k < count; k++) {
            for (int i = 0; i < numVertices; i++) {
                for(int j = 0; j < numVertices; j++) {
                    if (chart[i][j] == -1) {
                        if ((chart[i][k] != -1) && (chart[k][j] != -1)) {
                            chart[i][j] = chart[i][k] + chart[k][j];
                            vertices[i][j] = k + 1;
                        }
                    }
                    else if (chart[i][k] == -1 || chart[k][j] == -1) {
                        continue;
                    }
                    else if (chart[i][k] + chart[k][j] < chart[i][j]) {
                        chart[i][j] = chart[i][k] + chart[k][j];
                        vertices[i][j] = k + 1;
                    }
                }
            }
        }
        return chart;
    }

    private static void print(int count, int[][] chart, int[][] vertices) {
        System.out.println(count);
        for (int i = 0; i < numVertices; i++) {
            for(int j = 0; j < numVertices; j++) {
                System.out.print(chart[i][j] + "." + vertices[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
