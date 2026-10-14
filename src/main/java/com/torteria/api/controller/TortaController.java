package com.torteria.api.controller;
import java.util.List;
import com.torteria.api.model.Torta;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TortaController {
    private final List<Torta> tortas = List.of(
        new Torta(1L,"Cubana",85.0,"Jamon, queso y milanesa"),
        new Torta(2L,"Milanesa",65.0,"Milanesa de pollo"),
        new Torta(3L,"Hawaiana",75.0,"Jamon, pina y queso"),
        new Torta(4L,"Pierna",70.0,"Pierna de cerdo"),
        new Torta(5L,"Salchicha",55.0,"Salchicha y queso"),
        new Torta(6L,"Chorizo",65.0,"Chorizo con queso"),
        new Torta(7L,"Especial",95.0,"Milanesa, jamon y pierna"),
        new Torta(8L,"Pollo",70.0,"Pollo deshebrado"),
        new Torta(9L,"Vegetariana",60.0,"Verduras y queso"),
        new Torta(10L,"Suiza",80.0,"Tres tipos de queso")
    );
    @GetMapping("/torta")
    public ResponseEntity<?> obtenerTorta(@RequestParam(required = false) Long id) {
        if (id == null) return ResponseEntity.ok(tortas);
        return tortas.stream().filter(t -> t.getId().equals(id)).findFirst()
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
