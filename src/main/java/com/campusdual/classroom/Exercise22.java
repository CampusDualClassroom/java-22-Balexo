package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    private static final String[] ELEMENTS = {"GKFFD", "TNANA", "MPMSL", "PSWME", "LZMLF", "JYEBV", "YELNT", "JSNKR", "JFESF", "TMJLL"};

    public static List<String> createArrayList() {
      List<String> arrayReturned = new ArrayList<>();

       for(String element : ELEMENTS){
           arrayReturned.add(element);
       }
        return arrayReturned;
    }

    public static void printElementsAndIndex(List<String> customList) {

        for(int i = 0; i<customList.size(); i++){
                System.out.println("Índice" + i + "Valor:" + customList.get(i));

            }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }

    public static void main(String[] args) {
        List<String> arrayStringType = createArrayList();
        printElementsAndIndex(arrayStringType);
        addElementToList(arrayStringType, "AAAAA");
        printElementsAndIndex(arrayStringType);

    }
}
