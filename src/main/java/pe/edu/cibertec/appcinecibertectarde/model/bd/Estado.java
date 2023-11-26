package pe.edu.cibertec.appcinecibertectarde.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "estado")
@Data

public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idestado;

    @Column(name= "descestado")
    private String descestado;
}
