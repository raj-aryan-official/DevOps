public class New{
	public static void main(String[] args) {
        String s = "010101";
        System.out.println(Rev(s));
        System.out.println(Reverse(s,3));
	}
    public static String Rev(String s ) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
         return s+sb.toString();
	}
    public static String Reverse(String s ,int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            if (s.charAt(i) == '0') {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        return s.toString().concat(sb.toString());
	}
}