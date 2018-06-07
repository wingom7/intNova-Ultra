package ventana;

import java.awt.Color;
import javax.swing.JProgressBar;

public class Cargar extends Thread {

    JProgressBar progreso;

    public Cargar(JProgressBar progreso) {

        super();
        this.progreso = progreso;

    }

    @Override
    public void run() {
        for (int i = 1; i <= 400; i++) {

            progreso.setValue(i);
            progreso.setBackground(Color.cyan);
            progreso.setForeground(Color.cyan);
            pausa(20);

        }
    }

    public void pausa(int mlSeg) {

        try {
            Thread.sleep(mlSeg);
        } catch (Exception e) {

        }

    }

}
