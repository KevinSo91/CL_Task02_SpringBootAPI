package de.user1.kundenapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.user1.kundenapi.entity.Kunde;

public interface KundenRepository extends JpaRepository <Kunde, Integer> {
 
}
