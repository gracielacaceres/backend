package pe.edu.vallegrande.barberia_macha.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.barberia_macha.model.*;
import pe.edu.vallegrande.barberia_macha.repository.VentaRepository;
import pe.edu.vallegrande.barberia_macha.service.VentaService;

import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {
    @Autowired
    private VentaService ventaService;
    @Autowired
    private VentaRepository ventaRepository;

    @GetMapping
    public List<Venta> listarVentas() {
        return ventaService.listarVentas();
    }
    @PostMapping("/registrar")
    public ResponseEntity<Venta> registrarVenta(@RequestBody VentaRequest ventaRequest) {
        Long idUsuario = ventaRequest.getIdUsuario();
        List<DetalleVenta> detalles = ventaRequest.getDetalles();
        Venta venta = ventaService.registrarVenta(idUsuario, detalles);
        return ResponseEntity.ok(venta);
    }


}
