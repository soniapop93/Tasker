package ProcessListing;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class Processes {
    ArrayList<ProcessObj> processesList = new ArrayList<>();
    private ArrayList<ProcessObj> taskList() {
        try {
            ProcessHandle.allProcesses().forEach(
                    process -> {
                        if (processDetails(process) != null)
                        {
                            processesList.add(processDetails(process));
                        }
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }

        return processesList;
    }

    private ProcessObj processDetails(ProcessHandle p) {
        String pathStr;

        if (p.info().command().isPresent()) {
            pathStr = p.info().command().get().toString();
        }
        else {
            return null;
        }

        Path path = Paths.get(pathStr);

        ProcessObj process = new ProcessObj(
                p.pid(),
                path.getFileName().toString(),
                path.toString(),
                p.info().startInstant().get().toString(),
                p.info().totalCpuDuration().get().toString());

        return process;
    }

    public void killProcess(long pid) {
        try {
            ProcessHandle.of(pid).ifPresent(ProcessHandle::destroy);

            System.out.println("Killed process with PID: " + pid);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void sortByName() {
        processesList = taskList();

        ArrayList<String> namesList = new ArrayList<>();

        for (ProcessObj process : processesList) {
            namesList.add(process.getName());
        }
        Collections.sort(namesList);

        ArrayList<ProcessObj> sortedProcessesList = new ArrayList<>();

        for (String name : namesList) {
            for (ProcessObj process : processesList) {
                if (name.equals(process.getName())) {
                    if (!sortedProcessesList.contains(process)) {
                        sortedProcessesList.add(process);
                    }
                    break;
                }
            }
        }
        displayTaskListProcesses(sortedProcessesList);
    }

    public void displayTaskListProcesses(ArrayList<ProcessObj> processesList) {
        for (ProcessObj p : processesList) {
            System.out.println(String.format("PID: %s -> Name: %s -> Path: %s -> CPU Usage: %s -> Time Since Running: %s",
                    p.getId(),
                    p.getName(),
                    p.getPathExe(),
                    p.getCpuUsage(),
                    p.getTimeSinceRunning()));
        }
    }
}
