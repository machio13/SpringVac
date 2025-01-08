package spring;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    public static List<String[]> CsvReader(File file) {
        List<String[]> lines = new ArrayList<>();

        String line = "";
        String lineSplit = ",";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){

            bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line.split(lineSplit));
            }

        }catch (IOException e) {
            System.out.println("正常に読み込めませんでした。");
        }
        return lines;
    }
}
