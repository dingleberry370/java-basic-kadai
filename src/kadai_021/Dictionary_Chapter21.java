package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	private HashMap<String, String> dict = new HashMap<String, String>();
	
	public Dictionary_Chapter21() {
		dict.put("apple", "リンゴ");
		dict.put("peach", "桃");
		dict.put("banana", "バナナ");
		dict.put("lemon", "レモン");
		dict.put("pear", "梨");
		dict.put("kiwi", "キウイ");
		dict.put("strawberry", "いちご");
		dict.put("grape", "ぶどう");
		dict.put("muscat", "マスカット");
		dict.put("cherry", "さくらんぼ");		
	}
	
	public String getTrans(String id) {
		
		if (dict.containsKey(id)){
			return dict.get(id);
		}
		return null;
	}
	
}
