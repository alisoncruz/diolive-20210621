package one.digitalinnovation;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mentoria extends Conteudo {

    private LocalDateTime cargaHoraria;
    private String descricao;
    private LocalDate data;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDateTime getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(LocalDateTime cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO;
    }
}
