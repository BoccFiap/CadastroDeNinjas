package dev.java10x.cadastroDeNinjas.Missoes;

import dev.java10x.cadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data // Gera Getters and Setters
@NoArgsConstructor // Gera um Construtor sem argumentos
@AllArgsConstructor // Gera um Construtor com argumentos
public class MissoesModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;
  private String dificuldade;

  @OneToMany(mappedBy = "missoes") // @OneToMany - UNICA missao tem MUITOS ninjas
  private List<NinjaModel> ninjas;

}
