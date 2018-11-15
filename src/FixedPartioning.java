
/*
 * check system time
 */
public class FixedPartioning {

	public static void main(String[] args) {
		int[] Free = {25,25,50,50,100,100,100};
		int[] Busy = {0,0,0,0,0,0,0};
		job[] Jobs = new  job[10];
		Boolean state = true;
		//create instance of new job
		  Jobs[0] = new job("job 1",20);
		  Jobs[1] = new job("job 2",30);
		  Jobs[2] = new job("job 3",51);
		  Jobs[3] = new job("job 4",98);
		  Jobs[4] = new job("job 5",40);
		  Jobs[5] = new job("job 6",20);
		  Jobs[6] = new job("job 7",30);
		  Jobs[7] = new job("job 8",51);
		  Jobs[8] = new job("job 9",98);
		  Jobs[9] = new job("job 10",40);
		
		System.out.println("Base Values:");
	

		for(int x=0;x<10;x++) {
			System.out.println(Jobs[x].getName() +" "+Jobs[x].getSize());
			Jobs[x].setTime(6);
		}

		System.out.println();
		
		do {
			for(int a = 0;a<Jobs.length;a++) {
				if(Jobs[a].getStatus() == 0) {
					for(int x=0;x<Free.length;x++) {
						if(Jobs[a].getSize() <= Free[x]){
							System.out.println(Jobs[a].getName() + " Accepted!");
							Busy[x] = Free[x];
							Free[x] = 0;
							Jobs[a].setLocation(x);
							Jobs[a].setTime(0);
							Jobs[a].setStatus(1);
							System.out.println(Jobs[a].getName()+": "+Jobs[a].getLocation());
							break;
						}
					}	
					
				}
				for(int y = 0;y<Jobs.length;y++){
					Jobs[y].setTime(((Jobs[y].getTime())+1));
					
					if(Jobs[y].getTime() == 5 && Jobs[y].getStatus() == 1 ){
						Free[Jobs[y].getLocation()] = Busy[Jobs[y].getLocation()];
						Busy[Jobs[y].getLocation()] = 0;
						System.out.println(":) " + Jobs[y].getName());
						System.out.println();
						Jobs[y].setStatus(2);
					}
				}
			
			}
			boolean test = true;
			for(int a= 0;a<Jobs.length;a++) {
				if(Jobs[a].getStatus()<2) {
					test = false;
					break;
				}
				
			}
			
			if(test == true) {
				state = false;
			}
		}while(state);
	}
	
}


