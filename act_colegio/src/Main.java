import javax.swing.*;
import java.awt.*;

/*
VERSION = 0.1
    Initial Structure with buttons + function exit
*/

public class Main extends JFrame {
    private final int HEIGHT = 600;
    private final int WIDTH = 1100;
    private final int WIDTH_DATOS_BUTTONS = 300;
    private final int NUM_BUTTONS = 8;
    private final Color colr_win_buttons = Color.LIGHT_GRAY;
    private final Color colr_win_data = Color.LIGHT_GRAY;
    private JFrame ventana;
    private Container panelContenidos;
    //Paneles
    private JPanel panelVisual;
    private JPanel panelBotones;

    //JSplitpanel
    private JSplitPane sppArriba;
    private JSplitPane sppAbajo;
    private JSplitPane sppLateral;
    //MenuItem
    //botones
    private CustomButton btn_alta_cursos;
    private CustomButton btn_Matr_estudiante;
    private CustomButton btn_baja_curso;
    private CustomButton btn_baja_asignatura;
    private CustomButton btn_info_curso;
    private CustomButton btn_info_asignatura;
    private CustomButton btn_info_estudiante;
    private CustomButton btn_salir;
    public static void main(String[] args) {
        new Main().main_window();
    }
    void main_window(){
        ventana = new JFrame(Texts.txt_cabecera);
        panelContenidos = ventana.getContentPane();

        load_structure_main();

        ventana.setSize(WIDTH, HEIGHT);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Al ejecutar la siguiente linea pone el programa en medio de la pantalla
        //Muy importante ejecutar despues de darle el tamaño, sino no funciona
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setVisible(true);
    }
    void load_structure_main(){
        panelVisual = new JPanel();
        panelVisual.setBackground(colr_win_data);
        panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(NUM_BUTTONS,1));
        panelBotones.setBackground(colr_win_buttons);

        add_all_buttons();

        sppLateral = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,panelBotones,panelVisual);
        sppLateral.setDividerLocation(WIDTH_DATOS_BUTTONS);
        sppArriba = new JSplitPane(JSplitPane.VERTICAL_SPLIT,null,sppLateral);
        sppAbajo = new JSplitPane(JSplitPane.VERTICAL_SPLIT,sppArriba,null);
        panelContenidos.add(sppAbajo);
    }
    void add_all_buttons(){
        btn_alta_cursos = new CustomButton(Texts.txt_btn_alta_cursos);
        btn_Matr_estudiante = new CustomButton(Texts.txt_btn_Matr_estudiante);
        btn_baja_curso = new CustomButton(Texts.txt_btn_baja_curso);
        btn_baja_asignatura = new CustomButton(Texts.txt_btn_baja_asignatura);
        btn_info_curso = new CustomButton(Texts.txt_btn_info_curso);
        btn_info_asignatura = new CustomButton(Texts.txt_btn_info_asignatura);
        btn_info_estudiante = new CustomButton(Texts.txt_btn_info_estudiante);
        btn_salir = new CustomButton(Texts.txt_btn_salir);
        //Actions buttons
        btn_alta_cursos.fun_alta_curso(panelVisual);
        btn_baja_asignatura.fun_alta_asignaturas(panelVisual);
        btn_salir.fun_close_app();
        //Add button into panelBotones
        panelBotones.add(btn_alta_cursos);
        panelBotones.add(btn_Matr_estudiante);
        panelBotones.add(btn_baja_curso);
        panelBotones.add(btn_baja_asignatura);
        panelBotones.add(btn_info_curso);
        panelBotones.add(btn_info_asignatura);
        panelBotones.add(btn_info_estudiante);
        panelBotones.add(btn_salir);
    }
}