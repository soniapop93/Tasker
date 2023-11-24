package ProcessListing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Processes {

    public void taskList() {
        ArrayList<String> processesList = new ArrayList<String>();

        try {
            ProcessHandle.allProcesses().forEach(
                    process -> {
                        if (processDetails(process) != null)
                        {
                            processesList.add(processDetails(process));
                        }
                    });

            for (String p : processesList) {
                System.out.println(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String processDetails(ProcessHandle p) {
        String result;
        result = String.format("%d %s %s", p.pid(), p.info().command().toString().replace("Optional", ""), p.info().startInstant().toString().replace("Optional", ""));

        if (result.contains(".empty")) {
            return null;
        }

        return result;
    }
}
