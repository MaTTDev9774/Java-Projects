package imc;

import javax.swing.JOptionPane;

public class IMC {

    public static void main(String[] args) {

        String o = JOptionPane.showInputDialog(null, "Qual é o seu peso?", "IMC", JOptionPane.YES_NO_OPTION);
        float peso = Float.parseFloat(o);
        String q = JOptionPane.showInputDialog(null, "Qual é a sua altura?", "IMC", JOptionPane.YES_NO_OPTION);
        float altura = Float.parseFloat(q);
        float imc;
        imc = peso / (altura * altura);

        if (imc < 17) {
            int x;
            JOptionPane.showMessageDialog(null, "muito abaixo do peso");
        }

        else if(imc > 17 && imc <19){
        int b;
            JOptionPane.showMessageDialog(null, "abaixo do peso");
    }
        else if (imc > 19 && imc < 25){
            int c;
            JOptionPane.showMessageDialog(null, "peso normal");
        }
        else if (imc > 25 && imc < 30){
            int d;
            JOptionPane.showMessageDialog(null, "acima do peso");
        }
        else if(imc > 25 && imc < 30){
            int e;
            JOptionPane.showMessageDialog(null, "obesidade I");
        }
        else if(imc > 35 && imc < 40){
            int f;
            JOptionPane.showMessageDialog(null, "obesidade II(severa)");
        }
        else if(imc > 40){
            int g;
            JOptionPane.showMessageDialog(null, "obesidade III(mórbida)");
        }
}
