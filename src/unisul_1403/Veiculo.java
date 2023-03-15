/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unisul_1403;
import javax.swing.*;
/**
 *
 * @author 10722128072
 */
public class Veiculo {

    public Veiculo() {
    }

    public Veiculo(int peso, int VelocMax, float preco) {
        this.peso = peso;
        this.VelocMax = VelocMax;
        this.preco = preco;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setVelocMax(int VelocMax) {
        this.VelocMax = VelocMax;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getPeso() {
        return peso;
    }

    public int getVelocMax() {
        return VelocMax;
    }

    public float getPreco() {
        return preco;
    }
    
    public void leitura() {
    setPeso(Integer.parseInt(JOptionPane.showInputDialog("Digite a Cor")));
    setVelocMax(Integer.parseInt(JOptionPane.showInputDialog("Digite a Cor")));
    setPreco(Integer.parseInt(JOptionPane.showInputDialog("Digite a Cor")));
}
    public void imprimir() {
    JOptionPane.showMessageDialog(null,"A cor é " + getPeso());
    JOptionPane.showMessageDialog(null,"A cor é " + getVelocMax());
    JOptionPane.showMessageDialog(null,"A cor é " + getPreco());
}
    
    private int peso;
    private int VelocMax;
    private float preco;
}

