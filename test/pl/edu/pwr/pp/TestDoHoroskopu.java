package pl.edu.pwr.pp;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;

public class TestDoHoroskopu {
	Horoskop horoskop;
	@Before
	public void setUp(){
		horoskop = new Horoskop();
	}
	@Test
	public void powinnoBycZero(){
		int len = horoskop.healthIndex("");
		assertThat(len,is(equalTo(0)));
	}
	@Test
	public void tomekNameShouldBe0(){
		int len = horoskop.healthIndex("Tomek Dróżdż");
		assertThat(len,is(equalTo(0)));
	}
	@Test
	public void twentyFiveShouldBe0(){
		int len = horoskop.loveIndex();
		assertThat(len,is(equalTo(2)));
	}
	@Test
	public void workShouldBeLowerThan11(){
		int index = horoskop.workIndex();
		assertThat(index, is(not(12)));
	}

}
