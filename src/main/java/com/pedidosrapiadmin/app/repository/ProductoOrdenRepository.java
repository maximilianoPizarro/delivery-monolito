package com.pedidosrapiadmin.app.repository;

import com.pedidosrapiadmin.app.domain.ProductoOrden;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the ProductoOrden entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProductoOrdenRepository extends JpaRepository<ProductoOrden, Long> {}
