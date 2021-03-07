package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Curie {
    private JFrame window;
    private Container con;
    private JPanel titleNamePanel, choiceButtonPanel, mainTextPanel;
    private JButton choice1, choice2;
    private JTextArea mainTextArea;
    private Font font;
    private ChoiceHandler choiceHandler = new ChoiceHandler();
    private String position;

    public Curie() {
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

        JLabel titleNameLabel = new JLabel("Marie Curie");
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
        mainTextArea.setText("MARIE: Sometimes I wish to be a governess again");
        choice1.setText("You would be a professor today haha");
        choice2.setText("Why though?");
    }

    public void secondA() {
        position = "secondA";
        mainTextArea.setText("MARIE: Sometimes I wish to be a governess again"
                + "\nYOU: You would be a professor today haha");
        choice1.setText("Marie is typing...");
        choice2.setText("");
    }

    public void thirdA() {
        position = "thirdA";
        mainTextArea.setText("MARIE: Sometimes I wish to be a governess again"
                + "\nYOU: You would be a professor today haha"
                + "\nMARIE: I think I'll be a cool professor with two"
                + "\n              nobel prizes. I'll teach students radioactivity");
        choice1.setText("Why of course!");
        choice2.setText("Oh man I wish I had a nobel prize");
    }

    public void fourthA() {
        position = "fourthA";
        mainTextArea.setText("MARIE: I think I'll be a cool professor with two"
                +"\n              nobel prizes. I'll teach students radioactivity"
                +"\nYOU: Why of course!");
        choice1.setText("Marie is typing...");
        choice2.setText("");
    }

    public void fourthB() {
        position = "fourthB";
        mainTextArea.setText("MARIE: I think I'll be a cool professor with two"
                +"\n              nobel prizes. I'll teach students radioactivity"
                +"\nYOU: Oh man I wish I had a nobel prize");
        choice1.setText("Marie is typing...");
        choice2.setText("");
    }

    public void fifthA() {
        position = "fifthA";
        mainTextArea.setText("YOU: Why of course!"
                +"\nMARIE: It was a lot of work to isolated radium, so I"
                +"\n              was happy they gave me a Nobel Prize :)");
        choice1.setText("That sounds great :)");
        choice2.setText("");
    }

    public void fifthB() {
        position = "fifthB";
        mainTextArea.setText("YOU: Oh man I wish I had a nobel prize"
                +"\nMARIE: It's a lot of work, but I did give the"
                +"\n              first Nobel Prize money to friends, family, students,"
                +"\n              and research associates");
        choice1.setText("That sounds great :)");
        choice2.setText("");
    }

    public void secondB() {
        position = "secondB";
        mainTextArea.setText("MARIE: Sometimes I wish to be a governess again"
                + "\nYOU: Why though?");
        choice1.setText("Marie is typing...");
        choice2.setText("");
    }

    public void thirdB() {
        position = "thirdB";
        mainTextArea.setText("MARIE: Sometimes I wish to be a governess again"
                + "\nYOU: Why though?"
                + "\nMARIE: Although the job was to earn money for my family");
        choice1.setText("Marie is typing...");
        choice2.setText("");
    }

    public void thirdB2() {
        position = "thirdB2";
        mainTextArea.setText("MARIE: Sometimes I wish to be a governess again"
                + "\nYOU: Why though?"
                + "\nMARIE: Although the job was to earn money for my family"
                + "\nMARIE: But I still enjoyed teaching a lot");
        choice1.setText("That sounds great :)");
        choice2.setText("");
    }

    public void advice() {
        position = "advice";
        mainTextArea.setText("YOU: That sounds great :)");
        choice1.setText("Marie is typing...");
        choice2.setText("");
    }

    public void adviceA() {
        position = "adviceA";
        mainTextArea.setText("YOU: That sounds great :)"
                +"\nMARIE: Yes, remember to have faith in your own research");
        choice1.setText("Marie is typing...");
        choice2.setText("");
    }

    public void adviceB() {
        position = "adviceB";
        mainTextArea.setText("YOU: That sounds great :)"
                +"\nMARIE: Yes, remember to have faith in your own research"
                +"\nMARIE: Do not fear the unknown, it is merely knowledge to"
                +"\n              be discovered. The more you understand, the less"
                +"\n              you will fear");
        choice1.setText("Marie is typing...");
        choice2.setText("");
    }

    public void adviceC() {
        position = "adviceB";
        mainTextArea.setText("MARIE: Yes, remember to have faith in your own research"
                +"\nMARIE: Do not fear the unknown, it is merely knowledge to"
                +"\n              be discovered. The more you understand, the less"
                +"\n              you will fear"
                +"\nMARIE: Oh, my husband is calling me, talk to you later :D");
        choice1.setText("Marie is offline");
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
                case "fifthA":
                case "fifthB":
                    switch (yourChoice) {
                        case "c1": advice(); break;
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
