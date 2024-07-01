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
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "departamento", fetch = FetchType.EAGER)
    private List<Funcionario> funcionarios;

    public Departamento(Long id) {
        this.id = id;
    }
}


