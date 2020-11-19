package pond;

public class pond {
	void DeepenPond(int[][] pond) {
		
		//iterate pond and plus 1 
		for (int i = 1; i < pond.length; i++) {
			for (int j = 1; j < pond[i].length; j++) {
					if ((pond[i][j]!=0)&&(pond[i][j]<=pond[i-1][j])&&(pond[i][j]<=pond[i][j+1])
							&&(pond[i][j]<=pond[i][j-1])&&(pond[i][j]<=pond[i+1][j])) {
						pond[i][j]++;
					}
			}
		}
	}
	//If No can increase then return false
	boolean AreThereWouldBeDeepened(int[][] pond) {
		boolean Whether_to_deepen=false;
		for (int i = 1; i < pond.length; i++) {
			for (int j = 1; j < pond[i].length; j++) {
					if ((pond[i][j]!=0)&&(pond[i][j]<=pond[i-1][j])&&(pond[i][j]<=pond[i][j+1])
							&&(pond[i][j]<=pond[i][j-1])&&(pond[i][j]<=pond[i+1][j])) {
						Whether_to_deepen=true;
						return Whether_to_deepen;
					}
			}
		}
		
		return Whether_to_deepen;
	}
	public static void main(String[] args) {
		int [][] pond = new int[10][10];
		for (int i = 0; i < pond.length; i++) {
			for (int j = 0; j < pond[i].length; j++) {
				pond[i][j]=0;
			}
		}
		pond[1][4]=1; pond[2][3]=1;pond[2][4]=1;
		pond[2][5]=1;
		for (int i = 1; i < 7; i++) {
			pond[3][i]=1;
		}
		for (int i = 1; i < 9; i++) {
			pond[4][i]=1;
		}
		for (int i = 1; i < 9; i++) {
			pond[5][i]=1;
		}
		for (int i = 2; i < 8; i++) {
			pond[6][i]=1;
		}
		for (int i = 3; i < 7; i++) {
			pond[7][i]=1;
		}
		
		pond[8][4]=1;
		//pond setting end
		
		
		/**
		 * 
		 * 
		 *  3 times "for" iteration 
		 */
		
		pond p =new pond();
		while(p.AreThereWouldBeDeepened(pond)) {
			p.DeepenPond(pond);
		}
		
		
		
		
		for (int i = 0; i < pond.length; i++) {
			for (int j = 0; j < pond.length; j++) {
				System.out.print(pond[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
