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
    public void fun_alta_curso(JPanel panel){
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                JLabel lbl_cod, lbl_nombre, lbl_tipo, lbl_num_asign;
                JTextField txtf_cod, txtf_nombre, txtf_num_asign;
                CustomButton btn_aceptar;
                CustomButton btn_cancelar;
                String[] opciones = {"Primero de Bachiller", "Segundo de Bachiller", "FP de Mecanica", "FP de Electronica", "FP deInformatica"};

                panel.setLayout(null);

                lbl_cod = new JLabel(Texts.txt_lbel_cod_asign);
                lbl_cod.setFont(new Font("Arial", Font.PLAIN, 22));
                txtf_cod = new JTextField(20);
                lbl_nombre = new JLabel(Texts.txt_lbel_nom_asign);
                lbl_nombre.setFont(new Font("Arial", Font.PLAIN, 22));
                txtf_nombre = new JTextField(20);
                lbl_tipo = new JLabel(Texts.txt_lbel_tip_cursos);
                lbl_tipo.setFont(new Font("Arial", Font.PLAIN, 22));
                lbl_num_asign = new JLabel(Texts.txt_lbel_num_asign);
                lbl_num_asign.setFont(new Font("Arial",Font.PLAIN, 22));
                txtf_num_asign = new JTextField(20);
                btn_aceptar = new CustomButton(Texts.txt_btn_aceptar);
                btn_cancelar = new CustomButton(Texts.txt_btn_cancelar);
                // Para agrupar los botones de selección, si tienes más de uno


// Define las dimensiones y posiciones de los componentes manualmente.
                lbl_cod.setBounds(10, 20, lbl_cod.getPreferredSize().width, lbl_cod.getPreferredSize().height);
                txtf_cod.setBounds(340, 20, 350, 35);

                lbl_nombre.setBounds(10, 60, lbl_nombre.getPreferredSize().width, lbl_nombre.getPreferredSize().height);
                txtf_nombre.setBounds(340, 60, 350, 35);
                lbl_num_asign.setBounds(10, 100, lbl_cod.getPreferredSize().width, lbl_cod.getPreferredSize().height);
                txtf_num_asign.setBounds(340, 100, 350, 35);
                lbl_tipo.setBounds(10, 140, lbl_nombre.getPreferredSize().width, lbl_nombre.getPreferredSize().height);
                add_options_box(opciones, panel,340, 140, 355, txtf_nombre.getPreferredSize().height);
                //buttons
                btn_aceptar.setBounds(220, 450, 120, 60);
                btn_cancelar.setBounds(350, 450, 120, 60);
// Añade los componentes al panel.
                panel.add(lbl_cod);
                panel.add(txtf_cod);
                panel.add(lbl_nombre);
                panel.add(txtf_nombre);
                panel.add(lbl_tipo);
                panel.add(lbl_num_asign);
                panel.add(txtf_num_asign);

                panel.add(btn_aceptar);
                panel.add(btn_cancelar);
                panel.revalidate();
                panel.repaint();
            }
        });
    }

    public void fun_alta_asignaturas(JPanel panel) {
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                JLabel lbl_cod, lbl_nombre;
                JTextField txtf_cod, txtf_nombre;

                panel.setLayout(null);

                lbl_cod = new JLabel(Texts.txt_lbel_cod_cursos);
                txtf_cod = new JTextField(20);
                lbl_nombre = new JLabel(Texts.txt_lbel_nom_cursos);
                txtf_nombre = new JTextField(20);

// Define las dimensiones y posiciones de los componentes manualmente.
                lbl_cod.setBounds(10, 20, lbl_cod.getPreferredSize().width, lbl_cod.getPreferredSize().height);
                txtf_cod.setBounds(130, 20, 200, txtf_cod.getPreferredSize().height);
                lbl_nombre.setBounds(10, 60, lbl_nombre.getPreferredSize().width, lbl_nombre.getPreferredSize().height);
                txtf_nombre.setBounds(130, 60, 200, txtf_nombre.getPreferredSize().height);

// Añade los componentes al panel.
                panel.add(lbl_cod);
                panel.add(txtf_cod);
                panel.add(lbl_nombre);
                panel.add(txtf_nombre);

                panel.revalidate();
                panel.repaint();
            }
        });
    }

    public void add_options_box(String[] opciones, JPanel panel, int x, int y, int width, int height){
        JComboBox<String> combo_opciones = new JComboBox<>(opciones);
        combo_opciones.setBounds(x,y,width,height);
        panel.add(combo_opciones);
    }
}
