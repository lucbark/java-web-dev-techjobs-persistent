package org.launchcode.javawebdevtechjobspersistent.models.data;

import org.launchcode.javawebdevtechjobspersistent.models.Employer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository //Tells Spring that this is a class that should be made available to other parts of the app and creates
// an instance in case it is needed


public interface EmployerRepository extends CrudRepository<Employer, Integer> {
}
