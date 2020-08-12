/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.butterfly;

/**
 *
 * @author garci
 */
import javax.swing.JOptionPane;

public class butterfly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rules sexy = new rules();
        // Set Colony Name
        String colonyName;
        colonyName = JOptionPane.showInputDialog("Colony Name");
        sexy.setNameColony(colonyName);
        // Set Caretaker
        String caretakerName;
        caretakerName = JOptionPane.showInputDialog("Caretaker Name");
        // Set Size
        String startSize;
        startSize = JOptionPane.showInputDialog("Starting Size");
        // Set convert String Size into int data type 
        int size = Integer.parseInt(startSize);
        // Set starting color
        String colonyColor;
        colonyColor = JOptionPane.showInputDialog("Starting Color");
        // Set additional color
        String addColor;
        addColor = JOptionPane.showInputDialog("Additional Color");
        // Set feed
        String Feed;
        Feed = JOptionPane.showInputDialog("How many times they were fed?");
        // Set convert String Feed convert into data type
        int food = Integer.parseInt(Feed);
        // Set Breed
        String Breed;
        Breed = JOptionPane.showInputDialog("Requested number of times to breed");
        // Set String Breed convert into int data type
        int intercourse = Integer.parseInt(Breed);
       
        // Set a reply for dialog box includes if and else statement
        int reply = JOptionPane.showConfirmDialog(null, "Do you want to add vitamins", "Another Question", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            sexy.setVitamin(true);
        } else {
            sexy.setVitamin(false);
        }

        // to call all methods from class to my main main
        sexy.colorAdd(addColor);
        sexy.setBreed(intercourse);
        sexy.setColonyColor(colonyColor);
        sexy.setFeed(food);
        sexy.setCaretakerName(caretakerName);
        sexy.setStartingSize(size);
        sexy.setColonyNum(size);
        sexy.breedCal();
        sexy.sick();
        
        JOptionPane.showMessageDialog(null, " " + "Colony Name: " + sexy.getNameColony() + "\nCaretaker Name: " + sexy.getCaretakerName() + "\nStarting Size: " + sexy.getStartingSize() + "\nStarting Color: " + sexy.getColonyColor() + "\nAdditional Color: " + sexy.getColorAdd() + "\nFinal Size: " + sexy.getColonyNum());
        
    }

}
