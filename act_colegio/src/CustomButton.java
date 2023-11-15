import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomButton extends JButton {
    private final int height_txtf = 35;
    private final int width_txtf = 350;
    private final int height_lbl = 35;
    private final int width_lbl = 400;
    private final int tam_text = 20;
    public CustomButton(String nombre){
        super("<html><font color='black'>" + nombre + "</font></html>");
        setOpaque(true);
        setBackground(Color.LIGHT_GRAY);
        setFont(new Font("Arial", Font.BOLD, 24));
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

    public void fun_btn_cancel(JPanel panel){
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                panel.revalidate();
                panel.repaint();
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

                lbl_cod = new JLabel(Texts.txt_lbel_cod_cursos);
                lbl_cod.setFont(new Font("Arial", Font.PLAIN, tam_text));
                txtf_cod = new JTextField(20);
                lbl_nombre = new JLabel(Texts.txt_lbel_nom_cursos);
                lbl_nombre.setFont(new Font("Arial", Font.PLAIN, tam_text));
                txtf_nombre = new JTextField(20);
                lbl_tipo = new JLabel(Texts.txt_lbel_tip_cursos);
                lbl_tipo.setFont(new Font("Arial", Font.PLAIN, tam_text));
                lbl_num_asign = new JLabel(Texts.txt_lbel_num_asign);
                lbl_num_asign.setFont(new Font("Arial",Font.PLAIN, tam_text));
                txtf_num_asign = new JTextField(20);
                btn_aceptar = new CustomButton(Texts.txt_btn_aceptar);
                btn_cancelar = new CustomButton(Texts.txt_btn_cancelar);
                // Para agrupar los botones de selección, si tienes más de uno


// Define las dimensiones y posiciones de los componentes manualmente.
                lbl_cod.setBounds(10, 20, width_lbl, height_lbl);
                txtf_cod.setBounds(300, 20, width_txtf, height_txtf);

                lbl_nombre.setBounds(10, 60, width_lbl, height_lbl);
                txtf_nombre.setBounds(300, 60, width_txtf, height_txtf);
                lbl_num_asign.setBounds(10, 100, width_lbl, height_lbl);
                txtf_num_asign.setBounds(300, 100, width_txtf, height_txtf);
                lbl_tipo.setBounds(10, 140, width_lbl, height_lbl);
                add_options_box(opciones, panel,300, 140, 355, height_txtf);
                //buttons
                btn_aceptar.setBounds(220, 450, 120, 60);
                btn_cancelar.setBounds(350, 450, 120, 60);
                //funciones buttons
                btn_cancelar.fun_btn_cancel(panel);
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
    public void fun_add_estudiante(JPanel panel){
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                JLabel lbl_cod, lbl_nombre, lbl_cod_asig;
                JTextField txtf_cod, txtf_nombre, txtf_cod_asig;
                CustomButton btn_aceptar;
                CustomButton btn_cancelar;

                panel.setLayout(null);

                lbl_cod = new JLabel(Texts.txt_lbel_cod_estud);
                lbl_cod.setFont(new Font("Arial", Font.PLAIN, tam_text));
                txtf_cod = new JTextField(20);
                lbl_nombre = new JLabel(Texts.txt_lbel_nom_estud);
                lbl_nombre.setFont(new Font("Arial", Font.PLAIN, tam_text));
                txtf_nombre = new JTextField(20);
                lbl_cod_asig = new JLabel(Texts.txt_lbel_cod_asign);
                lbl_cod_asig.setFont(new Font("Arial", Font.PLAIN, tam_text));
                txtf_cod_asig = new JTextField(20);
                btn_aceptar = new CustomButton(Texts.txt_btn_aceptar);
                btn_cancelar = new CustomButton(Texts.txt_btn_cancelar);
                // Para agrupar los botones de selección, si tienes más de uno


// Define las dimensiones y posiciones de los componentes manualmente.
                lbl_cod.setBounds(10, 20, width_lbl, height_lbl);
                txtf_cod.setBounds(300, 20, width_txtf, height_txtf);

                lbl_nombre.setBounds(10, 60, width_lbl, height_lbl);
                txtf_nombre.setBounds(300, 60, width_txtf, height_txtf);

                lbl_cod_asig.setBounds(10, 100, width_lbl, height_lbl);
                txtf_cod_asig.setBounds(300, 100, width_txtf, height_txtf);

                //buttons
                btn_aceptar.setBounds(220, 450, 120, 60);
                btn_cancelar.setBounds(350, 450, 120, 60);
                //funciones buttons
                btn_cancelar.fun_btn_cancel(panel);
// Añade los componentes al panel.
                panel.add(lbl_cod);
                panel.add(txtf_cod);
                panel.add(lbl_nombre);
                panel.add(txtf_nombre);
                panel.add(lbl_cod_asig);
                panel.add(txtf_cod_asig);

                panel.add(btn_aceptar);
                panel.add(btn_cancelar);
                panel.revalidate();
                panel.repaint();
            }
        });
    }
    public void fun_delete_curso(JPanel panel){
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                JLabel lbl_cod, lbl_nombre;
                JTextField txtf_cod;
                CustomButton btn_aceptar;
                CustomButton btn_cancelar;

                panel.setLayout(null);

                lbl_cod = new JLabel(Texts.txt_lbel_cod_cursos);
                lbl_cod.setFont(new Font("Arial", Font.PLAIN, tam_text+6));
                txtf_cod = new JTextField(20);
                btn_aceptar = new CustomButton(Texts.txt_btn_aceptar);
                btn_cancelar = new CustomButton(Texts.txt_btn_cancelar);
                // Para agrupar los botones de selección, si tienes más de uno


// Define las dimensiones y posiciones de los componentes manualmente.
                lbl_cod.setBounds(250, 170, width_lbl, height_lbl);
                txtf_cod.setBounds(170, 200, width_txtf, height_txtf);
                //buttons
                btn_aceptar.setBounds(220, 450, 120, 60);
                btn_cancelar.setBounds(350, 450, 120, 60);
                //funciones buttons
                btn_cancelar.fun_btn_cancel(panel);
// Añade los componentes al panel.
                panel.add(lbl_cod);
                panel.add(txtf_cod);

                panel.add(btn_aceptar);
                panel.add(btn_cancelar);
                panel.revalidate();
                panel.repaint();
            }
        });
    }
    public void fun_delete_asignature(JPanel panel){
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                JLabel lbl_cod, lbl_nombre;
                JTextField txtf_cod;
                CustomButton btn_aceptar;
                CustomButton btn_cancelar;

                panel.setLayout(null);

                lbl_cod = new JLabel(Texts.txt_lbel_cod_asign);
                lbl_cod.setFont(new Font("Arial", Font.PLAIN, tam_text+6));
                txtf_cod = new JTextField(20);
                btn_aceptar = new CustomButton(Texts.txt_btn_aceptar);
                btn_cancelar = new CustomButton(Texts.txt_btn_cancelar);
                // Para agrupar los botones de selección, si tienes más de uno


// Define las dimensiones y posiciones de los componentes manualmente.
                lbl_cod.setBounds(210, 170, width_lbl, height_lbl);
                txtf_cod.setBounds(170, 200, width_txtf, height_txtf);
                //buttons
                btn_aceptar.setBounds(220, 450, 120, 60);
                btn_cancelar.setBounds(350, 450, 120, 60);
                //funciones buttons
                btn_cancelar.fun_btn_cancel(panel);
// Añade los componentes al panel.
                panel.add(lbl_cod);
                panel.add(txtf_cod);

                panel.add(btn_aceptar);
                panel.add(btn_cancelar);
                panel.revalidate();
                panel.repaint();
            }
        });
    }

    public void fun_info_curso(JPanel panel){
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                JLabel lbl_cod, lbl_nombre;
                JTextField txtf_cod;
                CustomButton btn_aceptar;
                CustomButton btn_cancelar;

                panel.setLayout(null);

                lbl_cod = new JLabel(Texts.txt_lbel_cod_cursos);
                lbl_cod.setFont(new Font("Arial", Font.PLAIN, tam_text+6));
                txtf_cod = new JTextField(20);
                btn_aceptar = new CustomButton(Texts.txt_btn_aceptar);
                btn_cancelar = new CustomButton(Texts.txt_btn_cancelar);
                // Para agrupar los botones de selección, si tienes más de uno


// Define las dimensiones y posiciones de los componentes manualmente.
                lbl_cod.setBounds(250, 170, width_lbl, height_lbl);
                txtf_cod.setBounds(170, 200, width_txtf, height_txtf);
                //buttons
                btn_aceptar.setBounds(220, 450, 120, 60);
                btn_cancelar.setBounds(350, 450, 120, 60);
                //funciones buttons
                btn_cancelar.fun_btn_cancel(panel);
// Añade los componentes al panel.
                panel.add(lbl_cod);
                panel.add(txtf_cod);

                panel.add(btn_aceptar);
                panel.add(btn_cancelar);
                panel.revalidate();
                panel.repaint();
            }
        });
    }
    public void fun_info_asignatura(JPanel panel){
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                JLabel lbl_cod, lbl_nombre;
                JTextField txtf_cod;
                CustomButton btn_aceptar;
                CustomButton btn_cancelar;

                panel.setLayout(null);

                lbl_cod = new JLabel(Texts.txt_lbel_cod_asign);
                lbl_cod.setFont(new Font("Arial", Font.PLAIN, tam_text+6));
                txtf_cod = new JTextField(20);
                btn_aceptar = new CustomButton(Texts.txt_btn_aceptar);
                btn_cancelar = new CustomButton(Texts.txt_btn_cancelar);
                // Para agrupar los botones de selección, si tienes más de uno


// Define las dimensiones y posiciones de los componentes manualmente.
                lbl_cod.setBounds(210, 170, width_lbl, height_lbl);
                txtf_cod.setBounds(170, 200, width_txtf, height_txtf);
                //buttons
                btn_aceptar.setBounds(220, 450, 120, 60);
                btn_cancelar.setBounds(350, 450, 120, 60);
                //funciones buttons
                btn_cancelar.fun_btn_cancel(panel);
// Añade los componentes al panel.
                panel.add(lbl_cod);
                panel.add(txtf_cod);

                panel.add(btn_aceptar);
                panel.add(btn_cancelar);
                panel.revalidate();
                panel.repaint();
            }
        });
    }

    public void fun_info_estudiante(JPanel panel){
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                JLabel lbl_cod, lbl_nombre;
                JTextField txtf_cod;
                CustomButton btn_aceptar;
                CustomButton btn_cancelar;

                panel.setLayout(null);

                lbl_cod = new JLabel(Texts.txt_lbel_cod_estud);
                lbl_cod.setFont(new Font("Arial", Font.PLAIN, tam_text+6));
                txtf_cod = new JTextField(20);
                btn_aceptar = new CustomButton(Texts.txt_btn_aceptar);
                btn_cancelar = new CustomButton(Texts.txt_btn_cancelar);
                // Para agrupar los botones de selección, si tienes más de uno


// Define las dimensiones y posiciones de los componentes manualmente.
                lbl_cod.setBounds(250, 170, width_lbl, height_lbl);
                txtf_cod.setBounds(170, 200, width_txtf, height_txtf);
                //buttons
                btn_aceptar.setBounds(220, 450, 120, 60);
                btn_cancelar.setBounds(350, 450, 120, 60);
                //funciones buttons
                btn_cancelar.fun_btn_cancel(panel);
// Añade los componentes al panel.
                panel.add(lbl_cod);
                panel.add(txtf_cod);

                panel.add(btn_aceptar);
                panel.add(btn_cancelar);
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
