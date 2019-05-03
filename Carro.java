import javax.swing.*;

public class Carro {

    public static void main(String[] args) {

        double carro, custoFinal, custoFabrica, impostos, distribuidor;

        custoFabrica = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
        System.out.println("Esse é o valor do custo de fábrica: " +custoFabrica);

        distribuidor = (custoFabrica*12)/100;
        System.out.println("Esse é o valor do custo de fábrica + 12% do distribuidor: " +distribuidor);

        impostos = (distribuidor*5)/100;
        System.out.println("Esse é o valor do custo de fábrica + distribuidor + impostos: " +impostos);

        custoFinal = custoFabrica + distribuidor + impostos;
        System.out.println("Esse é o custo final: " +custoFinal);

        JOptionPane.showMessageDialog(null, "Custo final: " + custoFinal);

    }

}
