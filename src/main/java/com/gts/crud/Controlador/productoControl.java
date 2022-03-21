package com.gts.crud.Controlador;


import com.gts.crud.Modelo.Producto;
import com.gts.crud.Repositorio.productoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
        RequestMethod.DELETE })
@RequestMapping("/api/products")
public class productoControl {

    @Autowired
    private productoRepo repositorio;

    @PostMapping("/product")
    public Producto create(@Validated @RequestBody Producto p) {
        return repositorio.insert(p);
    }

    @GetMapping("/")
    public List<Producto> readAll() {
        return repositorio.findAll();
    }

    @PutMapping("/product/{id}")
    public Producto update(@PathVariable String id, @Validated @RequestBody Producto p) {
        return repositorio.save(p);
    }

    @DeleteMapping("/product/{id}")
    public void delete(@PathVariable String id) {
        repositorio.deleteById(id);
    }
}
