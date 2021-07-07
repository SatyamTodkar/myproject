package myproject;

import java.util.regex.Pattern;

class Contract {
	String retailer;
	String customer;
	
	Contract(String retailer, String customer) {
		this.retailer = retailer;
		this.customer = customer;
		}
}

class Receipt {
	Contract contract;
	String productsQR;
	Receipt (Contract contract, String productsQR) {
		this.contract = contract;
		this.productsQR= productsQR;
	}
}

class PrintReceipt {
	
	public int partyVerification(Receipt r) {
		String REGEX = "[a-z|A-Z]+[-||'|a-z|A-Z]*[a-z|A-Z]$";
		Pattern pattern = Pattern.compile(REGEX);
		
		boolean match1 = pattern.matcher(r.contract.retailer).matches();
		boolean match2 = pattern.matcher(r.contract.customer).matches();
		if(match1 && match2) {
			return 2;
		} else if (match1 || match2) {
			return 1;
		} else {
			return 0;
		}
		}
		public String computeGST (Receipt r) {
			String str = r.productsQR;
			int sum = 0;
			String s1[] = str.split("@");
			for(int i=0; i<s1.length; i++) {
				String s2[] = s1[i].split(",");
				sum+= Integer.parseInt(s2[0])*Integer.parseInt(s2[1]);
				
			}
			sum = sum*12/100;
			return Integer.toString(sum);
		}
		
	}

