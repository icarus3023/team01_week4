package team01.week04;

import static org.junit.Assert.*;
import org.junit.Test;
import team01.week04.Calculator;

public class Testing {

	@Test
	public void testaddline(){
		Calculator cal1 = new Calculator(); //assertEquals(a,b)
		cal1.line = 5;
		assertEquals(cal1.addline(),2);
	}

	@Test
	public void testcalline(){ // 회선으로만 추가되는 요금 test
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 1;
		cal.line = 4;
		assertTrue(cal2.calline()==34);
	}
	@Test
	public void testonelinegoldcalline(){
		Calculator cal = new Calculator(); //assertEquals(a,b)
		cal.grade = 1;
		cal.line = 1;
		assertTrue(cal1.calline()==0.0);	
	}
	@Test
	public void testcalminutegoldnoaddline(){
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 1;
		cal.time = 878;
		assertTrue((cal3.calminute()-49.95)<0.1&&(cal3.calminute()-49.95)>=0);
	}
	@Test
	public void testcalminutegoldexistaddline(){
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 1;
		cal.time = 1127;
		assertTrue((cal.calminute()-107.1)<0.1&&(cal.calminute()-107.1)>=0);
	}
	@Test
	public void testmoney(){		
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 2;
		cal.line = 2;
		cal.time = 523;
		int temp = (int)cal4.money();
		assertTrue(temp==63);
	}
}
