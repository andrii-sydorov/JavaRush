package lecture_17.easy;

/**
 * Не используя synchronized сделай так, чтобы количество сделанных и принятых
 * предложений было одинаковым.
 * 
 * @author SMD_ASY
 *
 */

public class Purpose {

	public static volatile int proposal = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MakeProposal().start();
		new AcceptProposal().start();
	}

	public static class MakeProposal extends Thread {
		@Override
		public void run() {
			int thisProposal = proposal;
			while (thisProposal < 10) {
				System.out.println("Сделано предложение №" + (thisProposal + 1));
				proposal = ++thisProposal;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			}
		}
	}

	public static class AcceptProposal extends Thread {
		@Override
		public void run() {
			int thisProposal = proposal;

			while (thisProposal < 10) {
				if (thisProposal != proposal) {
					System.out.println("Принято предложение №" + proposal);
					thisProposal = proposal;
				}
			}
		}
	}

}
