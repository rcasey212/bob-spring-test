package org.bob.controller;

import org.bob.model.CandyBar;
import org.bob.repository.CandyBarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * Created by rcasey on 3/10/2017.
 */
@Controller
public class CandyBarController {

	@Autowired
	private CandyBarRepository candyBarRepository;

	public @ResponseBody CandyBar saveOne() {
		throw new NotImplementedException();
	}

	@RequestMapping(value="/CandyBar/{id}")
	public @ResponseBody List<CandyBar> getMany(@PathVariable("id") List<Integer> candyIdList ) {
		return candyBarRepository.findByCandyIdIn(candyIdList);
	}
}
