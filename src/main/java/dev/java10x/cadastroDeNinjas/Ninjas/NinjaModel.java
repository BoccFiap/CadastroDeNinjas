package dev.java10x.cadastroDeNinjas.Ninjas;

import dev.java10x.cadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

// JPA = Java Persistence API
@Entity // Transforma uma classe em uma estidade do DB
@Table(name = "tb_cadastro_de_ninjas")
public class NinjaModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String nome;
  private String email;
  private int idade;

  @ManyToOne // @ManyToOne - MUITOS ninjas tem uma UNICA missao
  @JoinColumn(name = "missoes_id") // Foreing Key - FK
  private MissoesModel missoes;

  public NinjaModel() {}

  public NinjaModel(String nome, String email, int idade) {
    this.nome = nome;
    this.email = email;
    this.idade = idade;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public int getIdade() {
    return idade;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }


}
