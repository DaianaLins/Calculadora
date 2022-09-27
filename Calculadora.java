
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Daiana Lins 
 */
public class Calculadora extends JFrame implements ActionListener {

    /**
     *
     * criação de variáves, botões, painel e do cursor
     */
    private JButton btnUm = new JButton("1");
    private JButton btnDois = new JButton("2");
    private JButton btnTres = new JButton("3");
    private JButton btnQuatro = new JButton("4");
    private JButton btnCinco = new JButton("5");
    private JButton btnSeis = new JButton("6");
    private JButton btnSete = new JButton("7");
    private JButton btnOito = new JButton("8");
    private JButton btnNove = new JButton("9");
    private JButton btnZero = new JButton("0");
    private JButton btnMult = new JButton("*");
    private JButton btnDiv = new JButton("/");
    private JButton btnSoma = new JButton("+");
    private JButton btnSub = new JButton("-");
    private JButton btnApagar = new JButton("C");
    private JButton btnIgual = new JButton("=");
    private JTextField cursor = new JTextField("");
    private JPanel painel = new JPanel();
    /**
     *
     * Variável inteira para a entrada de números
     */
    private int numero = 0;
    /**
     *
     * Variável para armazenar e acumular os números
     */
    private int memoria = 0;
    /**
     *
     * Varíavel de caracter para controle de operação
     */
    char oper;

    public Calculadora() {
        /**
         *
         * Definição do nome do painel
         */
        super("Calculadora");

        /**
         *
         * Tipo de layout e definição de linhas e colunas que os botões serão
         * alocados
         */
        setLayout(new BorderLayout());
        painel.setLayout(new GridLayout(4, 4));
        /**
         *
         * Adicionando o cursor ao norte do´painel
         */
        add(cursor, BorderLayout.NORTH);
        /**
         *
         * Adicionando botões ao painel e as definições de seus respectivos
         * lugares
         */
        painel.add(btnUm);
        btnUm.addActionListener(this);
        painel.add(btnDois);
        btnDois.addActionListener(this);
        painel.add(btnTres);
        btnTres.addActionListener(this);
        painel.add(btnSoma);
        btnSoma.addActionListener(this);
        painel.add(btnQuatro);
        btnQuatro.addActionListener(this);
        painel.add(btnCinco);
        btnCinco.addActionListener(this);
        painel.add(btnSeis);
        btnSeis.addActionListener(this);
        painel.add(btnSub);
        btnSub.addActionListener(this);
        painel.add(btnSete);
        btnSete.addActionListener(this);
        painel.add(btnOito);
        btnOito.addActionListener(this);
        painel.add(btnNove);
        btnNove.addActionListener(this);
        painel.add(btnDiv);
        btnDiv.addActionListener(this);
        painel.add(btnApagar);
        btnApagar.addActionListener(this);
        painel.add(btnZero);
        btnZero.addActionListener(this);
        painel.add(btnIgual);
        btnIgual.addActionListener(this);
        painel.add(btnMult);
        btnMult.addActionListener(this);
        /**
         *
         * Adicionando o painel
         */
        add(painel);

    }

    @Override

    /**
     *
     * Adicionando ações aos botões
     */
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        /**
         *
         * e.getSource é uma função que retira a informação do botão. Se o
         * conteúdo do botão for igual ao do btn e seu respectivo numero, neste
         * caso o btnZero, o numero será multiplicado por 10 para poder
         * adicionar mais de um numero na casa decimal. O numero será acumulado
         * com o valor do do botão
         */
        if (e.getSource() == btnZero) {

            numero *= 10;
            numero += 0;
            /**
             *
             * Função que retorna no campo o numero que foi digitado
             */
            cursor.setText(cursor.getText() + "0");

        } else if (e.getSource() == btnUm) {
            numero *= 10;
            numero += 1;
            cursor.setText(cursor.getText() + "1");
        } else if (e.getSource() == btnDois) {
            numero *= 10;
            numero += 2;
            cursor.setText(cursor.getText() + "2");
        } else if (e.getSource() == btnTres) {
            numero *= 10;
            numero += 3;
            cursor.setText(cursor.getText() + "3");
        } else if (e.getSource() == btnQuatro) {
            numero *= 10;
            numero += 4;
            cursor.setText(cursor.getText() + "4");
        } else if (e.getSource() == btnCinco) {
            numero *= 10;
            numero += 5;
            cursor.setText(cursor.getText() + "5");
        } else if (e.getSource() == btnSeis) {
            numero *= 10;
            numero += 6;
            cursor.setText(cursor.getText() + "6");
        } else if (e.getSource() == btnSete) {
            numero *= 10;
            numero += 7;
            cursor.setText(cursor.getText() + "7");
        } else if (e.getSource() == btnOito) {
            numero *= 10;
            numero += 8;
            cursor.setText(cursor.getText() + "8");
        } else if (e.getSource() == btnNove) {
            numero *= 10;
            numero += 9;
            cursor.setText(cursor.getText() + "9");
        } /**
         *
         * Na parte dos botões de operações, eu crio uma variável caracter que
         * recebe o respectivo caracter que representa a operação. A memoria
         * armazenará o numero e será retornado a memoria e a operação no campo.
         * O numero recebe zero para armazenar novos numeros.
         */
        else if (e.getSource() == btnSoma) {
            oper = '+';
            memoria += numero;
            cursor.setText(memoria + " + ");
            numero = 0;
        } else if (e.getSource() == btnSub) {
            oper = '-';
            memoria += numero;
            cursor.setText(memoria + " - ");
            numero = 0;
        } else if (e.getSource() == btnDiv) {
            oper = '/';
            memoria += numero;
            cursor.setText(memoria + " / ");
            numero = 0;
        } else if (e.getSource() == btnMult) {
            oper = '*';
            memoria += numero;
            cursor.setText(memoria + " * ");
            numero = 0;
            /**
             *
             * Aqui será apagado o que estiver escrito no campo. A memoria
             * recebe zero para não acumular numeros anteriores e receceber
             * novos numeros a serem armazenado na nova operação
             */
        } else if (e.getSource() == btnApagar) {

            cursor.setText(" ");
            memoria = 0;

            /**
             *
             * Aqui uso o switch case para definir a operação a ser seguida,
             * realizando suas sentenças. O caracter oper é crucial para
             * determinar o caso a ser seguido.
             */
        } else if (e.getSource() == btnIgual) {
            switch (oper) {
                case '+': {
                    memoria += numero;
                    break;
                }
                case '-': {
                    memoria -= numero;
                    break;
                }
                case '*': {
                    memoria *= numero;
                    break;
                }
                case '/': {
                    memoria /= numero;
                    break;
                }
            }
            /**
             *
             * O numero recebe zero caso queira realizar uma nova operação com a
             * mesma memoria e para nao acumular na operação seguinte
             */
            numero = 0;
            /**
             *
             * Aqui retorna no campo o resultado da operação realizada
             */
            cursor.setText("" + memoria);
        }
    }

}
