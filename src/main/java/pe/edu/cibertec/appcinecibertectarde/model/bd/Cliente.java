package pe.edu.cibertec.appcinecibertectarde.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cliente")
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer idcliente;
    @Column(name = "nomcliente")
    public String nomcliente;
    @Column(name = "apecliente")
    public String apecliente;
    @Column(name = "dnicliente")
    public String dnicliente;
}
