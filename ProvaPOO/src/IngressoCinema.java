/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joao3
 */
/**
 * classe que representa um ingresso de cinema.
 * ela permite definir o dia da semana e se o comprador é estudante
 * para calcular o preço final do ingresso
 */
public class IngressoCinema {

    /**
     * o dia da semana do cinema.
     */
    public DiaSemana diaSemana;

    /**
     * indica se o comprador é estudante.
     */
    public boolean estudante;

    /**
     * retorna o dia da semana do cinema.
     * 
     * @return o dia da semana do cienma.
     */
    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    /**
     * verifica se o comprador é estudante.
     * 
     * @return {@code true} se o comprador for estudante, caso contrário, {@code false}.
     */
    public boolean isEstudante() {
        return estudante;
    }

    /**
     * define o dia da semana do cinema.
     * 
     * @param diaSemana o dia da semana a ser definido.
     * @throws IllegalArgumentException se o dia da semana for {@code null}.
     */
    public void setDiaSemana(DiaSemana diaSemana) {
        if (diaSemana == null) {
            throw new IllegalArgumentException("Dia da Semana não pode ser vazio");
        }
        this.diaSemana = diaSemana;
    }

    /**
     * define se o comprador é estudante.
     * 
     * @param estudante {@code true} se o comprador for estudante, caso contrário, {@code false}.
     */
    public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }

    /**
     * calcula o preço do ingresso com base no dia da semana e se o comprador é estudante.
     * 
     * 
     * @return o preço final do ingresso.
     */
    public double precoIngresso() {
        double preco = 15.0;

        if (this.estudante) {
            if (this.diaSemana == DiaSemana.SABADO || this.diaSemana == DiaSemana.DOMINGO) {
                return preco * 0.4 + preco * 0.3;
            } else if (this.diaSemana == DiaSemana.SEGUNDA || this.diaSemana == DiaSemana.SEXTA) {
                return preco - preco * 0.3;
            } else if (this.diaSemana == DiaSemana.TERCA || this.diaSemana == DiaSemana.QUARTA || this.diaSemana == DiaSemana.QUINTA) {
                return preco / 2;
            }
        } else {
            if (this.diaSemana == DiaSemana.TERCA || this.diaSemana == DiaSemana.QUARTA || this.diaSemana == DiaSemana.QUINTA) {
                return preco / 2;
            } else if (this.diaSemana == DiaSemana.SABADO || this.diaSemana == DiaSemana.DOMINGO) {
                return preco * 0.4 + preco;
            }
        }

        return preco;
    }
}

