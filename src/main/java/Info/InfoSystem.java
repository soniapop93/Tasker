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

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private Info splitInput(BufferedReader bufferedReader) {
        String hostName = "";
        String osName = "";
        String osVersion = "";
        String osManufacturer = "";
        String osConfiguration = "";
        String osBuildType = "";
        String registeredOwner = "";
        String registredOrganization = "";
        String productID = "";
        String originalInstallDate = "";
        String systemBootTime = "";
        String systemManufacturer = "";
        String systemModel = "";
        String systemType = "";
        String processor = "";
        String biosVersion = "";
        String windowsDirectory = "";
        String bootDevice = "";
        String systemLocal = "";
        String inputLocale = "";
        String timeZone = "";
        String totalPhysicalMemory = "";
        String availablePhysicalMemory = "";
        String virtualMemoryMaxSize = "";
        String virtualMemoryAvailable = "";
        String virtualMemoryInUse = "";
        String pageFileLocation = "";
        String domain = "";
        String logonServer = "";
        ArrayList<String> hotfixes = new ArrayList<>();
        ArrayList<String> networkCards = new ArrayList<>();
        String hyperRequirmenets = "";
        String line;

        while((line=bufferedReader.readLine()) != null)
        {
            if (line.contains("Host Name:")) {
                hostName = line.split("Host Name:")[1].trim();
            }
            else if (line.contains("OS Name:")) {
                osName = line.split("OS Name:")[1].trim();
            }
        }

        return new Info(
                hostName,
                osName,
                osVersion,
                osManufacturer,
                osConfiguration,
                osBuildType,
                registeredOwner,
                registredOrganization,
                productID,
                originalInstallDate,
                systemBootTime,
                systemManufacturer,
                systemModel,
                systemType,
                processor,
                biosVersion,
                windowsDirectory,
                bootDevice,
                systemLocal,
                inputLocale,
                timeZone,
                totalPhysicalMemory,
                availablePhysicalMemory,
                virtualMemoryMaxSize,
                virtualMemoryAvailable,
                virtualMemoryInUse,
                pageFileLocation,
                domain,
                logonServer,
                hotfixes,
                networkCards,
                hyperRequirmenets
        );

    }
}
