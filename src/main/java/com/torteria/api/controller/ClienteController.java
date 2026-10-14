package com.torteria.api.controller;
import java.util.List;
import com.torteria.api.model.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ClienteController {
    private final List<Cliente> clientes = List.of(
        new Cliente(1L,"Juan Perez","5512345678","Coacalco"),
        new Cliente(2L,"Maria Lopez","5523456789","Ecatepec"),
        new Cliente(3L,"Carlos Ramirez","5534567890","Tecamac"),
        new Cliente(4L,"Ana Martinez","5545678901","Zumpango"),
        new Cliente(5L,"Pedro Sanchez","5556789012","Tultitlan"),
        new Cliente(6L,"Laura Hernandez","5567890123","Tultepec"),
        new Cliente(7L,"Luis Garcia","5578901234","Cuautitlan"),
        new Cliente(8L,"Sofia Torres","5589012345","Huehuetoca"),
        new Cliente(9L,"Diego Flores","5590123456","Nextlalpan"),
        new Cliente(10L,"Fernanda Ruiz","5511122233","Acolman")
    );
    @GetMapping("/clientes")
    public ResponseEntity<?> obtenerClientes(@RequestParam(required = false) Long id) {
        if (id == null) return ResponseEntity.ok(clientes);
        return clientes.stream().filter(c -> c.getId().equals(id)).findFirst()
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
