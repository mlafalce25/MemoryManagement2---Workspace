
public class job {
	
		 protected String name;
		 protected int location;
		 protected int size;
		 protected int sdf;
		 protected int done = 0;
		public job() {
			
		}
		public job(String n,int s) {
			setName(n);
			setSize(s);
			
		}
		public String getName() {
			return name;
		}
		
		public int getLocation() {
			return location;
		}
		
		public int getSize() {
			return size;
		}
		
		public int getTime() {
			return sdf;
		}
		
		public int getStatus() {
			return done;
		}
		
		public void setName(String n) {
			name = n;
		}
		
		public void setLocation(int l) {
			location = l;
		}
		
		public void setSize(int s) {
			size = s;
		}
		
		public void setTime(int l) {
			sdf = l;
		}
		public void setStatus(int b) {
			done = b;
		}
	}


