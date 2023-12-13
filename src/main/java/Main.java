import Logic.TaskerLogic;

public class Main {
    public static void main(String[] args) {
        TaskerLogic taskerLogic = new TaskerLogic();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    taskerLogic.checkResources();
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();

        taskerLogic.tasker();

    }
}