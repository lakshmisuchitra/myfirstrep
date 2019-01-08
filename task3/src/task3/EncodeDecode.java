package task3;

 public class EncodeDecode {
	static String encode(String str) {
	    StringBuilder sb = new StringBuilder();
	    char tmp = str.charAt(0);
	    int count = 1;
	    for (int i = 1; i < str.length(); i++) {
	        char curr = str.charAt(i);
	        if (curr == tmp) {
	            count++;
	        } else {
	            sb.append(tmp).append(count);
	            count = 1;
	        }
	        tmp = curr;
	    }
	    sb.append(tmp).append(count);
	    return sb.toString();
	}
	static String decode(String str) {
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < str.length(); i += 2) {
	        int count = Integer.valueOf("" + str.charAt(i + 1));
	        for (int j = 0; j < count; j++) {
	            sb.append(str.charAt(i));
	        }
	    }
	    return sb.toString();
	}
	public static void main(String[] args) {
	    System.out.println(encode("aaaabbcccaa"));
	    System.out.println(decode("e3r4g5j7"));
	}

}
