package Resources;

import java.lang.management.ManagementFactory;

public class Memory {
    public void memoryUsage() {
        double totalMemorySize = ManagementFactory.getPlatformMXBean(
                com.sun.management.OperatingSystemMXBean.class).getTotalMemorySize();
        double freeMemorySize = ManagementFactory.getPlatformMXBean(
                com.sun.management.OperatingSystemMXBean.class).getFreeMemorySize();
        double usedMemorySize = totalMemorySize - freeMemorySize;
        System.out.println(usedMemorySize);
    }
}
