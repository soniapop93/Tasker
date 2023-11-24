package ProcessListing;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProcessObj {
    private int id;
    private String name;
    private double cpuUsage;
    private double memoryUsage;

    public ProcessObj(int id, String name, double cpuUsage, double memoryUsage) {
        this.id = id;
        this.name = name;
        this.cpuUsage = cpuUsage;
        this.memoryUsage = memoryUsage;
    }
}
