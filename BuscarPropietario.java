import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class BuscarPropietario extends JFrame implements ActionListener {
    private JTextField nombreTextField;
    private JButton buscarButton;
    private JTextArea resultadoTextArea;

    private ArrayList<propietario> listaPropietarios;

    public BuscarPropietario() {
        setTitle("Buscar Propietario");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel nombreLabel = new JLabel("Nombre del propietario:");
        nombreLabel.setBounds(20, 20, 150, 25);
        panel.add(nombreLabel);

        nombreTextField = new JTextField();
        nombreTextField.setBounds(180, 20, 150, 25);
        panel.add(nombreTextField);

        buscarButton = new JButton("Buscar");
        buscarButton.setBounds(100, 60, 200, 30);
        buscarButton.addActionListener(this);
        panel.add(buscarButton);

        resultadoTextArea = new JTextArea();
        resultadoTextArea.setBounds(20, 100, 360, 150);
        resultadoTextArea.setEditable(false);
        panel.add(resultadoTextArea);

        add(panel);
        setVisible(true);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
	}
}