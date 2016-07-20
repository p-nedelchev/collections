package frequencytask;

public class Demo {
    public static void main(String[] args) {
        ReadString read = new ReadString("Qnityyy");
        System.out.println(read.charFreq());
        System.out.println("Most frequancy char is : " + read.mostFreqChar());
    }
}

