package com.healthandcare.projetoHealthAndCareBackEnd.repositories;

import com.healthandcare.projetoHealthAndCareBackEnd.models.AdminModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;
@Repository
public interface AdminRepository extends JpaRepository<AdminModel, UUID> {

    boolean existsByAdmin(String cpf);
    boolean existsCpfAndPasswordAdmin (String cpf, String password);

}
