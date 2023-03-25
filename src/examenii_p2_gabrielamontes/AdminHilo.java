/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii_p2_gabrielamontes;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author Gabriela Montes
 */
public class AdminHilo extends Thread {
 
  private JProgressBar barra;
  private double duracion;
  private boolean avanzar;
  private boolean live;

  public AdminHilo(JProgressBar barra, double duracion) {
    this.barra = barra;
    this.duracion =duracion;
    avanzar = true;
    live = true;
  }

  public JProgressBar getBarra() {
    return barra;
  }

  public void setBarra(JProgressBar barra) {
    this.barra = barra;
  }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }



  public boolean isAvanzar() {
    return avanzar;
  }

  public void setAvanzar(boolean avanzar) {
    this.avanzar = avanzar;
  }

  public boolean isLive() {
    return live;
  }

  public void setLive(boolean live) {
    this.live = live;
  }
  
  // Calcular tiempo
  public long Tiempo() {
    long newSize = Double.valueOf(duracion).longValue();

    long tiempo = newSize*7;

    return tiempo;
  }
  
    @Override
  public void run() {
    int max = (int) Tiempo();
    barra.setMaximum(max);
    while (live) {
      if (avanzar) {
        barra.setValue(barra.getValue() + 1);
        if (barra.getValue() == Tiempo()) {
          live = false;
        }
      } //FIN IF

      try {
        Thread.sleep(1000);
      } catch (InterruptedException ex) {
      }
    }

    barra.setValue(0);
    
    JOptionPane.showMessageDialog(null, "Descarga Terminada");
  }
}

