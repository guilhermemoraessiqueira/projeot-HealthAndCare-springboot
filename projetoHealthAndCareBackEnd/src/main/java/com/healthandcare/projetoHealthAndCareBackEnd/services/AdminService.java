package com.healthandcare.projetoHealthAndCareBackEnd.services;

import com.healthandcare.projetoHealthAndCareBackEnd.models.AdminModel;
import com.healthandcare.projetoHealthAndCareBackEnd.repositories.AdminRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AdminService {

    final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository){
        this.adminRepository = adminRepository;
    }

    @Transactional
    public AdminModel save(AdminModel adminModel){
        return adminRepository.save(adminModel);

    }

    public boolean existsByAdmin(String cpf){
        return adminRepository.existsByAdmin(cpf);
    }

    public boolean checkCpfAndPasswordAdmin(String cpf, String password){
        return adminRepository.existsCpfAndPasswordAdmin(cpf, password);
    }

    public Page<AdminModel> findAll(Pageable pageable) {
        return adminRepository.findAll(pageable);
    }

    public Optional<AdminModel> findById(UUID id) {
        return adminRepository.findById(id);
    }

    @Transactional
    public void delete(AdminModel parkingSpotModel) {
        adminRepository.delete(parkingSpotModel);
    }

    public List<AdminModel> findAll() {
        return adminRepository.findAll();
    }
}
