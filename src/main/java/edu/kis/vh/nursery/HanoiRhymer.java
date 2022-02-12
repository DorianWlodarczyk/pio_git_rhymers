package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

		private int totalRejected = 0;

		public int reportRejected() {
				return totalRejected;
		}

		@Override
		public void countIn(int in) {
				if (!callCheck() && in > peekaboo())
						totalRejected++;
				else
						super.countIn(in);
		}
}
//zle sformatowane linijki kodu to 5,12,13,14,15
//polecenie alt ze strzalka oznacza przelaczanie sie miedzy ostatnimi edytorami , strzlka w lewo cofa , strzalka w prawo idzie dalej