package net.imwork.zhanlong;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame
{
    public static void main(String[] args)
    {
        new MyFrame();
    }
    public MyFrame()
    {
        this.add(new JButton("我的按钮"));
        this.add(new JButton("我的按钮1"));

        this.setLayout(new FlowLayout(100,50,50));

        this.setTitle("展龙");

        this.setBounds(new Rectangle(10,20,400,300));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
