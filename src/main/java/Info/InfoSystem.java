package Info;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InfoSystem {
    public void getSystemInfo() {
        Runtime runtime = Runtime.getRuntime();
        Process process;

        {
            try {
                process = runtime.exec("SYSTEMINFO");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

                String line;

                while((line=bufferedReader.readLine()) != null)
                {
                    System.out.println(line);
                }


            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
