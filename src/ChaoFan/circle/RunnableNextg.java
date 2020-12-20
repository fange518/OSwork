package ChaoFan.circle;

/*
 * @ClassName RunnableNextg
 * @Description 计算进程的线程
 */
public class RunnableNextg implements Runnable {
    public CircleBuffer circleBuffer;
    public int state;


    public int getState() {
        return state;
    }


    public void setState(int state) {
        this.state = state;
    }


    public RunnableNextg(CircleBuffer circleBuffer) {
        super();
        this.circleBuffer = circleBuffer;
    }


    @Override
    public void run() {
        while (true) {
            state = circleBuffer.getBuf(Buffer.Nextg);
            try {
                //让io多执行一会
                if (state == -2) {
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
