package exercicio.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@Builder
@ToString(exclude = "funcionarios")
@NoArgsConstructor
@AllArgsConstructor
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @OneToMany(mappedBy = "projeto", fetch = FetchType.EAGER)
    private List<Funcionario> funcionarios;

    public Projeto(Long id) {
        this.id = id;
    }
}

