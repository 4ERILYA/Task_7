package com.company;

import com.company.console.Main;
import com.company.utils.JTableUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private JPanel panel1;
    private JTable table1;
    private JButton insertNewArray;
    private JLabel solution;

    public static int[] array;

    public static int n;

    public MainForm() {
        setBounds(300, 100, 500, 200);
        setContentPane(panel1);
        setVisible(true);
        insertNewArray.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayReader arrayReader = new ArrayReader();
                arrayReader.setVisible(true);

                JTableUtils.writeArrayToJTable(table1, array);

                int solutionN = Main.solution(array, n);

                solution.setText("" + solutionN);

            }
        });
    }
}
