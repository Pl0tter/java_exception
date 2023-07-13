package org.example.seminar03;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadEx00 {
    public static void main(String[] args) {
    }
}

class DataProcessor {
    private FileReader fileReader;

    public DataProcessor(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public void processFile(String filePath) throws IOException {
        try {
            fileReader.readFile(filePath);
            // Обработка данных из файла
            // ...
        } catch (IOException e) {
            // Проброс исключения выше
            throw e;
        }
    }
}

class FileReader {
    public void readFile(String filePath) throws FileNotFoundException, IOException {
//        try {
//            // Открытие файла и чтение данных
//            //
//        } catch (FileNotFoundException e){
//            // Обработка исключения FileNotFoundException
//            // ...
//        } catch (IOException e){
//            // Обработка исключения IOException
//            // ...
//        }
    }
}
