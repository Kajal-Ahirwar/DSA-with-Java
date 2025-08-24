public class stringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("");
		for(char ch='a'; ch<='z'; ch++) {
			sb.append(ch);
		}

		//T.C.: 26   agr append ki jgh pahle jese += likhte toh time complexity 26*n^2 ho jaati jo ki abhi ki time complexity se vahut hi kharab he
		System.out.println(sb);
		System.out.println(sb.length());
	}
}
