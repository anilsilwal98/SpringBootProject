package com.security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.security.model.Phone;

public interface PhoneRepository extends JpaRepository<Phone,Long> {

}
