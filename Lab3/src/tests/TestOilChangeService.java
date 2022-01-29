package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import command.Mechanic;
import command.OilChangeService;

class TestOilChangeService {

	@Test
	void test() {
		Mechanic mechanic = new Mechanic();
		OilChangeService oilChangeService = new OilChangeService(mechanic);
		oilChangeService.serviceRequest();
		assert(mechanic.getOilChanged());
	}
}
