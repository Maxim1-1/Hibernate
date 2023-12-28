package com.Maxim.view;

import java.util.Scanner;

public class BaseView {

    public Integer getIdFromConsole(String message) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(message);
            return scanner.nextInt();
        } catch (Exception exception) {
            System.out.print("Проверьте тип вводимых данных, id должно быть целым числом");
            exception.printStackTrace();
        }
        return null;
    }

    public void successCreate(Integer id){
        System.out.print("Запись успешно добавлена, id = "+id);
    }


}
