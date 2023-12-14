package Resources;

import java.lang.management.ManagementFactory;
public class Memory {
    public long memoryUsage() {
        long totalMemorySize = getTotalMemorySize();
        long freeMemorySize = getFreeMemorySize();
        long usedMemorySize = totalMemorySize - freeMemorySize;

        return usedMemorySize / (1024 * 1024);
    }

    public void alertMemoryusage() {
        long totalMemorySize = getTotalMemorySize();
        long freeMemorySize = getFreeMemorySize();

        long usedMemorySize = totalMemorySize - freeMemorySize;

        if ((freeMemorySize  / (1024 * 1024)) < 1000) {
            System.out.println("!!!!! >>> MEMORY USAGE VALUE: " + (usedMemorySize / (1024 * 1024)) + " <<< !!!!!");
        }
    }

    private long getTotalMemorySize() {
        long totalMemorySize = ManagementFactory.getPlatformMXBean(
                com.sun.management.OperatingSystemMXBean.class).getTotalMemorySize();

        return totalMemorySize;
    }

    private long getFreeMemorySize() {
        long freeMemorySize = ManagementFactory.getPlatformMXBean(
                com.sun.management.OperatingSystemMXBean.class).getFreeMemorySize();

        return freeMemorySize;
    }
}
