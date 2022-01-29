package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import command.FilterChangeService;
import command.Mechanic;
import command.OilChangeService;

class TestFilterChangeService {

	@Test
	void test() {
		Mechanic mechanic = new Mechanic();
		FilterChangeService filterChangeService = new FilterChangeService(mechanic);
		filterChangeService.serviceRequest();
		assert(mechanic.getFilterChanged());
	}
}
