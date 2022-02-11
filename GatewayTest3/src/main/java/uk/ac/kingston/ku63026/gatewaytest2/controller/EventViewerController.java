/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ku63026.gatewaytest2.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author tugso
 */
public class EventViewerController implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "deleteSelected":
                System.out.println("Delete Selected button clicked");
                break;
        }
    }
}
