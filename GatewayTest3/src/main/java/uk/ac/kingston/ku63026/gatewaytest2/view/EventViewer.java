/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ku63026.gatewaytest2.view;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import uk.ac.kingston.ku63026.gatewaytest2.controller.EventViewerController;

/**
 *
 * @author tugso
 */
public class EventViewer extends JFrame {
    
    private static EventViewer INSTANCE = new EventViewer();
    
    public static EventViewer getInstance() {
        if (INSTANCE==null) {
            INSTANCE = new EventViewer();
            //System.out.println("New EventViewer instance created");
        }
        //System.out.println("Using the first EventViewer instance created");
        return INSTANCE;
    }

    public TextAreaPanel getTextAreaPanel() {
        return textAreaPanel;
    }

    public void setTextAreaPanel(TextAreaPanel textAreaPanel) {
        this.textAreaPanel = textAreaPanel;
    }
    
    private TextAreaPanel textAreaPanel = new TextAreaPanel();
    
    private JButton deleteSelected = new JButton("Delete Selected");
    
    private EventViewer() {
        EventViewerController eventViewerController = new EventViewerController();
        this.setTitle("Event Viewer");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400,0,575,425);
        this.setLayout(new BorderLayout());
        deleteSelected.setActionCommand("DeleteEvent");
        deleteSelected.addActionListener(eventViewerController);
        this.add(textAreaPanel, BorderLayout.CENTER);
        this.add(deleteSelected, BorderLayout.SOUTH);
        this.setVisible(true);
    }
}
