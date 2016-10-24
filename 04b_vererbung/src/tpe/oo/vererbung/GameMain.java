package tpe.oo.vererbung;

import java.awt.EventQueue;

import de.smits_net.games.framework.board.MainWindow;

/**
 * Hauptklasse des Spiels.
 */
public class GameMain extends MainWindow {
// TODO: Von MainWindow ableiten

    /**
     * Neues Spiel anlegen.
     */
    public GameMain() {
// TODO: Einkommentieren
       super("Poor Alien", new GameBoard());
    }

    /**
     * Startpunkt.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // Spiel starten
        EventQueue.invokeLater(GameMain::new);
    }
}

