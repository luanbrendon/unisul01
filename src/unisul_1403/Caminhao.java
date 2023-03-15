
package unisul_1403;
import javax.swing.*;
/**
 *
 * @author 10722128072
 */
public class Caminhao extends Veiculo {
    
    int cargaMaxima;
    int alturaMaxima;
    int comprimento;

    public Caminhao(int peso, int VelocMax, float preco) {
        super(peso, VelocMax, preco);
    }

    public Caminhao(int cargaMaxima, int alturaMaxima, int comprimento, int peso, int VelocMax, float preco) {
        super(peso, VelocMax, preco);
        this.cargaMaxima = cargaMaxima;
        this.alturaMaxima = alturaMaxima;
        this.comprimento = comprimento;
    }

    public Caminhao() {
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    
    @Override
    public void leitura() {
    super.leitura();
    setCargaMaxima(Integer.parseInt(JOptionPane.showInputDialog("Digite a carga maxima")));
    setAlturaMaxima(Integer.parseInt(JOptionPane.showInputDialog("Digite a altura maxima")));
    setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento")));
}
    @Override
    public void imprimir() {
    super.imprimir();
    JOptionPane.showMessageDialog(null,"A carga maxima é " + getCargaMaxima());
    JOptionPane.showMessageDialog(null,"A Altura maxima é " + getAlturaMaxima());
    JOptionPane.showMessageDialog(null,"o comprimento é " + getComprimento());
}
    
}

