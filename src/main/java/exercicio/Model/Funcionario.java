package exercicio.Model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@ToString(exclude = {"departamento", "projeto"})
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cargo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "projeto_id")
    private Projeto projeto;

}

