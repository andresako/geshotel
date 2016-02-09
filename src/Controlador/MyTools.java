package Controlador;

import javax.swing.JOptionPane;

/**
 * @author andres
 */
public class MyTools {

    public void mostrarError(String msg) {
        System.out.println("Error: " + msg);
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void mostrarAviso(String msg) {
        System.out.println("Aviso: " + msg);
        JOptionPane.showMessageDialog(null, msg, "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarPlain(String msg) {
        System.out.println("Plano: " + msg);
        JOptionPane.showMessageDialog(null, msg, "", JOptionPane.PLAIN_MESSAGE);
    }

    public int mostrarPreguntaSiNo(String msg) {
        String[] buttons = {"Si", "No"};
        int rc = JOptionPane.showOptionDialog(null, msg,
                "Confirmation", JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[1]);
        System.out.println("Pregunta: " + msg + " Respues: " + rc);

        return rc;
    }

    public String preguntarPor(String msg) {

        return JOptionPane.showInputDialog(null, msg,
                "Atención pregunta:", JOptionPane.QUESTION_MESSAGE);
    }
}
