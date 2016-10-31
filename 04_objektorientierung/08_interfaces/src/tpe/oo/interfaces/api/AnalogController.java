package tpe.oo.interfaces.api;

import java.awt.Point;

public interface AnalogController {
    /**
     * Nach oben bewegen.
     */
    void up(double procentage);

    /**
     * Nach unten bewegen.
     */
    void down(double procentage);

    /**
     * Nach links bewegen.
     */
    void left(double procentage);

    /**
     * Nach rechts bewegen.
     */
    void right(double procentage);

    /**
     * Liefert die aktuelle Position zurück.
     *
     * @return Die Position.
     */
    Point getPosition();
}
