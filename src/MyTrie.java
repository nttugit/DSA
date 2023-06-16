//public class MyTrie {
//    private Node root;
//
//    public MyTrie() {
//        root = new Node('\0'); // empty character
//    }
//
//    // Inserts a word into the trie
//    public void insert(String word) {
//        Node currentNode = root;
//        for(int i = 0; i < word.length(); i++){
//            char currentChar = word.charAt(i);
//            // c - 'a' ; index in range 0 -> 35
//            if(currentNode.children[currentChar - 'a'] == null){
//                // create the character at this index
//                currentNode.children[currentChar - 'a'] = new Node(currentChar);
//            }
//            // move
//            currentNode = currentNode.children[currentChar - 'a'];
//        }
//        currentNode.isWord = true;
//    }
//
//    public boolean search(String word) {
//        Node node = getNode(word);
//        return node != null && node.isWord;
//    }
//
//    // check if there is any word start width the given prefix
//    public boolean startWith(String prefix) {
//        return getNode(prefix) != null;
//    }
//
//    public Node getNode(String word){
//        Node currentNode = root;
//        for(int i =0; i < word.length(); i++){
//            char currentChar = word.charAt(i);
//            if(currentNode.children[currentChar - 'a'] == null)
//                return null;
//            currentNode = currentNode.children[currentChar - 'a'];
//        }
//        return currentNode;
//    }
//
//    class Node() {
//        public char c;
//        public boolean isWord;
//        public Node[] children;
//
//        public Node(char c) {
//            this.c = c;
//            isWord = false;
//            children = new Node[26];
//        }
//    }
//}
