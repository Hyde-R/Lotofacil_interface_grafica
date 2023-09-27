import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Lotofacil {

    private JFrame frame;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel lblResultado1;
    private JLabel lblResultado2;
    private JLabel lblResultado3;
    private int numeroSorteado;
    private JTextField txtDigiteUmNumero;
    private JTextField txtDigiteUmaLetra;
    private JTextField txtDigiteUmNumero1;
    private String randomLetter = "L";

    public Lotofacil() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Sistema de Apostas");
        frame.setBounds(100, 100, 450, 508);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        textField1 = new JTextField();
        textField1.setBounds(165, 62, 86, 20);
        frame.getContentPane().add(textField1);
        textField1.setColumns(10);

        JButton btnApostar1 = new JButton("Apostar");
        btnApostar1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aposta1();
            }
        });
        
        textField2 = new JTextField();
        textField2.setBounds(165, 195, 86, 20);
        frame.getContentPane().add(textField2);
        textField2.setColumns(10);
        
        JButton btnApostar2 = new JButton("Apostar");
        btnApostar2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aposta2();
            }
        });
        
        textField3 = new JTextField();
        textField3.setBounds(165, 340, 86, 20);
        frame.getContentPane().add(textField3);
        textField3.setColumns(10);
        
        JButton btnApostar3 = new JButton("Apostar");
        btnApostar3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aposta3();
            }
        });
        
        
        btnApostar1.setBounds(165, 93, 89, 23);
        frame.getContentPane().add(btnApostar1);
        
        btnApostar2.setBounds(165, 220, 89, 23);
        frame.getContentPane().add(btnApostar2);
        
        btnApostar3.setBounds(165, 370, 89, 23);
        frame.getContentPane().add(btnApostar3);

        lblResultado1 = new JLabel("");
        lblResultado1.setBounds(165, 135, 400, 20);
        frame.getContentPane().add(lblResultado1);
        
        lblResultado2 = new JLabel("");
        lblResultado2.setBounds(165, 260, 400, 20);
        frame.getContentPane().add(lblResultado2);
        
        lblResultado3 = new JLabel("");
        lblResultado3.setBounds(165, 400, 400, 20);
        frame.getContentPane().add(lblResultado3);
        
        txtDigiteUmNumero = new JTextField();
        txtDigiteUmNumero.setText("Digite um numero entre 0 e 100");
        txtDigiteUmNumero.setEditable(false);
        txtDigiteUmNumero.setBounds(115, 31, 200, 20);
        frame.getContentPane().add(txtDigiteUmNumero);
        txtDigiteUmNumero.setColumns(10);
        
        txtDigiteUmaLetra = new JTextField();
        txtDigiteUmaLetra.setText("Digite uma letra entre A e Z");
        txtDigiteUmaLetra.setEditable(false);
        txtDigiteUmaLetra.setBounds(115, 160, 200, 20);
        frame.getContentPane().add(txtDigiteUmaLetra);
        txtDigiteUmaLetra.setColumns(10);

        txtDigiteUmNumero1 = new JTextField();
        txtDigiteUmNumero1.setText("Digite um numero entre 0 e 100");
        txtDigiteUmNumero1.setEditable(false);
        txtDigiteUmNumero1.setBounds(115, 310, 200, 20);
        frame.getContentPane().add(txtDigiteUmNumero1);
        txtDigiteUmNumero1.setColumns(10);
        
        numeroSorteado = new Random().nextInt(101);
    }

    private void aposta1() {
        try {
            int aposta1 = Integer.parseInt(textField1.getText());

            if (aposta1 < 0 || aposta1 > 100) {
                lblResultado1.setText("A aposta deve estar entre 0 e 100.");
                return;
            }

            else if (aposta1 == numeroSorteado) {
                lblResultado1.setText("Parabéns! Você acertou e ganhou R$1.000,00");
            } 
            
            else {
                lblResultado1.setText("Que pena! O número sorteado foi: " + numeroSorteado);
            }

        } catch (NumberFormatException ex) {
            lblResultado1.setText("Digite um número válido.");
        }
    }
    
    private void aposta2() {
        try {
        	String aposta2 = textField2.getText();

            if (aposta2 == "L") {
                lblResultado2.setText("Parabéns! Você acertou e ganhou R$500,00");
                return;
            }
            
            else {
                lblResultado2.setText("Que pena! A letra sorteada foi: " + randomLetter);
            }

        } catch (NumberFormatException ex) {
            lblResultado2.setText("Digite uma letra válida.");
        }
    }
    
    private void aposta3() {
        try {
        	int aposta3 = Integer.parseInt(textField3.getText());

            if (aposta3 %2 == 0) {
                lblResultado3.setText("Parabéns! Você acertou e ganhou R$100,00");
                return;
            }
            
            else {
                lblResultado3.setText("Que pena! O número sorteado é ímpar.");
            }

        } catch (NumberFormatException ex) {
            lblResultado3.setText("Digite um número válido.");
        }
    }


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Lotofacil window = new Lotofacil();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}