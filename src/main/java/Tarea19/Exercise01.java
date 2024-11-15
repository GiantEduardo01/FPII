/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea19;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author eduardo
 */
public class Exercise01 extends JFrame {

    /**
     * @param args the command line arguments
     */
    private final int WIDTH = 250;
    private final int HEIGHT = 150;
    private final int GRID_ROWS = 3;
    private final int GRID_COLUMNS = 3;
    private final int SPACE_BETWEEN_GRID_CELLS = 20;
    private final int NUMBER_OF_GRID_CELLS= 9;
    
    public Exercise01() {
        this.setSize(WIDTH, HEIGHT);
        this.setTitle("Three in Row");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.createContent();
        this.setVisible(true);
    }
    
    private void createContent() {
        JPanel comp1 = createComponentPlayersInfo();
        JPanel comp2 = createNineCells();
        
        this.add(comp1, BorderLayout.NORTH);
        this.add(comp2, BorderLayout.SOUTH);
    }
    
    private JPanel createComponentPlayersInfo() {
        JPanel playerInfo = new JPanel(new BorderLayout());
        JLabel player1 = new JLabel("Jugador 1: x");
        JLabel player2 = new JLabel("Jugador 2: O");
        playerInfo.add(player1, BorderLayout.NORTH);
        playerInfo.add(player2, BorderLayout.SOUTH);
        return playerInfo;
    }
    
    private JPanel createNineCells() {
        JPanel cells = new JPanel(new GridLayout(GRID_ROWS, GRID_COLUMNS, SPACE_BETWEEN_GRID_CELLS, SPACE_BETWEEN_GRID_CELLS));
        JButton[] buttons = new JButton[NUMBER_OF_GRID_CELLS];
        for (int i = 0; i < NUMBER_OF_GRID_CELLS; i++) {
            buttons[i] = new JButton();
            cells.add(buttons[i]);
        }
        
        return cells;
    }
    
    public static void main(String[] args) {
        Exercise01 e = new Exercise01();
        // TODO code application logic here
    }
    
}
