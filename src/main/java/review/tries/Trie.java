package review.tries;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    TrieNode root;

    //construct an empty Trie Object
    public Trie() {
        root = new TrieNode();
    }


    public void insert(String word) {
      TrieNode current = root;
      char[] arr = word.toCharArray();
      for(char c: arr) {
          if(!current.children.containsKey(c)) {
              current.children.put(c, new TrieNode());
          }
          current = current.children.get(c);
      }
      current.isWord = true;
    }

    public boolean search(String word) {
        TrieNode current = root;
        char[] arr = word.toCharArray();
        for(char c: arr) {
            if(!current.children.containsKey(c)) return false;
            current = current.children.get(c);
        }
        return current.isWord;
    }

    public boolean startsWith(String word) {
        TrieNode current = root;
        char[] arr = word.toCharArray();
        for(char c: arr) {
            if(!current.children.containsKey(c)) return false;
            current = current.children.get(c);
        }
        return true;
    }

}

class TrieNode{
    public Map<Character, TrieNode> children = new HashMap<>();
    public boolean isWord = false;
}
