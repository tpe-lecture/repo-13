package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;
import tpe.oo.interfaces.api.DigitalController;

public class DualShock4 implements AnalogController, DigitalController {

    AnalogControllerImpl ana = new AnalogControllerImpl();
    DigitalControllerImpl digi = new DigitalControllerImpl();

    @Override
    public void up() {
        digi.up();

    }

    @Override
    public void down() {
        digi.down();

    }

    @Override
    public void left() {
        digi.left();

    }

    @Override
    public void right() {
        digi.right();

    }

    @Override
    public void up(double procentage) {
        ana.up(procentage);

    }

    @Override
    public void down(double procentage) {
        ana.down(procentage);

    }

    @Override
    public void left(double procentage) {
       ana.left(procentage);

    }

    @Override
    public void right(double procentage) {
        ana.right(procentage);

    }

    @Override
    public Point getPosition() {
        // TODO Auto-generated method stub
        return new Point(ana.getPosition().x + digi.getPosition().x,
                ana.getPosition().y+digi.getPosition().y);
    }

}
