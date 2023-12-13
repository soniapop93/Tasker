package Resources;

import java.lang.management.ManagementFactory;
public class Memory {
    public long memoryUsage() {
        long totalMemorySize = ManagementFactory.getPlatformMXBean(
                com.sun.management.OperatingSystemMXBean.class).getTotalMemorySize();
        long freeMemorySize = ManagementFactory.getPlatformMXBean(
                com.sun.management.OperatingSystemMXBean.class).getFreeMemorySize();
        long usedMemorySize = totalMemorySize - freeMemorySize;

        return usedMemorySize / (1024 * 1024);
    }

    public void alertMemoryusage() {
        //TODO: finish it
    }
}
