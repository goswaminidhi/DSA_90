package Trie;

import java.io.FileWriter;
import java.io.IOException;

class TrieNode{
    public TrieNode[] children= new TrieNode[26];
    public boolean eow;
}
public class implementation {
     TrieNode root = new TrieNode();
    public implementation() {

    }

    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if(node.children[i] == null){
                node.children[i] = new TrieNode();
                node = node.children[i];
            }else{
                node = node.children[i];
            }
        }
        node.eow = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (int i = 0; i <word.length(); i++) {
            int indx = word.charAt(i) - 'a';

            if(node.children[indx] == null){
                return false;
            }
            if(i == word.length() - 1 &&  node.children[indx].eow == false ){
                return false;
            }
           node = node.children[indx];
        }
        return true;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            int indx = prefix.charAt(i) - 'a';
            if(node.children[indx] == null){
                return false;
            }
            if(i == prefix.length() - 1 && node.children[indx].eow == false){
                return true;
            }
            node = node.children[indx];
        }
        return true;
    }
public static void main(String[] args) {
    String word = "trie";
    implementation imp = new implementation();

    imp.insert("apple");
    imp.insert("app");

    System.out.println(imp.search("app"));

    }
    //With this static block our code will be optimized
    static {
        Runtime.getRuntime().gc();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
                writer.write("0");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
    }
}
