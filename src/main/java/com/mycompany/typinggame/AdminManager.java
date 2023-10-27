/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typinggame;

/**
 *
 * @author ausup
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class AdminManager {
    private ArrayList<JCheckBox> checkboxesToManage;
    private ArrayList<JButton> buttonsToManage;

    public AdminManager(ArrayList<JCheckBox> checkboxesToManage, ArrayList<JButton> buttonsToManage) {
        this.checkboxesToManage = checkboxesToManage;
        this.buttonsToManage = buttonsToManage;
    }

    public void disableButtons() {
        for (int i = 0; i < checkboxesToManage.size(); i++) {
            if (checkboxesToManage.get(i).isSelected()) {
                buttonsToManage.get(i).setEnabled(false);
            }
        }
    }
    
    
}

