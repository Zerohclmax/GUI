package GUI_1;

import javax.swing.*;
import javax.swing.plaf.multi.MultiButtonUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyG_text1 extends JFrame {
    JButton button=new JButton("显示时间");
    JLabel timeLabel = new JLabel("00:00:00");
    public MyG_text1(String title){
        super(title);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        JPanel root = new JPanel();
        this.setContentPane(root);


        root.add(button);
        root.add(timeLabel);

        //创建监听器!!!!!!!!!!!!!!
//        MyButtonListener listener = new MyButtonListener();
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showTime();
            }
        };


//        button.addActionListener(listener);//(变量名也是浪费的)


//        button.addActionListener(new ActionListener() {//也比较麻烦，最好用lambda
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                showTime();
//            }
//        });
        button.addActionListener((e)->{
            showTime();
        });



    }
    private class MyButtonListener implements ActionListener{//内部类(效率低，最好用匿名内部类)
        public void actionPerformed(ActionEvent e){
            //当按钮被点击时，Swing框架调用被用监听器actionPerformed（）方法
            System.out.println("被调用！");
            MyG_text1.this.showTime();
        }

    }
    public void showTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String timestr= sdf.format(new Date());
        timeLabel.setText(timestr);
    }
}
