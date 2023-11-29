package Resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CPU {
    public void cpuUsage() {
        //todo: implement it

        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "wmic cpu get loadpercentage");
        builder.redirectErrorStream(true);
        try {
            Process process = builder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while(true) {
                line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
