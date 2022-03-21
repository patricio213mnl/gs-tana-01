package com.gts.crud.Repositorio;

import com.gts.crud.Modelo.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productoRepo extends MongoRepository<Producto,String> {
}
