import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.plaf.basic.BasicBorders.MenuBarBorder;
//TODO set up menue bar to change background fron default
//TODO set up menue bar to allow pvp
//TODO set up minimax algorithm to create an impossible to beat AI and set as option on menue bar

public class GUI extends JFrame implements ActionListener {

    int modeSelection = 2;
    Board GameBoard = new Board();
    Game PlayGame = new Game(GameBoard);
    Player1 myPlayer1 = new Player1();
    Player2 myPlayer2 = new Player2(PlayGame);
    String catWon = "The Cat";
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;

    private void update() {
        button1.setText(GameBoard.space1);
        button2.setText(GameBoard.space2);
        button3.setText(GameBoard.space3);
        button4.setText(GameBoard.space4);
        button5.setText(GameBoard.space5);
        button6.setText(GameBoard.space6);
        button7.setText(GameBoard.space7);
        button8.setText(GameBoard.space8);
        button9.setText(GameBoard.space9);
    }

    private void setBoardSpace(Board board, int spaceSelection, int modeSelection) {
        if (PlayGame.getTurn() % 2 == 0) {
            myPlayer1.pressButton(board, spaceSelection);
        }
        if ((PlayGame.getTurn() % 2 != 0) && (modeSelection == 1)) {
            myPlayer2.choseMode(board, spaceSelection, modeSelection);
        }
        if ((PlayGame.getTurn() % 2 != 0) && (modeSelection == 2)) {
            myPlayer2.choseMode(board, spaceSelection, modeSelection);
            update();
            PlayGame.turnCount();
        }
        if ((PlayGame.getTurn() % 2 != 0) && (modeSelection == 3)) {
            myPlayer2.choseMode(board, spaceSelection, modeSelection);
        }
    }

    private void letAiPlay() {
        if (modeSelection != 1) {
            setBoardSpace(GameBoard, 0, modeSelection);
            if (PlayGame.winCheck()) {
                new ResultWindow(PlayGame.whoWon());
            }
            if (PlayGame.isTie()) {
                new ResultWindow(catWon);
            }
        }
    }

    GUI() {

        ImageIcon gameBackground = new ImageIcon("TicTacToe_Board.png");
        JLabel background = new JLabel(gameBackground);
        Font font = new Font("FredokaOne-Regular.ttf", Font.BOLD, 200);
        MenuBar menu = new MenuBar();
        JMenu theme = new JMenu("Theme");
        JMenu AI = new JMenu("AI");

        this.setContentPane(background);
        this.setTitle("Tic Tac Toe");
        this.setSize(700, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setIconImage(new ImageIcon("icon.jpg").getImage());

        button1 = new JButton();
        button1.setFont(font);
        button1.setBounds(9, -2, 200, 200);
        button1.setOpaque(false);
        button1.setContentAreaFilled(false);
        button1.setForeground(Color.BLACK);
        button1.setBorderPainted(false);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (" ".equals(GameBoard.space1)) {
                    setBoardSpace(GameBoard, 1, modeSelection);
                    button1.setText(GameBoard.space1);
                    PlayGame.turnCount();
                    if (PlayGame.winCheck()) {
                        new ResultWindow(PlayGame.whoWon());
                    }
                    if (PlayGame.isTie()) {
                        new ResultWindow(catWon);
                    } else if (!PlayGame.winCheck() && !PlayGame.isTie()) {
                        letAiPlay();
                    }
                }

            }
        });
        this.add(button1);
        button2 = new JButton();
        button2.setFont(font);
        button2.setBounds(243, -2, 200, 200);
        button2.setContentAreaFilled(false);
        button2.setForeground(Color.BLACK);
        button2.setBorderPainted(false);
        button2.setOpaque(false);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (" ".equals(GameBoard.space2)) {
                    setBoardSpace(GameBoard, 2, modeSelection);
                    button2.setText(GameBoard.space2);
                    PlayGame.turnCount();
                    if (PlayGame.winCheck()) {
                        new ResultWindow(PlayGame.whoWon());
                    }
                    if (PlayGame.isTie()) {
                        new ResultWindow(catWon);
                    } else if (!PlayGame.winCheck() && !PlayGame.isTie()) {
                        letAiPlay();
                    }
                }

            }
        });
        this.add(button2);
        button3 = new JButton();
        button3.setFont(font);
        button3.setBounds(476, -2, 200, 200);
        button3.setContentAreaFilled(false);
        button3.setForeground(Color.BLACK);
        button3.setBorderPainted(false);
        button3.setOpaque(false);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (" ".equals(GameBoard.space3)) {
                    setBoardSpace(GameBoard, 3, modeSelection);
                    button3.setText(GameBoard.space3);
                    PlayGame.turnCount();
                    if (PlayGame.winCheck()) {
                        new ResultWindow(PlayGame.whoWon());
                    }
                    if (PlayGame.isTie()) {
                        new ResultWindow(catWon);
                    } else if (!PlayGame.winCheck() && !PlayGame.isTie()) {
                        letAiPlay();
                    }
                }
            }
        });
        this.add(button3);
        button4 = new JButton();
        button4.setFont(font);
        button4.setBounds(9, 230, 200, 200);
        button4.setContentAreaFilled(false);
        button4.setForeground(Color.BLACK);
        button4.setBorderPainted(false);
        button4.setOpaque(false);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (" ".equals(GameBoard.space4)) {
                    setBoardSpace(GameBoard, 4, modeSelection);
                    button4.setText(GameBoard.space4);
                    PlayGame.turnCount();
                    if (PlayGame.winCheck()) {
                        new ResultWindow(PlayGame.whoWon());
                    }
                    if (PlayGame.isTie()) {
                        new ResultWindow(catWon);
                    } else if (!PlayGame.winCheck() && !PlayGame.isTie()) {
                        letAiPlay();
                    }
                }
            }
        });
        this.add(button4);
        button5 = new JButton();
        button5.setFont(font);
        button5.setBounds(243, 230, 200, 200);
        button5.setContentAreaFilled(false);
        button5.setForeground(Color.BLACK);
        button5.setBorderPainted(false);
        button5.setOpaque(false);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (" ".equals(GameBoard.space5)) {
                    setBoardSpace(GameBoard, 5, modeSelection);
                    button5.setText(GameBoard.space5);
                    PlayGame.turnCount();

                    if (PlayGame.winCheck()) {
                        new ResultWindow(PlayGame.whoWon());
                    }
                    if (PlayGame.isTie()) {
                        new ResultWindow(catWon);
                    } else if (!PlayGame.winCheck() && !PlayGame.isTie()) {
                        letAiPlay();
                    }
                }
            }
        });
        this.add(button5);
        button6 = new JButton();
        button6.setFont(font);
        button6.setBounds(476, 230, 200, 200);
        button6.setContentAreaFilled(false);
        button6.setForeground(Color.BLACK);
        button6.setBorderPainted(false);
        button6.setOpaque(false);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (" ".equals(GameBoard.space6)) {
                    setBoardSpace(GameBoard, 6, modeSelection);
                    button6.setText(GameBoard.space6);
                    PlayGame.turnCount();
                    if (PlayGame.winCheck()) {
                        new ResultWindow(PlayGame.whoWon());
                    }
                    if (PlayGame.isTie()) {
                        new ResultWindow(catWon);
                    } else if (!PlayGame.winCheck() && !PlayGame.isTie()) {
                        letAiPlay();
                    }
                }
            }
        });
        this.add(button6);
        button7 = new JButton();
        button7.setFont(font);
        button7.setBounds(9, 463, 200, 200);
        button7.setContentAreaFilled(false);
        button7.setForeground(Color.BLACK);
        button7.setBorderPainted(false);
        button7.setOpaque(false);
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (" ".equals(GameBoard.space7)) {
                    setBoardSpace(GameBoard, 7, modeSelection);
                    button7.setText(GameBoard.space7);
                    PlayGame.turnCount();
                    if (PlayGame.winCheck()) {
                        new ResultWindow(PlayGame.whoWon());
                    }
                    if (PlayGame.isTie()) {
                        new ResultWindow(catWon);
                    } else if (!PlayGame.winCheck() && !PlayGame.isTie()) {
                        letAiPlay();
                    }
                }
            }
        });
        this.add(button7);
        button8 = new JButton();
        button8.setFont(font);
        button8.setBounds(243, 463, 200, 200);
        button8.setContentAreaFilled(false);
        button8.setForeground(Color.BLACK);
        button8.setBorderPainted(false);
        button8.setOpaque(false);
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (" ".equals(GameBoard.space8)) {
                    setBoardSpace(GameBoard, 8, modeSelection);
                    button8.setText(GameBoard.space8);
                    PlayGame.turnCount();
                    if (PlayGame.winCheck()) {
                        new ResultWindow(PlayGame.whoWon());
                    }
                    if (PlayGame.isTie()) {
                        new ResultWindow(catWon);
                    } else if (!PlayGame.winCheck() && !PlayGame.isTie()) {
                        letAiPlay();
                    }
                }
            }
        });
        this.add(button8);
        button9 = new JButton();
        button9.setFont(font);
        button9.setBounds(476, 463, 200, 200);
        button9.setContentAreaFilled(false);
        button9.setForeground(Color.BLACK);
        button9.setBorderPainted(false);
        button9.setOpaque(false);
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (" ".equals(GameBoard.space9)) {
                    setBoardSpace(GameBoard, 9, modeSelection);
                    button9.setText(GameBoard.space9);
                    PlayGame.turnCount();
                    if (PlayGame.winCheck()) {
                        new ResultWindow(PlayGame.whoWon());
                    }
                    if (PlayGame.isTie()) {
                        new ResultWindow(catWon);
                    } else if (!PlayGame.winCheck() && !PlayGame.isTie()) {
                        letAiPlay();
                    }
                }
            }
        });
        this.add(button9);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
