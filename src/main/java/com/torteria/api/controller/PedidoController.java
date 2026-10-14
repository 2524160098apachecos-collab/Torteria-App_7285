package com.torteria.api.controller;
import java.util.List;
import com.torteria.api.model.Pedido;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PedidoController {
    private final List<Pedido> pedidos = List.of(
        new Pedido(1L,"Ivan","Cubana",2,"Sin cebolla"),
        new Pedido(2L,"Maria Lopez","Hawaiana",1,"Sin picante"),
        new Pedido(3L,"Juan Perez","Vegetariana",3,"Extra aguacate")
    );
    @GetMapping("/pedido")
    public ResponseEntity<?> obtenerPedido(@RequestParam(required = false) Long id) {
        if (id == null) return ResponseEntity.ok(pedidos);
        return pedidos.stream().filter(p -> p.getId().equals(id)).findFirst()
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
