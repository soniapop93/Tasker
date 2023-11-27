package Logic;

import ProcessListing.Processes;

import java.util.Scanner;

public class TaskerLogic {
    private String[] options = {"List processes", "Kill Process", "Exit"};
    private Scanner scanner = new Scanner(System.in);
    private Processes processes = new Processes();
    private final String line = "------------";

    public void tasker() {
        while(true) {

            System.out.println(line);
            System.out.println(menuOptions());
            System.out.println(line);

            String option = inputUser("Please add option selected");


            switch (option) {
                case "1":
                    System.out.println(line);
                    processes.taskList();
                    break;
                case "2":
                    System.out.println(line);
                    String pidKill = menuKillProcess();

                    processes.killProcess(Long.valueOf(pidKill));
                    break;
            }


            //processes.taskList();
        }

        //processes.killProcess();
    }


    private String menuOptions() {
        String result = "";

        for (int i = 0; i < options.length; i++) {
            result += String.format("%s. %s \n", i + 1, options[i]);
        }

        return result.substring(0, result.length() - 1);
    }

    private String inputUser(String inputText) {
        System.out.print(String.format(">>> %s: ", inputText));
        return scanner.nextLine();
    }

    private String menuKillProcess() {
        String output = inputUser("Please add PID of the process you want to kill");

        return output;
    }

    private void confirmOptionSelected() {
        //todo: implement it
    }
}