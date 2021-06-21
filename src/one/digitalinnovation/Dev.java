package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dev {
    private String nome;
    private List<Conteudo> conteudosInscritos = new ArrayList<>();
    private List<Conteudo> conteudosConcluidos = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void inscrever(Conteudo conteudo) {
        if (this.conteudosInscritos.contains(conteudo)) {
            System.out.println("Dev já se inscreveu no conteúdo");
        } else {
            conteudosInscritos.add(conteudo);
        }

    }

    public void inscrever(Bootcamp bootcamp) {
        bootcamp.getDevs().add(this);
        bootcamp.getConteudos().stream().forEach(conteudo -> {
            this.inscrever(conteudo);
        });
    }

    public void progredir() {
        Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            conteudosConcluidos.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
        } else {
            System.out.println("Você não tem mais conteúdos inscritos");
        }
    }

    public double calcularTotalXP() {
        return conteudosConcluidos.stream()
                .mapToDouble(conteudo -> conteudo.calcularXp()).sum();
    }


}
