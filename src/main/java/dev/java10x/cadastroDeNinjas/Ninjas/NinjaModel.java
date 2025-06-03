package dev.java10x.cadastroDeNinjas.Ninjas;

import dev.java10x.cadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// JPA = Java Persistence API
@Entity // Transforma uma classe em uma estidade do DB
@Table(name = "tb_cadastro")
@Data // Gera Getters and Setters
@NoArgsConstructor // Gera um Construtor sem argumentos
@AllArgsConstructor // Gera um Construtor com argumentos
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

}
