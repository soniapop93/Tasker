package Info;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InfoSystem {
    public void getSystemInfo() {
        Runtime runtime = Runtime.getRuntime();
        Process process;

        {
            try {
                process = runtime.exec("SYSTEMINFO");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                getLine(bufferedReader);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void getLine(BufferedReader bufferedReader) {
        String line;

        try {
            while((line=bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
