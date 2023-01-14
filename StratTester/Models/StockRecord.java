package StratTester.Models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class StockRecord {
    static final String HEADER_STRING = "date,open,high,low,close,volume,Name";

    Date date;//0
    double open;//1
    double close;//4
    double low;//3
    double high;//2
    long volume;//5
    String Name;//6

    int month;
    int day;
    int year;

    StockRecord(String stockRecord){
        if(!stockRecord.equalsIgnoreCase(HEADER_STRING)){
            String[] parsedRecord = stockRecord.split(",");
            try {
                date = new SimpleDateFormat("yyyy/MM/dd").parse(parsedRecord[0]);
                month = date.getMonth();
                day = date.getDay();
                year = date.getYear();

                open = Double.parseDouble(parsedRecord[1]);
                close = Double.parseDouble(parsedRecord[4]);
                low = Double.parseDouble(parsedRecord[3]);
                high = Double.parseDouble(parsedRecord[2]);
                volume = Long.parseLong(parsedRecord[5]);
                Name = parsedRecord[6];
            } catch (ParseException e) {
                Arrays.stream(parsedRecord).forEach(System.out::print);
            } 
        }
    }
}
