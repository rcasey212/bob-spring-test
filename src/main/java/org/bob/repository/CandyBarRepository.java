package org.bob.repository;

import org.bob.model.CandyBar;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by rcasey on 3/10/2017.
 */
public interface CandyBarRepository extends CrudRepository<CandyBar, Integer> {

	//@Query("select * from CandyBar where candyId in ")
	List<CandyBar> findByCandyIdIn(List<Integer> candyIdList);
}
