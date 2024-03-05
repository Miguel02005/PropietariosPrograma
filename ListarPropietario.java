import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.*;
import java.util.ArrayList;

public class ListarPropietario extends JFrame {
    private JTable tabla;
    private ArrayList<propietario> propietarios;

    public ListarPropietario(ArrayList<propietario> propietarios) {
        
        this.propietarios = propietarios;

        setTitle("Propietarios");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        initComponents();

        setVisible(true);
    }

    private void initComponents() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.WHITE);
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));

        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JTextField buscarField = new JTextField(20);
        
        buscarField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        
        buscarField.setBackground(new Color(41,128,185));
        buscarField.setForeground(Color.WHITE);
        buscarField.setCaretColor(Color.BLACK); 
        buscarField.setFont(new Font("Arial", Font.PLAIN, 14));
        buscarField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarPropietario(buscarField.getText());
            }
        });
        searchPanel.add(new JLabel("Buscar por nombre:"));
        searchPanel.add(buscarField);
        panel.add(searchPanel, BorderLayout.NORTH);
        String[] columnas = {"Nombre", "Apellido", "Edad", "Documento", "ID"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        
        for (propietario propietario : propietarios) {
            Object[] fila = {
                    propietario.getNombre(),
                    propietario.getApellido(),
                    propietario.getEdad(),
                    propietario.getDocumento(),
                    propietario.getId_propietario()
            };
            modelo.addRow(fila);
        }

        tabla = new JTable(modelo);
        tabla.setBackground(new Color(228,233,247));
        JScrollPane scrollPane = new JScrollPane(tabla);
        panel.add(scrollPane, BorderLayout.CENTER);
        scrollPane.getViewport().setBackground(new Color(228,233,247));
        tabla.setSelectionBackground(new Color(173, 216, 230));
        JTableHeader header = tabla.getTableHeader();
        header.setBackground(new Color(41,128,185)); 
        header.setForeground(Color.WHITE);
        getContentPane().add(panel);
    }
    private void buscarPropietario(String nombre) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);

        for (propietario propietario : propietarios) {
            if (propietario.getNombre().equalsIgnoreCase(nombre)) {
                Object[] fila = {
                        propietario.getNombre(),
                        propietario.getApellido(),
                        propietario.getEdad(),
                        propietario.getDocumento(),
                        propietario.getId_propietario()
                };
                modelo.addRow(fila);
            }
        }
    }
}
