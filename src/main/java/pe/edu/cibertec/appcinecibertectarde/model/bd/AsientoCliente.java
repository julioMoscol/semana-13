package pe.edu.cibertec.appcinecibertectarde.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "asientocliente")
public class AsientoCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer idacliente;
    @Column(name = "idrasiento")
    public Integer idrasiento;
    @Column(name = "idcliente")
    public Integer idcliente;
}
