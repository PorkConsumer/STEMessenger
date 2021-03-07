package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lovelace {
    private JFrame window;
    private Container con;
    private JPanel titleNamePanel, choiceButtonPanel, mainTextPanel;
    private JButton choice1, choice2;
    private JTextArea mainTextArea;
    private Font font;
    private ChoiceHandler choiceHandler = new ChoiceHandler();
    private String position;

    public Lovelace() {
        window = new JFrame();
        window.setSize(800, 600);
        window.getContentPane().setBackground(Color.darkGray);
        window.setLayout(null);
        con = window.getContentPane();
        createGameScreen();
        window.setVisible(true);
    }

    public void makeTitlePanel() {
        font = new Font("Bauhaus 93", Font.PLAIN, 45);
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(0, 50, 350, 50);
        titleNamePanel.setBackground(Color.darkGray);

        JLabel titleNameLabel = new JLabel("Ada Lovelace");
        titleNameLabel.setForeground(Color.pink);
        titleNameLabel.setFont(font);

        titleNamePanel.add(titleNameLabel);
        con.add(titleNamePanel);
    }

    public void createGameScreen() {
        makeTitlePanel();
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(75,125,625, 200);
        mainTextPanel.setBackground(Color.darkGray);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea();
        mainTextArea.setBounds(75, 125, 625, 200);
        mainTextArea.setBackground(Color.darkGray);
        mainTextArea.setForeground(Color.white);

        font = new Font("Berlin Sans FB", Font.PLAIN, 25);
        mainTextArea.setFont(font);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);
        makeChoicePanel();
    }

    public void makeChoicePanel() {
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(100,350,600,150);
        choiceButtonPanel.setBackground(Color.darkGray);
        choiceButtonPanel.setLayout(new GridLayout(3,1));
        con.add(choiceButtonPanel);

        font = new Font("Berlin Sans FB", Font.PLAIN, 25);
        choice1 = new JButton("Choice 1");
        choice1.setBackground(Color.darkGray);
        choice1.setForeground(Color.white);
        choice1.setFont(font);
        choice1.setFocusPainted(false);
        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Choice 2");
        choice2.setBackground(Color.darkGray);
        choice2.setForeground(Color.white);
        choice2.setFont(font);
        choice2.setFocusPainted(false);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);
        first();
    }

    public void first() {
        position = "first";
        mainTextArea.setText("ADA: You there? About time you admit that I won the bet!");
        choice1.setText("Yes I am here");
        choice2.setText("I am not here :)");
    }

    public void secondA() {
        position = "secondA";
        mainTextArea.setText("ADA: You there? About time you admit that I won the bet!"
                        + "\nYOU: Yes I am here");
        choice1.setText("Ada is typing...");
        choice2.setText("");
    }

    public void thirdA() {
        position = "thirdA";
        mainTextArea.setText("ADA: You there? About time you admit that I won the bet!"
                + "\nYOU: Yes I am here"
                + "\nADA: My prediction was right! Told you that computers "
                + "\n          could do more than just math, it can store music/"
                + "\n          images too");
        choice1.setText("Fine, Ms.Genius what do you want for winning?");
        choice2.setText("You're right, now tutor me?");
    }

    public void fourthA() {
        position = "fourthA";
        mainTextArea.setText("ADA: My prediction was right! Told you that computers"
                +"\n          could do more than just math, it can store music/"
                +"\n          images too"
                +"\nYOU: Fine, Ms.Genius what do you want for winning?");
        choice1.setText("Ada is typing...");
        choice2.setText("");
    }

    public void fourthB() {
        position = "fourthB";
        mainTextArea.setText("ADA: My prediction was right! Told you that computers"
                +"\n          could do more than just math, it can store music/"
                +"\n          images too"
                +"\nYOU: You're right, now tutor me?");
        choice1.setText("Ada is typing...");
        choice2.setText("");
    }

    public void fifthA() {
        position = "fifthA";
        mainTextArea.setText("ADA: My prediction was right! Told you that computers"
                +"\n          could do more than just math, it can store music/"
                +"\n          images too"
                +"\nYOU: Fine, Ms.Genius what do you want for winning?"
                +"\nADA: Learn the programming language"
                +"\n          developed by US Dod, it's named in my honour");
        choice1.setText("ARE YOU SERIOUS!?");
        choice2.setText("");
    }

    public void fifthB() {
        position = "fifthB";
        mainTextArea.setText("ADA: My prediction was right! Told you that computers"
                + "\n          could do more than just math, it can store music/"
                + "\n          images too"
                +"\nYOU: You're right, now tutor me?"
                +"\nADA: I'm busy, but my mom can. She taught me math and"
                +"\n          science since I was 4");
        choice1.setText("ARE YOU SERIOUS!?");
        choice2.setText("");
    }

    public void sixthA() {
        position = "sixthA";
        mainTextArea.setText("YOU: Fine, Ms.Genius what do you want for winning?"
                +"\nADA: Learn the programming language"
                +"\n          developed by US Dod, it's named in my honour"
                +"\nYOU: ARE YOU SERIOUS!?");
        choice1.setText("Ada is typing...");
        choice2.setText("");
    }

    public void sixthB() {
        position = "sixthB";
        mainTextArea.setText("YOU: You're right, now tutor me?"
                +"\nADA: I'm busy, but my mom can. She taught me math and"
                +"\n          science since I was 4"
                +"\nYOU: ARE YOU SERIOUS!?");
        choice1.setText("Ada is typing...");
        choice2.setText("");
    }

    public void secondB() {
        position = "secondB";
        mainTextArea.setText("ADA: You there? About time you admit that I won the bet!"
                + "\nYOU: I am not here :)");
        choice1.setText("Ada is typing...");
        choice2.setText("");
    }

    public void thirdB() {
        position = "thirdB";
        mainTextArea.setText("ADA: You there? About time you admit that I won the bet!"
                + "\nYOU: I am not here :)"
                + "\nADA: Wow, I wonder where you could be?");
        choice1.setText("Ada is typing...");
        choice2.setText("");
    }

    public void thirdB2() {
        position = "thirdB2";
        mainTextArea.setText("ADA: You there? About time you admit that I won the bet!"
                +"\nYOU: I am not here :)"
                +"\nADA: Wow, I wonder where you could be?"
                +"\nADA: My prediction was right! Told you that computers"
                +"\n          could do more than just math, it can store music/"
                +"\n          images too");
        choice1.setText("Fine, Ms.Genius what do you want for winning?");
        choice2.setText("You're right, now tutor me?");
    }

    public void advice() {
        position = "advice";
        mainTextArea.setText("YOU: ARE YOU SERIOUS!?");
        choice1.setText("Ada is typing...");
        choice2.setText("");
    }

    public void adviceA() {
        position = "adviceA";
        mainTextArea.setText("YOU: ARE YOU SERIOUS!?"
                +"\nADA: Of course I am :)");
        choice1.setText("Ada is typing...");
        choice2.setText("");
    }

    public void adviceB() {
        position = "adviceB";
        mainTextArea.setText("YOU: ARE YOU SERIOUS!?"
                +"\nADA: Of course I am :)"
                +"\nADA: Remember to always be thirsty for knowledge,"
                +"\n          the more you study the more you will grow to love "
                +"\n          studying");
        choice1.setText("Ada is typing...");
        choice2.setText("");
    }

    public void adviceC() {
        position = "adviceB";
        mainTextArea.setText("YOU: ARE YOU SERIOUS!?"
                +"\nADA: Of course I am :)"
                +"\nADA: Remember to always be thirsty for knowledge,"
                +"\n          the more you study the more you will grow to love "
                +"\n          studying"
                +"\nADA: I need to leave for work now, see you around");
        choice1.setText("Ada is offline");
        choice2.setText("");
    }

    public class ChoiceHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String yourChoice = e.getActionCommand();
            switch(position) {
                case "first":
                    switch(yourChoice) {
                        case "c1": secondA(); break;
                        case "c2": secondB(); break;
                    }
                    break;
                case "secondA":
                    switch (yourChoice) {
                        case "c1": thirdA(); break;
                    }
                    break;
                case "thirdA":
                case "thirdB2":
                    switch (yourChoice) {
                        case "c1": fourthA(); break;
                        case "c2": fourthB(); break;
                    }
                    break;
                case "fourthA":
                    switch (yourChoice) {
                        case "c1": fifthA(); break;
                    }
                    break;
                case "fourthB":
                    switch (yourChoice) {
                        case "c1": fifthB(); break;
                    }
                    break;
                case "fifthA":
                    switch (yourChoice) {
                        case "c1": sixthA(); break;
                    }
                    break;
                case "fifthB":
                    switch (yourChoice) {
                        case "c1": sixthB(); break;
                    }
                    break;
                case "sixthA":
                case "sixthB":
                    switch (yourChoice) {
                        case "c1": advice(); break;
                    }
                    break;
                case "advice":
                    switch (yourChoice) {
                        case "c1": adviceA(); break;
                    }
                    break;
                case "adviceA":
                    switch (yourChoice) {
                        case "c1": adviceB(); break;
                    }
                    break;
                case "adviceB":
                    switch (yourChoice) {
                        case "c1": adviceC(); break;
                    }
                    break;
                //
                case "secondB":
                    switch (yourChoice) {
                        case "c1": thirdB(); break;
                    }
                    break;
                case "thirdB":
                    switch (yourChoice) {
                        case "c1": thirdB2(); break;
                    }
                    break;
            }
        }
    }
}
