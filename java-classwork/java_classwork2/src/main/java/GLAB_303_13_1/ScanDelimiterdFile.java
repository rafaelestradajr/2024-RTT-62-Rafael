package GLAB_303_13_1;

import java.io.File;
import java.io.FileNotFoundException; import java.util.Scanner;
import java.util.ArrayList;
public class ScanDelimiterdFile {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            String location = "C:\\Users\\Owner\\Downloads\\cars.csv\\";
            File file = new File(location);
            Scanner input = new Scanner(file);
            ArrayList<String[]> data = new ArrayList<String[]>();
            while (input.hasNextLine()) {
                String Line = input.nextLine();
                String[] splitedLine = Line.split(",");
                data.add(splitedLine);
            }
            for (String[] line : data) {
                System.out.println(STR."\{line[0]}|\{line[1]}|\{line[2]}|\{line[3]}\{line[4]}|\{line[5]}|\{line[6]}|\{line[7]}|\{line[8]}");
                System.out.println(STR."Car Name :\{line[0]}");
                System.out.println(STR."MPG :\{line[1]}");
                System.out.println(STR."Cylinder :\{line[2]}");
                System.out.println(STR."Displacement :\{line[3]}");
                System.out.println(STR."Horsepower :\{line[4]}");
                System.out.println(STR."Weight :\{line[5]}");
                System.out.println(STR."Acceleration :\{line[6]}");
                System.out.println(STR."Model :\{line[7]}");
                System.out.println(STR."Origin :\{line[8]}");
                System.out.println("===============================");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found! ");
            e.printStackTrace();
        }
    }
}