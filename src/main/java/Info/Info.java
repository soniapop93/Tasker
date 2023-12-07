package Info;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Info {
    private String hostName;
    private String osName;
    private String osVersion;
    private String osManufacturer;
    private String osConfiguration;
    private String osBuildType;
    private String registeredOwner;
    private String registredOrganization;
    private String productID;
    private String originalInstallDate;
    private String systemBootTime;
    private String systemManufacturer;
    private String systemModel;
    private String systemType;
    private String Processor;
    private String biosVersion;
    private String windowsDirectory;
    private String bootDevice;
    private String systemLocal;
    private String inputLocale;
    private String timeZone;
    private String totalPhysicalMemory;
    private String availablePhysicalMemory;
    private String virtualMemoryMaxSize;
    private String virtualMemoryAvailable;
    private String virtualMemoryInUse;
    private String pageFileLocation;
    private String domain;
    private String logonServer;
    private ArrayList<String> hotfixes;
    private ArrayList<String> networkCards;
    private String hyperRequirmenets;

    public Info(
            String hostName,
            String osName,
            String osVersion,
            String osManufacturer,
            String osConfiguration,
            String osBuildType,
            String registeredOwner,
            String registredOrganization,
            String productID,
            String originalInstallDate,
            String systemBootTime,
            String systemManufacturer,
            String systemModel,
            String systemType,
            String processor,
            String biosVersion,
            String windowsDirectory,
            String bootDevice,
            String systemLocal,
            String inputLocale,
            String timeZone,
            String totalPhysicalMemory,
            String availablePhysicalMemory,
            String virtualMemoryMaxSize,
            String virtualMemoryAvailable,
            String virtualMemoryInUse,
            String pageFileLocation,
            String domain,
            String logonServer,
            ArrayList<String> hotfixes,
            ArrayList<String> networkCards,
            String hyperRequirmenets) {
        this.hostName = hostName;
        this.osName = osName;
        this.osVersion = osVersion;
        this.osManufacturer = osManufacturer;
        this.osConfiguration = osConfiguration;
        this.osBuildType = osBuildType;
        this.registeredOwner = registeredOwner;
        this.registredOrganization = registredOrganization;
        this.productID = productID;
        this.originalInstallDate = originalInstallDate;
        this.systemBootTime = systemBootTime;
        this.systemManufacturer = systemManufacturer;
        this.systemModel = systemModel;
        this.systemType = systemType;
        Processor = processor;
        this.biosVersion = biosVersion;
        this.windowsDirectory = windowsDirectory;
        this.bootDevice = bootDevice;
        this.systemLocal = systemLocal;
        this.inputLocale = inputLocale;
        this.timeZone = timeZone;
        this.totalPhysicalMemory = totalPhysicalMemory;
        this.availablePhysicalMemory = availablePhysicalMemory;
        this.virtualMemoryMaxSize = virtualMemoryMaxSize;
        this.virtualMemoryAvailable = virtualMemoryAvailable;
        this.virtualMemoryInUse = virtualMemoryInUse;
        this.pageFileLocation = pageFileLocation;
        this.domain = domain;
        this.logonServer = logonServer;
        this.hotfixes = hotfixes;
        this.networkCards = networkCards;
        this.hyperRequirmenets = hyperRequirmenets;
    }
}
