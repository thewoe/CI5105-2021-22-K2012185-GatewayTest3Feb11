/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ku63026.gatewaytest2.view;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author tugso
 */
public class TextAreaPanel extends JPanel {
    
    private JTextArea textAreaPanel = new JTextArea();
    private JScrollPane textAreaScrollPane = new JScrollPane(textAreaPanel);

    public JScrollPane getTextAreaScrollPane() {
        return textAreaScrollPane;
    }
    
    public void setTextAreaScrollPane(JScrollPane textAreaScrollPane) {
        this.textAreaScrollPane = textAreaScrollPane;
    }
    
    public JTextArea getTextAreaPanel() {
        return textAreaPanel;
    }

    public void setTextAreaPanel(JTextArea textAreaPanel) {
        this.textAreaPanel = textAreaPanel;
    }
    
    public TextAreaPanel() {
        this.setLayout(new BorderLayout());
        this.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 11));
        //this.textAreaPanel.setEditable(false);
        this.add(textAreaScrollPane);
    }
}