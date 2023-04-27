package SeleniumTest;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderdemo {
	
	public Object[][] dp1() {
		  return new Object[][] {
		      new Object[] { "a", "b" },
		      new Object[] { "c", "d" },
		  };
		}

		public Object[][] dp2() {
		  return new Object[][] {
		      new Object[] { "e", "f" },
		      new Object[] { "g", "h" },
		  };
		}
		
		@DataProvider
		
		public List<Object[]> func() {
			
			List<Object[]> list = new ArrayList<Object[]>();
			
			list.add(dp1()[0]);
			
			
			
			return list;
			
		}
		@Test
		void myTest() {
			
			System.out.println(func().get(0).toString());
			
		}

}
