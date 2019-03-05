import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arnol
 */
public class Procesador_Texto_I {
    public static void main(String[] args){
        MenuProcesador mimarco=new MenuProcesador();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MenuProcesador extends JFrame{
    public MenuProcesador(){
        setBounds(500,300,550,400);
        LaminaProcesador milamina=new LaminaProcesador();
        add(milamina);
        setVisible(true);
    }
}

class LaminaProcesador extends JPanel{
    public LaminaProcesador(){
        setLayout(new BorderLayout());
        JPanel laminamenu=new JPanel();
        
        JMenuBar mibarra=new JMenuBar();
        //---------------------------------------------------------------
        fuente=new JMenu("Fuente");
        estilo=new JMenu("Estilo");
        tamagno=new JMenu("Tamaño");
        
        mibarra.add(fuente);
        mibarra.add(estilo);
        mibarra.add(tamagno);
        //---------------------------------------------------------------        
        configura_menu("Arial","fuente","Arial",9,10);
        configura_menu("New Times Roman","fuente","New Times Roman",9,10);
        configura_menu("Verdana","fuente","Verdana",9,10);
        
        
        //configura_menu("Negrita","estilo","",Font.BOLD,1);
        //configura_menu("Cursiva","estilo","",Font.ITALIC,1);
        JCheckBoxMenuItem negrita=new JCheckBoxMenuItem("Negrita",new ImageIcon("build/classes/graficos/negrita.png"));
        JCheckBoxMenuItem cursiva=new JCheckBoxMenuItem("Cursiva",new ImageIcon("build/classes/graficos/cursiva.png"));
        negrita.addActionListener(new StyledEditorKit.BoldAction());
        cursiva.addActionListener(new StyledEditorKit.ItalicAction());
        
        negrita.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
        cursiva.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,InputEvent.CTRL_DOWN_MASK));
        estilo.add(negrita);
        estilo.add(cursiva);
        
        
        
        /*configura_menu("12","tamagno","",9,12);
        configura_menu("16","tamagno","",9,16);
        configura_menu("20","tamagno","",9,20);
        configura_menu("24","tamagno","",9,24);*/
        
        ButtonGroup tamagno_letra=new ButtonGroup();
        JRadioButtonMenuItem doce= new JRadioButtonMenuItem("12");
        JRadioButtonMenuItem dociseis= new JRadioButtonMenuItem("16");
        JRadioButtonMenuItem veinte= new JRadioButtonMenuItem("20");
        JRadioButtonMenuItem veintecuatro= new JRadioButtonMenuItem("24");
        
        tamagno_letra.add(doce);
        tamagno_letra.add(dociseis);
        tamagno_letra.add(veinte);
        tamagno_letra.add(veintecuatro);
        
        doce.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 12));
        dociseis.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 16));
        veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 20));
        veintecuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 24));
        
        tamagno.add(doce);
        tamagno.add(dociseis);
        tamagno.add(veinte);
        tamagno.add(veintecuatro);
        //---------------------------------------------------------------        
        
        
        laminamenu.add(mibarra);
        add(laminamenu,BorderLayout.NORTH);
        
        //---------------------------------------------------------------  
        miarea=new JTextPane();
        add(miarea,BorderLayout.CENTER);
        
        JPopupMenu emergente=new JPopupMenu();
        JMenuItem negritaE=new JMenuItem("Negrita");
        JMenuItem cursivaE=new JMenuItem("Cursiva");


        miarea.setComponentPopupMenu(emergente);       
        negritaE.addActionListener(new StyledEditorKit.BoldAction());
        cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
        emergente.add(negritaE);
        emergente.add(cursivaE);
        
        //---------------------------------------------------------------------
        /*JToolBar barra=new JToolBar();
        JButton negritaBarra=new JButton (new ImageIcon("build/classes/graficos/negrita.png"));
        JButton cursivaBarra=new JButton (new ImageIcon("build/classes/graficos//cursiva.png"));
        JButton subraBarra=new JButton (new ImageIcon("build/classes/graficos//icons8-subrayar-16.png"));
        JButton azulBarra=new JButton (new ImageIcon("build/classes/graficos/icons8-playAz-16.png"));
        JButton amarilloBarra=new JButton (new ImageIcon("build/classes/graficos/icons8-playAm-16.png"));
        JButton rojoBarra=new JButton (new ImageIcon("build/classes/graficos/icons8-playRo-16.png"));
        JButton a_izquierda=new JButton (new ImageIcon("build/classes/graficos/icons8-alinear-a-la-izquierda-16.png"));
        JButton a_centrado=new JButton (new ImageIcon("build/classes/graficos/icons8-alinear-al-centro-16.png"));
        JButton a_derecha=new JButton (new ImageIcon("build/classes/graficos/icons8-alinear-a-la-derecha-16.png"));
        JButton a_justificado=new JButton (new ImageIcon("build/classes/graficos/icons8-justificar-16.png"));
        negritaBarra.addActionListener(new StyledEditorKit.BoldAction());
        cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
        subraBarra.addActionListener(new StyledEditorKit.UnderlineAction());
        azulBarra.addActionListener(new StyledEditorKit.ForegroundAction("Pone_Azul", Color.BLUE));
        amarilloBarra.addActionListener(new StyledEditorKit.ForegroundAction("Pone_Amarillo", Color.YELLOW));
        rojoBarra.addActionListener(new StyledEditorKit.ForegroundAction("Pone_Rojo", Color.RED));
        a_izquierda.addActionListener(new StyledEditorKit.AlignmentAction("izquierda", 0));
        a_centrado.addActionListener(new StyledEditorKit.AlignmentAction("centrada", 1));
        a_derecha.addActionListener(new StyledEditorKit.AlignmentAction("derecha", 2));
        a_justificado.addActionListener(new StyledEditorKit.AlignmentAction("justificado", 3));
        barra.add(negritaBarra);
        barra.add(cursivaBarra);
        barra.add(subraBarra);
        barra.add(azulBarra);
        barra.add(amarilloBarra);
        barra.add(rojoBarra);
        barra.add(a_izquierda);
        barra.add(a_centrado);
        barra.add(a_derecha);
        barra.add(a_justificado);*/
        barra=new JToolBar();
        configura_barra("build/classes/graficos/negrita.png").addActionListener(new StyledEditorKit.BoldAction());
        configura_barra("build/classes/graficos//cursiva.png").addActionListener(new StyledEditorKit.ItalicAction());
        configura_barra("build/classes/graficos//icons8-subrayar-16.png").addActionListener(new StyledEditorKit.UnderlineAction());
        barra.addSeparator();
        configura_barra("build/classes/graficos/icons8-playAz-16.png").addActionListener(new StyledEditorKit.ForegroundAction("Pone_Azul", Color.BLUE));
        configura_barra("build/classes/graficos/icons8-playAm-16.png").addActionListener(new StyledEditorKit.ForegroundAction("Pone_Amarillo", Color.YELLOW));
        configura_barra("build/classes/graficos/icons8-playRo-16.png").addActionListener(new StyledEditorKit.ForegroundAction("Pone_Rojo", Color.RED));
        barra.addSeparator();
        configura_barra("build/classes/graficos/icons8-alinear-a-la-izquierda-16.png").addActionListener(new StyledEditorKit.AlignmentAction("izquierda", 0));
        configura_barra("build/classes/graficos/icons8-alinear-al-centro-16.png").addActionListener(new StyledEditorKit.AlignmentAction("centrada", 1));
        configura_barra("build/classes/graficos/icons8-alinear-a-la-derecha-16.png").addActionListener(new StyledEditorKit.AlignmentAction("centrada", 2));
        configura_barra("build/classes/graficos/icons8-justificar-16.png").addActionListener(new StyledEditorKit.AlignmentAction("centrada", 3));
        barra.setOrientation(1); // Disposición de forma vertical
        add(barra,BorderLayout.WEST);
        //---------------------------------------------------------------------
        
    }
    public JButton configura_barra(String ruta){
        JButton boton=new JButton(new ImageIcon(ruta));
        barra.add(boton);
        return boton;
    }
    public void configura_menu (String rotulo,String menu,String tipo_letra,int estilos,int tama){
        JMenuItem elem_menu=new JMenuItem(rotulo);
        if(menu=="fuente"){
            fuente.add(elem_menu);
        }else if(menu=="estilo"){
            estilo.add(elem_menu);
        }else if(menu=="tamagno"){
            tamagno.add(elem_menu);
        }
        elem_menu.addActionListener(new Gestiona_Eventos(rotulo,tipo_letra,estilos,tama));
    }
    private class Gestiona_Eventos implements ActionListener{
        String tipo_texto,menu;
        int estilo_letra,tamagno_letra;
        
        public Gestiona_Eventos(String elemento,String texto2,int estilo2,int tam_letra){
            tipo_texto=texto2;
            estilo_letra=estilo2;
            tamagno_letra=tam_letra;
            menu=elemento;
                    
        }
        @Override
        public void actionPerformed(ActionEvent ae) {
            letras=miarea.getFont();
            if(menu=="Arial"||menu=="New Times Roman" ||menu=="Verdana"){
                estilo_letra=letras.getStyle();
                tamagno_letra=letras.getSize();

            }else if(menu=="Cursiva"||menu=="Negrita"){
                if(letras.getStyle()==1 ||letras.getStyle()==2){
                    estilo_letra=3;
                }
                tipo_texto=letras.getFontName();
                tamagno_letra=letras.getSize();
            } else if(menu=="12" ||menu=="16"||menu=="20"||menu=="24"){
                estilo_letra=letras.getStyle();
                tipo_texto=letras.getFontName();
            }
            
            miarea.setFont(new Font(tipo_texto,estilo_letra,tamagno_letra));
            System.out.println("Tipo: "+tipo_texto+" Estilo Letra: "+estilo_letra+" Tamaño: "+tamagno_letra);
        }
    
    }
    private JTextPane miarea;
    private JMenu fuente, estilo,tamagno;
    private Font letras;
    JButton negritaBarra,cursivaBarra,subraBarra,azulBarra,amarilloBarra,a_izquierda,a_centrado,a_derecha,a_justificado;
    JToolBar barra;
}   
