class Solution {
    public String reverseWords(String s) {
		String words[] = s.split(" ");
		StringBuilder res = new StringBuilder();
		for (String word : words)
			res.append(new StringBuffer(word).reverse().toString() + " ");
		return res.toString().trim(); //trim()方法返回调用字符串对象的一个副本，但是所有起始和结尾的空格都被删除了
	}
}
