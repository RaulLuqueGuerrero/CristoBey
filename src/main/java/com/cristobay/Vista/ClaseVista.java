package com.cristobay.Vista;

import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import com.cristobay.Modelo.*;
import com.cristobay.Controlador.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
public class ClaseVista extends JFrame {
    ArrayList<String> arrayV = new ArrayList<>();
    public ClaseVista(){    
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
        setTitle("Panel");
        
        
        JTabbedPane pestañas=new JTabbedPane();
        
        JPanel Anadir_Subasta=new JPanel();
        JLabel lbName=new JLabel("Nombre del producto: ");
        JTextField TFname = new JTextField(10);
        JLabel lbPrecioInicial=new JLabel("Nombre del producto: ");
        JTextField TFPrecioInicial = new JTextField(10);
        JLabel lbDescripcion=new JLabel("Descripción: ");
        JTextArea TADescripcion = new JTextArea();
        JButton btnVender = new JButton ("Vender");
        Anadir_Subasta.add(lbName);
        Anadir_Subasta.add(TFname);
        
        Anadir_Subasta.add(lbPrecioInicial);
        Anadir_Subasta.add(TFPrecioInicial);
        
        Anadir_Subasta.add(lbDescripcion);
        Anadir_Subasta.add(TADescripcion);
        
        Anadir_Subasta.add(btnVender);
        
        btnVender.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              arrayV.add(TFname.getText());
              arrayV.add(TFPrecioInicial.getText());
              arrayV.add(TADescripcion.getText());
                
            }
        });
        pestañas.addTab("Añadir Subasta", Anadir_Subasta);
        
        JPanel Ver_Subastas=new JPanel();
        DefaultTableModel ModeloTabla;
        ModeloTabla = (new DefaultTableModel (null, new String[]{
            "Nombre usuario","Nombre artículo","Puja inicial","Puja actual","Fecha y Hora inicio subasta"
        }));
        
        JTable tablaVista = new JTable(ModeloTabla);
        
        JScrollPane panelScroll = new JScrollPane(tablaVista);
        
        
        this.setTitle("Subastas");       
        this.pack();
        this.setVisible(true);
        Ver_Subastas.add(panelScroll);
        pestañas.addTab("Ver Subastas", Ver_Subastas);
        
        JPanel Modificar_Tus_Subastas=new JPanel();
        pestañas.addTab("Modificar tus Subastas", Modificar_Tus_Subastas);
        
        JPanel Eliminar_Tus_Subastas=new JPanel();
        pestañas.addTab("Eliminar tus Subastas", Eliminar_Tus_Subastas);
        
        getContentPane().add(pestañas);
        
    }

    public ArrayList<String> getArrayV() {
        return arrayV;
    }
}
