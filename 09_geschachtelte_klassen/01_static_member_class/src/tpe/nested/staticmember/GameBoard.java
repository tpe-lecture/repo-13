package tpe.nested.staticmember;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.AnimatedImage;
import de.smits_net.games.framework.image.ImagePack;
import de.smits_net.games.framework.image.StripedImage;
import de.smits_net.games.framework.sprite.AnimatedSprite;
import de.smits_net.games.framework.sprite.Direction;
import de.smits_net.games.framework.sprite.Sprite.BoundaryPolicy;

/**
 * Spielfeld.
 */
public class GameBoard extends Board {
    static class Alien extends AnimatedSprite {

        /** Geschwindigkeit des Alien X-Richtung. */
        private static final int ALIEN_SPEED = 2;

        /**
         * Neues Alien anlegen.
         *
         * @param board das Spielfeld
         * @param startPoint Start-Position
         */
        public Alien(Board board, Point startPoint) {
            super(board, startPoint, BoundaryPolicy.JUMP_BACK,
                    new AnimatedImage(50,
                            new ImagePack("assets", "ship01", "ship02", "ship03")));
            velocity.setVelocity(Direction.WEST, ALIEN_SPEED);
        }

        /**
         * Alien explodieren lassen.
         */
        public void explode() {
            setActive(false);
            setImages(new AnimatedImage(20,
                    new StripedImage("assets/explosion_1.png", 43)));
            setInvisibleAfterFrames(70);
        }

        /**
         * Klick auf das Alien lässt es explodieren.
         */
        @Override
        public void mousePressed() {
            explode();
        }
    }

    /** Alien, das durch das Bild läuft. */
    private Alien alien;

    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
        // neues Spielfeld anlegen
        super(10, new Dimension(800, 300), Color.BLACK);

        // Alien initialisieren
        alien = new Alien(this, new Point(800, 50 + new Random().nextInt(100)));

        // Alien soll auf Maus-Klicks reagieren
        addMouseListener(alien);
    }

    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     */
    @Override
    public void drawGame(Graphics g) {
        // Alien zeichnen
        alien.draw(g, this);
    }

    /**
     * Game-Over-Text anzeigen. Wird vom Framework aufgerufen.
     */
    @Override
    public void drawGameOver(Graphics g) {
        centerText(g, "Das Spiel ist aus!");
    }

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     */
    @Override
    public boolean updateGame() {
        alien.move();
        return alien.isVisible();
    }
}
