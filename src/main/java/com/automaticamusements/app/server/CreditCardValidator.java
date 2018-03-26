package com.automaticamusements.app.server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;




/**
 * Created by wahaba on 19/01/2018.
 *
 * 1. Double every second digit from right to left. If doubling of a digit results in a two-digit number, add up the two digits to get a single-digit number.
 2*2=4
 2*2=4
 4*2=8
 1*2=2
 6*2=12 (1+2= 3)
 5*2=10 (1+0=1)
 8*2=16 (1+6=7)
 4*2=8

 2. Now add all single-digit numbers from Step 1.
 4+4+8+2+3+1+7+8 = 37

 3. Add all digits in the odd places from right to left in the card number.
 6+6+0+8+7+8+3=38

 4. Sum the results from Step 2 and Step 3;
 37+38=75

 5. If the result from Step 4 is divisible by 10, the card number is valid; otherwise, it is invalid. For example, the number 4388576018402626 is invalid, but the number 4388576018410707 is valid.
 Write a program that prompts the user to enter a credit card number as a long integer. Display whether the number is valid or invalid.
 *
 */
public class CreditCardValidator implements MouseListener {

    private void createUI() {
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(800, 600));

        JTextField cardNumberTextField = new JTextField();
        frame.add(cardNumberTextField);
    }


    private int getSumOfOddPlaces(long cardNumber) {
        String number = String.valueOf(cardNumber);
        int totalSum = 0;
        for (int i = 0; i < number.length(); i++) {
            if (i % 2 == 0) {
                int currentNumber = (Integer.parseInt(String.valueOf(number.charAt(i))) * 2);
                totalSum +=0;


            }
        }


        return 0;
    }

    private int getSumOfEvenPlaces() {
        return 0;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
