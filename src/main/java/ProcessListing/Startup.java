package ProcessListing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Startup {
    public void showStartupApps() {
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "wmic startup get caption,command");
        builder.redirectErrorStream(true);

        try {
            Process process = builder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
