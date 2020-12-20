package ChaoFan.select;

import ChaoFan.circle.CircleFrame;
import ChaoFan.pool.PoolFrame;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Select {
    public static void main(String[] args) {
        try {
            // 设置本属性将改变窗口边框样式定义
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.generalNoTranslucencyShadow;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
            BeautyEyeLNFHelper.translucencyAtFrameInactive = false;




        JFrame frame = new JFrame("选择");
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(d.width / 4, d.height / 4);
        frame.setLocation(800,200);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER , 50 , 50)); //为JFrame顶层容器设置FlowLayout布局管理器


        JPanel contentPane = new JPanel();
        contentPane.setSize(100 , 100);
        //内部按钮对齐方式，水平和垂直间距
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER , 50 , 50)); //为Japnel设置布局管理器
        JButton btn1 , btn2  ; //定义2个按钮
        btn1 = new JButton("循环缓冲");
        btn2 = new JButton("缓冲池");
        contentPane.add(btn1);
        contentPane.add(btn2);

        frame.add(contentPane);
        frame.setVisible(true); //显示JFrame


        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CircleFrame circleFrame = new CircleFrame();
                CircleFrame.main(args);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PoolFrame poolFrame = new PoolFrame();
                PoolFrame.main(args);
            }
        });

        } catch (Exception e) {
            // TODO exception
            e.printStackTrace();
        }
    }

    }


