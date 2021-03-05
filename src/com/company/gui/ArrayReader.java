package com.company;

import javax.swing.*;
import java.awt.event.*;

public class ArrayReader extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textField1;
    private JTextField textField2;

    public ArrayReader() {
        setBounds(300, 100, 500, 200);
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });


        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {

        String[] notChangedTypeArray = textField1.getText().split(" ");
        int[] changedArray = new int[notChangedTypeArray.length];
        for (int i = 0; i < notChangedTypeArray.length; i++) {
            changedArray[i] = Integer.parseInt(notChangedTypeArray[i]);
        }
        MainForm.array = changedArray;

        int n = Integer.parseInt(textField2.getText());

        MainForm.n = n;
        dispose();
    }

    private void onCancel() {

        dispose();
    }

    public static void main(String[] args) {
        ArrayReader dialog = new ArrayReader();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
