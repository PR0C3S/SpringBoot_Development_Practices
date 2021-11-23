package com.pucmm.practica5.repositorios;

import com.pucmm.practica5.entities.Mock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MockRepository extends JpaRepository<Mock, Long> {

    @Query("select u from Mock u where u.id = ?1")
    Mock consultaMock(Long id);

    @Query("select u from Mock u where u.endPoint = ?1 and u.proyecto.usuario.username = ?2")
    Mock getMockByEndPointAndUsername(String endPoint, String username);

}