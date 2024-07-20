package org.pets.application.pet.port;

import org.pets.domain.model.Pet;

import java.util.List;
import java.util.Optional;

public interface PetRepositoryPort {
    Pet createPet(Pet pet);

    List<Pet> findAll();

    boolean existsById(Long id);

    Optional<Pet> findById(Long id);

    void updatePets(List<Pet> petsToUpdate);
}
