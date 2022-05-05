package br.com.Leiturista.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Leiturista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private int matricula;
    @Column(nullable = false)
    private String codigo;
    @Column(nullable = false)
    private String situacao;
    @Column(nullable = false)
    private String longitude;
    @Column(nullable = false)
    private String latitude;
    @Column(nullable = false)
    @Lob
    private String foto;
}
