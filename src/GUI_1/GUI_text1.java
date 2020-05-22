package GUI_1;

import javax.swing.*;

public class GUI_text1 {
    public static void main(String[] args) {
        Create();
    }
    public static void Create(){
        MyG_text1 frame = new MyG_text1("This is a Opear");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        frame.setVisible(true);//放在最后
    }
}

