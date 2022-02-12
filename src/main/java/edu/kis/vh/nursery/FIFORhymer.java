package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {


		private DefaultCountingOutRhymer defCountOutRhym = new DefaultCountingOutRhymer();

		

	
		@Override
		public int countOut() {
				while (!callCheck())
						defCountOutRhym.countIn(super.countOut());
		
				int ret = defCountOutRhym.countOut();
		
				while (!defCountOutRhym.callCheck())
						countIn(defCountOutRhym.countOut());
		
				return ret;
		}
}
