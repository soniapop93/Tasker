import Logic.TaskerLogic;
import Resources.CPU;
import Resources.Memory;

public class Main {
    public static void main(String[] args) {
        //TaskerLogic taskerLogic = new TaskerLogic();
        //taskerLogic.tasker();

        Memory memory = new Memory();
        memory.memoryUsage();

        CPU cpu = new CPU();
        cpu.cpuUsage();
    }
}