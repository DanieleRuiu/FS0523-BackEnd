package it.epicode.week1.day2;

import java.awt.*;

public class Esercizio4 {
    public static void main(String[] args) {
        jframe jframe = new jframe();
        jlabel jlabel = new jlabel();
        jframe.setLayout(new FlowLayout());
        jframe.setBounds(500, 300, 400, 100);

        jframe.add(jlabel);
        jframe.setVisible(true);

        timer timer = new timer();
        timer.scheduleAtFixedRate(new timerTask() {
            int i = 20;

            pubblic

            void run() {
                jlabel.setText("Secondi rimanenti: " + i);
                i--;

                if (i < 0) {
                    timer.cancel();
                    jlabel.setText("Tempo scaduto");

                }
            }
        }, 0, 1000);


    }

}
