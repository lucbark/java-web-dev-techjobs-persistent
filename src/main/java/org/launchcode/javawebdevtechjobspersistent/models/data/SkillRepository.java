package org.launchcode.javawebdevtechjobspersistent.models.data;

import org.launchcode.javawebdevtechjobspersistent.models.Skill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
// Instructions do not ask for this... but it is in JobRepository @Transactional
public interface SkillRepository extends CrudRepository<Skill, Integer> {
}
