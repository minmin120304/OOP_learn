package Demo3;
import java.util.Scanner;

class StandardStr {
    private String string;

    public StandardStr(String string) { this.string = string; }

    public void inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        this.string = scanner.nextLine();
    }

    public void displayString() {
        System.out.println("String: " + this.string);
    }

    public void normalizeString() {
        //Loại bỏ khoảng trắng dư thừa ở đầu và cuối xâu = trim()
        //Thay thế các khoảng trắng liên tiếp trong xâu bằng 
        //một khoảng trắng duy nhất = replaceAll("\\s+", " ")
        this.string = this.string.trim().replaceAll("\\s+", " ");
        //Tách xâu thành các từ riêng biệt bằng split(" ")
        String[] words = this.string.split(" ");
        StringBuilder result = new StringBuilder();
        //Duyệt string = for-each để viết hoa kí tự đầu tiên của mỗi từ
        for (String word : words) {
            result.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
        }
        this.string = result.toString().trim();
    }
    
    //Đếm kí tự đặt biệt
    public void countSpecialCharacters() {
        int count = 0;
        for (char c : this.string.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                count++;
            }
        }
        System.out.println("Number of spectial characters: " + count);
    }

    //Đếm số lượng từ trong xâu mà bắt đầu bằng chữ "T" 
    public void countWordsStartingWithT() {
        int count = 0;
        String[] words = this.string.split(" ");
        for (String word : words) {
            if (word.startsWith("T")) { count++; }
        }
        System.out.println("Counting from starting with 'T': " + count);
    }

    //Đếm số lần xuất hiện của một từ cụ thể trong một chuỗi
    public void countOccurrencesOfWord(String word) {
        int count = 0;
        int lastIndex = 0;
        while (lastIndex != -1) {
            lastIndex = this.string.indexOf(word, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += word.length();
            }
        }
        System.out.println(word + "' appeared in the string " + count + " times.");
    }

    public void convertToUpperCase() { this.string = this.string.toUpperCase(); }
    public void convertToLowerCase() { this.string = this.string.toLowerCase(); }
}