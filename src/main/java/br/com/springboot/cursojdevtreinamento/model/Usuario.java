package br.com.springboot.cursojdevtreinamento.model;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@SequenceGenerator(name="seq_usuario",sequenceName = "seq_usuario",allocationSize = 1, initialValue = 1)
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
    @Column(name = "id", nullable = false)
    private Long id;

    private String nome;

    private int idade;

}
