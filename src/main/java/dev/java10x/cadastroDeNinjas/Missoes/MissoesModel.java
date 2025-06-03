package dev.java10x.cadastroDeNinjas.Missoes;

import dev.java10x.cadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;
  private String dificuldade;

  @OneToMany(mappedBy = "missoes") // @OneToMany - UNICA missao tem MUITOS ninjas
  private List<NinjaModel> ninjas;

  public MissoesModel(){}

  public MissoesModel(String dificuldade, String nome) {
    this.dificuldade = dificuldade;
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDificuldade() {
    return dificuldade;
  }
  public void setDificuldade(String dificuldade) {
    this.dificuldade = dificuldade;
  }
}
