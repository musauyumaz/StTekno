package sttekno.analizor.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import sttekno.analizor.entities.Analizor;

public interface AnalizorDao extends JpaRepository<Analizor, Integer>{

}
