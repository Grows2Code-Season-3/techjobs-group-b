package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Integer> {
}
