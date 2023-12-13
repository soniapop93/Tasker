package Logic;

import Info.InfoSystem;
import ProcessListing.Processes;
import ProcessListing.Startup;
import Resources.CPU;
import Resources.Memory;

import java.util.Scanner;

public class TaskerLogic {
    private String[] options = {
            "List processes sorted by name - Ascending",
            "List processes sorted by name - Descending",
            "Kill Process",
            "Get Current CPU Usage",
            "Get Current Memory Usage",
            "System Info",
            "List Startup Apps",
            "Exit"};
    private Scanner scanner = new Scanner(System.in);
    private Processes processes = new Processes();
    private CPU cpu = new CPU();
    private InfoSystem infoSystem = new InfoSystem();
    private Memory memory = new Memory();
    Startup startup = new Startup();
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
                    processes.sortByNameAscending();
                    break;

                case "2":
                    System.out.println(line);
                    processes.sortByNameDescending();
                    break;

                case "3":
                    System.out.println(line);
                    String pidKill = menuKillProcess();

                    boolean confirmation = confirmOption();

                    if (confirmation) {
                        processes.killProcess(Long.valueOf(pidKill));
                    }
                    break;
                case "4":
                    System.out.println(line);
                    double cpuUsage = cpu.cpuUsage();

                    if (cpuUsage < 0) {
                        System.out.println(">>> Could not get the current CPU usage...");
                    }
                    else {
                        System.out.println(">>> Current CPU Usage: " + cpuUsage);
                    }
                    break;

                case "5":
                    System.out.println(line);
                    long memoryUsage = memory.memoryUsage();

                    System.out.println(">>> Current Memory Usage: " + memoryUsage);
                    break;

                case "6":
                    System.out.println(line);
                    infoSystem.getSystemInfo();
                    break;

                case "7":
                    System.out.println(line);
                    startup.showStartupApps();
                    break;
            }
        }
    }

    public void checkResources() {
        cpu.alertCPUusage();
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

    private String inputUser() {
        System.out.print(">>> ");
        return scanner.nextLine();
    }

    private String menuKillProcess() {
        String output = inputUser("Please add PID of the process you want to kill");

        return output;
    }

    private boolean confirmOption() {
        System.out.println("Please confirm?\n1. Yes\n2. No");
        String input = inputUser();

        if (input.equals("1")) {
            return true;
        }
        return false;
    }
}