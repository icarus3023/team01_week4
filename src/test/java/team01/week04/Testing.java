package team01.week04;

import static org.junit.Assert.*;
import org.junit.Test;
import team01.week04.Calculator;

public class Testing {

	@Test
	public void testaddline(){
		Calculator cal = new Calculator(); //assertEquals(a,b)
		cal.line = 5;
		assertEquals(cal.addline(),2);
	}

	@Test
	public void testcalline(){ // 회선으로만 추가되는 요금 test
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 1;
		cal.line = 4;
		assertTrue(cal.calline()==34);
	}
	@Test	public void testonelinegoldcalline(){
		Calculator cal = new Calculator(); //assertEquals(a,b)
		cal.grade = 1;
		cal.line = 1;
		assertTrue(cal.calline()==0.0);	
	}
	@Test
	public void testcalminutegoldnoaddline(){
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 1;
		cal.time = 878;
		assertTrue((cal.calminute()-49.95)<0.1&&(cal.calminute()-49.95)>=0);
	}
	@Test
	public void testcalminutegoldexistaddline(){
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 1;
		cal.time = 1127;
		assertTrue((cal.calminute()-107.1)<0.1&&(cal.calminute()-107.1)>=0);
	}
	@Test
	public void testcalminutesilvernoaddline(){
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 2;
		cal.time = 700;
		assertTrue((cal.calminute()-29.95)<0.1&&(cal.calminute()-29.95)>=0);
	}
	@Test
	public void testcalminutesilverexistaddline(){
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 2;
		cal.time = 1200;
		assertTrue((cal.calminute()-137.95)<0.1&&(cal.calminute()-137.95)>=0);
	}
	@Test
	public void testcalminuteerror(){
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 3;
		cal.time = 1200;
		assertTrue((cal.calminute()+1)>=-0.1&&(cal.calminute()+1)<0.1);
	}
	
	@Test
	public void testmoney(){		
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 2;
		cal.line = 2;
		cal.time = 523;
		int temp = (int)cal.money();
		assertTrue(temp==63);
	}
}
