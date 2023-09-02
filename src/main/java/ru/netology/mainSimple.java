package ru.netology;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class mainSimple {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String fileName = "data.csv";


        // Запись с расширением
// Создаем запись
        String[] columnMapping = "3,David,Feezor,Canada,40".split(",");
// Создаем экземпляр CSVWriter
        try (CSVWriter writer = new CSVWriter(new FileWriter(fileName, true))) {
// Записываем запись в файл
            writer.writeNext(columnMapping);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
