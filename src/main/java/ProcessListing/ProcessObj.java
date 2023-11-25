package ProcessListing;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProcessObj {
    private long id;
    private String name;
    private String pathExe;
    private String cpuUsage;
    private String timeSinceRunning;

    public ProcessObj(long id, String name, String pathExe, String cpuUsage, String timeSinceRunning) {
        this.id = id;
        this.name = name;
        this.pathExe = pathExe;
        this.cpuUsage = cpuUsage;
        this.timeSinceRunning = timeSinceRunning;
    }
}
