public static int ncr(int n, int r) {
		
		int ans=1;
		
		for(int i=1;i<=r;i++) {
		  ans= ans*(n-i+1)/i;
		}
		return ans;
		
	}
	public static void pattern1(int n) {
		
		int nst=1;
		int row=1;
		System.out.println("1");
		while(row<=n) {
			int cst=0;
			while(cst<=nst) {
				System.out.print(ncr(row,cst)+"  ");
				cst++;
			}
			nst++;
			System.out.println();
			row++;
		}
	}
