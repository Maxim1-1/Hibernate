package com.Maxim;

import com.Maxim.dbutils.Connector;
import com.Maxim.liquibase.LiquibaseRunner;
import com.Maxim.view.DispatcherView;

import java.sql.SQLException;
import java.util.Scanner;


public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nДля выхода еще раз введите exit, для продолжения введите любой символ");

            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            } else {
                DispatcherView.getCommandConsole();
            }
        }
    }



}
