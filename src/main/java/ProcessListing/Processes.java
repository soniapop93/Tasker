package ProcessListing;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Processes {

    public void taskList() {
        ArrayList<ProcessObj> processesList = new ArrayList<>();

        try {
            ProcessHandle.allProcesses().forEach(
                    process -> {
                        if (processDetails(process) != null)
                        {
                            processesList.add(processDetails(process));
                        }
                    });

            for (ProcessObj p : processesList) {
                System.out.println(String.format("PID: %s -> Name: %s -> Path: %s -> CPU Usage: %s -> Time Since Running: %s",
                        p.getId(),
                        p.getName(),
                        p.getPathExe(),
                        p.getCpuUsage(),
                        p.getTimeSinceRunning()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
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
}
