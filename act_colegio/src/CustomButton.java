import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomButton extends JButton {
    public CustomButton(String nombre){
        super("<html><font color='black'>" + nombre + "</font></html>");
        setOpaque(true);
        setBackground(Color.LIGHT_GRAY);
        setFont(new Font("Arial", Font.BOLD, 20));
        setAlignmentX(CENTER_ALIGNMENT);
        //Border lineBorder = BorderFactory.createLineBorder(Color.BLACK, 1); // Cambia el color y el grosor aquí
        //setBorder(lineBorder);
    }
    public void fun_close_app(){
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });
    }
}
