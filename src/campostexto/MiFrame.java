package campostexto;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


public class MiFrame extends JFrame {
    
   int login = 0; 
    private JTextField field_usuario;
    private JPasswordField field_contraseña;
    private JButton button_login;
    private String usuarios[][]={
            //email, contraseña
            {"david@uniceba.edu.mx","25"},
            {"pamela@uniceba.edu.mx","19"},
            {"regina@uniceba.edu.mx","18"},
            {"gabriela@uniceba.edu.mx","20"}
    };
    //Constructor
    
    public MiFrame(){
        super ("Prueba de campos de texto");
        setLayout(new FlowLayout());
        
        //crea un campo de texto con 20 columnas
        field_usuario = new JTextField(20);
        add (field_usuario);
        
        //Crea un campo con el texto oculto
        field_contraseña = new JPasswordField(20);
        add (field_contraseña);
        
        //Crea un boton con texto
        button_login = new JButton ("Login");
        add (button_login);
      
        //Dar un mensaje en la consola al oprimir el boton de login
        button_login.addActionListener((ActionEvent e) -> {
            System.out.println("Usuario:" +
            field_usuario.getText());
            System.out.println("Contraseña:" +
            field_contraseña.getText());
            
            //llamada al metodo validacion
            validacion(field_usuario.getText(),
                    field_contraseña.getText());
            
        });
    }
    
    private void validacion (String email,String contraseña){
       
    //Recorremos todo el arreglo   
        for (int contador = 0;
                contador < usuarios.length;
                contador++)   
       
         if (email.equals(usuarios [contador][0])&& contraseña.equals(usuarios[contador][1])){   
             login = 1;
         }
        
        if (login != 1){
            login = 2;
        }
        
         if (email.equals("") || contraseña.equals("")){
            login = 3;
        }
        
        
       if(login == 1){       
    JOptionPane.showMessageDialog(null, "Bienvenido");}
       
       if(login == 2){
    JOptionPane.showMessageDialog(null, "Error de Usuario");}
       
       if (login ==3){
    JOptionPane.showMessageDialog(null, "Falta ingresar datos de sesion");}
       
       } 
}