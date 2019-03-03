package Test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class AL implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("gfhgfhgfh "+new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
