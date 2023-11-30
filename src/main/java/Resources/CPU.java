package Resources;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CPU {
    public double cpuUsage() {
        double cpuUsage = -1.0;

        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "wmic cpu get loadpercentage");
        builder.redirectErrorStream(true);
        try {
            Process process = builder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            ArrayList<String> output = new ArrayList<>();

            while(true) {
                line = reader.readLine();
                if (line == null) {
                    break;
                }
                output.add(line);
            }

            cpuUsage = Double.valueOf(output.get(2).trim());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cpuUsage;
    }
}
