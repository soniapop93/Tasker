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

        try {
            while((line=bufferedReader.readLine()) != null)
            {
                if (line.contains("Host Name:")) {
                    hostName = line.split("Host Name:")[1].trim();
                }
                else if (line.contains("OS Name:")) {
                    osName = line.split("OS Name:")[1].trim();
                }
                else if (line.contains("OS Version:")) {
                    osVersion = line.split("OS Version:")[1].trim();
                }
                else if (line.contains("OS Manufacturer:")) {
                    osManufacturer = line.split("OS Manufacturer:")[1].trim();
                }
                else if (line.contains("OS Configuration:")) {
                    osConfiguration = line.split("OS Configuration:")[1].trim();
                }
                else if (line.contains("OS Build Type:")) {
                    osBuildType = line.split("OOS Build Type:")[1].trim();
                }
                else if (line.contains("Registered Owner:")) {
                    registeredOwner = line.split("Registered Owner:")[1].trim();
                }
                else if (line.contains("Registered Organization:")) {
                    registredOrganization = line.split("Registered Organization:")[1].trim();
                }
                else if (line.contains("Product ID:")) {
                    productID = line.split("Product ID:")[1].trim();
                }
                else if (line.contains("Original Install Date:")) {
                    originalInstallDate = line.split("Original Install Date:")[1].trim();
                }
                else if (line.contains("System Boot Time:")) {
                    systemBootTime = line.split("System Boot Time:")[1].trim();
                }
                else if (line.contains("System Manufacturer:")) {
                    systemManufacturer = line.split("System Manufacturer:")[1].trim();
                }
                else if (line.contains("System Model:")) {
                    systemModel = line.split("System Model:")[1].trim();
                }
                else if (line.contains("System Type:")) {
                    systemType = line.split("System Type:")[1].trim();
                }
                else if (line.contains("Processor:")) {
                    processor = line.split("Processor:")[1].trim();
                }
                else if (line.contains("Bios Version:")) {
                    biosVersion = line.split("Bios Version:")[1].trim();
                }
                else if (line.contains("Windows Directory:")) {
                    windowsDirectory = line.split("Windows Directory:")[1].trim();
                }
                else if (line.contains("Boot Device:")) {
                    bootDevice = line.split("Boot Device:")[1].trim();
                }
                else if (line.contains("System Local:")) {
                    systemLocal = line.split("System Local:")[1].trim();
                }
                else if (line.contains("Input Locale:")) {
                    inputLocale = line.split("Input Locale:")[1].trim();
                }
                else if (line.contains("Timezone:")) {
                    timeZone = line.split("Timezon:")[1].trim();
                }
                else if (line.contains("Total Physical Memory:")) {
                    totalPhysicalMemory = line.split("Total Physical Memory:")[1].trim();
                }
                else if (line.contains("Available Physical Memory:")) {
                    availablePhysicalMemory = line.split("Available Physical Memory:")[1].trim();
                }
                else if (line.contains("Virtual Memory Max Size:")) {
                    virtualMemoryMaxSize = line.split("Virtual Memory Max Size:")[1].trim();
                }
                else if (line.contains("Virtual Memory Available:")) {
                    virtualMemoryAvailable = line.split("Virtual Memory Available:")[1].trim();
                }
                else if (line.contains("Virtual Memory In Use:")) {
                    virtualMemoryInUse = line.split("Virtual Memory In Use:")[1].trim();
                }
                else if (line.contains("Page File Location:")) {
                    pageFileLocation = line.split("Page File Location:")[1].trim();
                }

            }
        } catch (Exception e){
            e.printStackTrace();
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
