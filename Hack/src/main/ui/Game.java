package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    private JFrame window;
    private Container con;
    private JPanel titleNamePanel, startButtonPanel, choiceButtonPanel, mainTextPanel;
    private JButton choice1, choice2, choice3;
    protected JTextArea mainTextArea;
    private Font font;

    private TitleScreenHandler titleHandler = new TitleScreenHandler();
    private ChoiceHandler choiceHandler = new ChoiceHandler();
    private String position;

    public Game() {
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.pink);
        window.setLayout(null);
        con = window.getContentPane();
        makeTitlePanel();
        makeStartButton();
        window.setVisible(true);
    }

    public void makeTitlePanel() {
        font = new Font("Bauhaus 93", Font.PLAIN, 70);
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(Color.pink);

        JLabel titleNameLabel = new JLabel("STEMessenger");
        titleNameLabel.setForeground(Color.darkGray);
        titleNameLabel.setFont(font);

        titleNamePanel.add(titleNameLabel);
        con.add(titleNamePanel);
    }

    public void makeStartButton() {
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.pink);

        font = new Font("Berlin Sans FB", Font.PLAIN, 30);
        JButton startButton = new JButton("Start");
        startButton.setBackground(Color.pink);
        startButton.setForeground(Color.darkGray);
        startButton.setFont(font);
        startButton.addActionListener(titleHandler);

        startButtonPanel.add(startButton);
        con.add(startButtonPanel);
    }

    public void makeChoicePanel() {
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(100,350,600,150);
        choiceButtonPanel.setBackground(Color.pink);
        choiceButtonPanel.setLayout(new GridLayout(3,1));
        con.add(choiceButtonPanel);

        font = new Font("Berlin Sans FB", Font.PLAIN, 25);
        choice1 = new JButton("Choice 1");
        choice1.setBackground(Color.pink);
        choice1.setForeground(Color.darkGray);
        choice1.setFont(font);
        choice1.setFocusPainted(false);
        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Choice 2");
        choice2.setBackground(Color.pink);
        choice2.setForeground(Color.darkGray);
        choice2.setFont(font);
        choice2.setFocusPainted(false);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("Choice 3");
        choice3.setBackground(Color.pink);
        choice3.setForeground(Color.darkGray);
        choice3.setFont(font);
        choice3.setFocusPainted(false);
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);
    }

    public void createGameScreen() {
        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        font = new Font("Bauhaus 93", Font.PLAIN, 40);
        JPanel namePanel = new JPanel();
        namePanel.setBounds(0, 50, 350, 60);
        namePanel.setBackground(Color.pink);

        JLabel nameLabel = new JLabel("STEMessenger");
        nameLabel.setForeground(Color.darkGray);
        nameLabel.setFont(font);

        namePanel.add(nameLabel);
        con.add(namePanel);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600, 250);
        mainTextPanel.setBackground(Color.pink);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea();
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.pink);
        mainTextArea.setForeground(Color.darkGray);

        font = new Font("Berlin Sans FB", Font.PLAIN, 25);
        mainTextArea.setFont(font);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);
        makeChoicePanel();
        mainScreen();
    }

    public void mainScreen(){
        position = "mainScreen";
        mainTextArea.setText("You have new notifications..."
                            + "\n------------------------------------------------------------");
        choice1.setText("Ada Lovelace messaged you...");
        choice2.setText("Marie Curie messaged you...");
        choice3.setText("Sophie Germain messaged you...");
    }

    public class TitleScreenHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            createGameScreen();
        }
    }

    public class ChoiceHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            String yourChoice = e.getActionCommand();

            switch(position) {
                case "mainScreen":
                    switch(yourChoice) {
                        case "c1": new Lovelace(); break;
                        case "c2": new Curie(); break;
                        case "c3": new Germain(); break;
                    }
                    break;
            }
        }
    }
}