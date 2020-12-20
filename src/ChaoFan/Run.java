package ChaoFan;

import ChaoFan.select.Select;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import java.awt.*;

/**
 * @ClassName Run
 * @Description 总执行类
 * @version 1.0
 */
public class Run {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // 设置本属性将改变窗口边框样式定义
                    BeautyEyeLNFHelper.frameBorderStyle = BeaytyEyeLNFHelper.FrameBorderStyle.generalNoTranslucencyShadow;
                    org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
                } catch (Exception e) {
                    // TODO exception
                    Select select = new Select();
                    Select.main(args);
                }
            }

        });


//        CircleFrame circleFrame = new CircleFrame();
//        circleFrame.main(args);
//        PoolFrame poolFrame = new PoolFrame();
//        PoolFrame.main(args);

    }
}
