package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Germain {
    private JFrame window;
    private Container con;
    private JPanel titleNamePanel, choiceButtonPanel, mainTextPanel;
    private JButton choice1, choice2;
    private JTextArea mainTextArea;
    private Font font;
    private ChoiceHandler choiceHandler = new ChoiceHandler();
    private String position;

    public Germain() {
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
        titleNamePanel.setBounds(0, 50, 400, 50);
        titleNamePanel.setBackground(Color.darkGray);

        JLabel titleNameLabel = new JLabel("Sophie Germain");
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
        mainTextArea.setText("SOPHIE: Have you spoke to Ada yet? OH GOSH!");
        choice1.setText("Yes I have");
        choice2.setText("No I have not");
    }

    public void secondA() {
        position = "secondA";
        mainTextArea.setText("SOPHIE: Have you spoke to Ada yet? OH GOSH!"
                + "\nYOU: Yes I have");
        choice1.setText("Sophie is typing...");
        choice2.setText("");
    }

    public void thirdA() {
        position = "thirdA";
        mainTextArea.setText("SOPHIE: Have you spoke to Ada yet? OH GOSH!"
                + "\nYOU: Yes I have"
                + "\nSOPHIE: I have always admired her work! Oh I hope"
                + "\n                she can see my essay on elasticity theory"
                + "\n                someday");
        choice1.setText("Have you talked to her yet?");
        choice2.setText("I hope so too");
    }

    public void fourthA() {
        position = "fourthA";
        mainTextArea.setText("SOPHIE: I have always admired her work! Oh I hope"
                +"\n                she can see my essay on elasticity theory"
                +"\n                someday"
                +"\nYOU: Have you talked to her yet?");
        choice1.setText("Sophie is typing...");
        choice2.setText("");
    }

    public void fourthB() {
        position = "fourthB";
        mainTextArea.setText("SOPHIE: I have always admired her work! Oh I hope"
                +"\n                she can see my essay on elasticity theory"
                +"\n                someday"
                +"\nYOU: I hope so too");
        choice1.setText("Sophie is typing...");
        choice2.setText("");
    }

    public void fifthA() {
        position = "fifthA";
        mainTextArea.setText("SOPHIE: I have always admired her work! Oh I hope"
                +"\n                she can see my essay on elasticity theory"
                +"\n                someday"
                +"\nYOU: Have you talked to her yet?"
                +"\nSOPHIE: Not yet, but I definitely will");
        choice1.setText("That's great :D");
        choice2.setText("");
    }

    public void fifthB() {
        position = "fifthB";
        mainTextArea.setText("YOU: I hope so too"
                +"\nSOPHIE: I have many cool things to show her"
                +"\n                about the elasticity theory");
        choice1.setText("That's great :D");
        choice2.setText("");
    }

    public void secondB() {
        position = "secondB";
        mainTextArea.setText("SOPHIE: Have you spoke to Ada yet? OH GOSH!"
                + "\nYOU: No I have not");
        choice1.setText("Sophie is typing...");
        choice2.setText("");
    }

    public void thirdB() {
        position = "thirdB";
        mainTextArea.setText("SOPHIE: Have you spoke to Ada yet? OH GOSH!"
                + "\nYOU: No I have not"
                + "\nSOPHIE: Awwn, too bad");
        choice1.setText("Sophie is typing...");
        choice2.setText("");
    }

    public void thirdB2() {
        position = "thirdB2";
        mainTextArea.setText("SOPHIE: Have you spoke to Ada yet? OH GOSH!"
                +"\nYOU: No I have not"
                +"\nSOPHIE: Awwn, too bad"
                +"\nSOPHIE: Her mom was very nice, unlike my dad..."
                +"\n                UGH he is always so against me studying"
                +"\n                sciences");
        choice1.setText("Don't mind him! You do you!");
        choice2.setText("You should be sneaky :)");
    }

    public void fourthC() {
        position = "fourthC";
        mainTextArea.setText("SOPHIE: Her mom was very nice, unlike my dad..."
                +"\n                UGH he is always so against me studying"
                +"\n                sciences"
                +"\nYOU: Don't mind him! You do you!"
                +"\nSOPHIE: Yeah I have been reading with stolen candles");
        choice1.setText("That's great :D");
        choice2.setText("");
    }

    public void fourthD() {
        position = "fourthD";
        mainTextArea.setText("SOPHIE: Her mom was very nice, unlike my dad..."
                +"\n                UGH he is always so against me studying"
                +"\n                sciences"
                +"\nYOU: You should be sneaky :)"
                +"\nSOPHIE: Yeah I have been reading with stolen candles");
        choice1.setText("That's great :D");
        choice2.setText("");
    }

    public void advice() {
        position = "advice";
        mainTextArea.setText("YOU: That's great :D");
        choice1.setText("Sophie is typing...");
        choice2.setText("");
    }

    public void adviceA() {
        position = "adviceA";
        mainTextArea.setText("YOU: That's great :D"
                +"\nSOPHIE: Yay! :)");
        choice1.setText("Sophie is typing...");
        choice2.setText("");
    }

    public void adviceB() {
        position = "adviceB";
        mainTextArea.setText("YOU: That's great :D"
                +"\nSOPHIE: Yay! :)"
                +"\nSOPHIE: Also, I am open to collaboration for that project."
                +"\n                What’s important is not who has the idea first,"
                +"\n                but how far that idea can go");
        choice1.setText("Sophie is typing...");
        choice2.setText("");
    }

    public void adviceC() {
        position = "adviceB";
        mainTextArea.setText("YOU: That's great :D"
                +"\nSOPHIE: Yay! :)"
                +"\nSOPHIE: Also, I am open to collaboration for that project."
                +"\n                What’s important is not who has the idea first,"
                +"\n                but how far that idea can go"
                +"\nSOPHIE: Let's work on it in a bit!");
        choice1.setText("Sophie is offline");
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
                    switch (yourChoice) {
                        case "c1": fourthA(); break;
                        case "c2": fourthB(); break;
                    }
                    break;
                case "thirdB2":
                    switch (yourChoice) {
                        case "c1": fourthC(); break;
                        case "c2": fourthD(); break;
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
                case "fifthB":
                case "fourthC":
                case "fourthD":
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
