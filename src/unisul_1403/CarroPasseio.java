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
public class CarroPasseio extends Veiculo {

    public CarroPasseio(String cor, String modelo, int peso, int VelocMax, float preco) {
        super(peso, VelocMax, preco);
        this.cor = cor;
        this.modelo = modelo;
    }

    public CarroPasseio(int peso, int VelocMax, float preco) {
        super(peso, VelocMax, preco);
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    private String cor;
    private String modelo;
}

