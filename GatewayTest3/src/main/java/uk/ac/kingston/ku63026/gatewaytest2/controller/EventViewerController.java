/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ku63026.gatewaytest2.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import uk.ac.kingston.ku63026.gatewaytest2.model.EventPlanner;
import uk.ac.kingston.ku63026.gatewaytest2.view.EventViewer;

/**
 *
 * @author tugso
 */
public class EventViewerController implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent ae) {
        EventViewer ev = EventViewer.getInstance();
        EventPlanner em = EventPlanner.getInstance();
        switch (ae.getActionCommand()) {
            case "DeleteEvent":
                System.out.println("Delete Selected button clicked");
                System.out.println(ae.getActionCommand());
                if (ev.getTextAreaPanel().getTextAreaPanel().getSelectedText() == null) {
   
                    System.out.println("None Selected");
                }
                else {
                    System.out.println(ev.getTextAreaPanel().getTextAreaPanel().getSelectedText());
                    em.getTheEvent(ev.getTextAreaPanel().getTextAreaPanel().getSelectedText());
                    em.deleteEvent(ev.getTextAreaPanel().getTextAreaPanel().getSelectedText());
                    //System.out.println(em.getEvents().get(em.getSelectedEvent(ev.getTextAreaPanel().getTextAreaPanel().getSelectedText())));
                }
   
                break;
        }
    }
}
