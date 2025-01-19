package kadai_021;


public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		String[] input = {"apple", "banana", "grape", "orange"};
		
		for(int i=0;i<input.length;i++) {
			if (dictionary.getTrans(input[i]) != null) {
				System.out.println(input[i]+"の意味は"+dictionary.getTrans(input[i]));
			} else {
				System.out.println(input[i]+"は辞書にありません");
			}
		}
		
	}

}
