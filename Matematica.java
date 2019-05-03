import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int C, A, B, adicao, subtracao, multiplicacao;
        double divisao;

        C = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: 1 - adição 2 - subtração 3 - multiplicação 4 - divisão"));

        if (!(C == 1 || C == 2 || C == 3 || C == 4)) {
            JOptionPane.showMessageDialog(null, " Opçao escolhida inválida! Escolha a opção desejada: 1- adição 2- subtração 3- multiplicação 4- divisão");
            C = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção: "));

        } else {

            JOptionPane.showMessageDialog(null, "Informe dois valores inteiros: ");

            A = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
            B = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));

            switch (C) {
                case 1:
                    adicao = A + B;
                    JOptionPane.showMessageDialog(null, " Adição: " + adicao);
                    break;
                case 2:
                    subtracao = A - B;
                    JOptionPane.showMessageDialog(null, " Subtração: " + subtracao);
                    break;
                case 3:
                    multiplicacao = A * B;
                    JOptionPane.showMessageDialog(null, " Multiplicação: " + multiplicacao);
                    break;
                case 4:
                    divisao = A / B;
                    JOptionPane.showMessageDialog(null, " Divisão: " + divisao);
                    break;
            }
        }
    }

}
