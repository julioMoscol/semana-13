package pe.edu.cibertec.appcinecibertectarde.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "registroasiento")
public class RegistroAsiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer idrasiento;
    @Column(name = "idcartelera")
    public Integer idcartelera;
    @Column(name = "nroasiento")
    public Integer nroasiento;
}
