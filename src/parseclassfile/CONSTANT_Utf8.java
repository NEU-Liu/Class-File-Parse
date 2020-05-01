package parseclassfile;


public class CONSTANT_Utf8 {
    int u1_tag;
    int u2_length;
    int[] u1_bytes;
    Read read;

    public CONSTANT_Utf8(Read read) {
        this.read = read;
    }

    public void Init(){
        u1_tag = read.read_bits(8);
        u2_length = read.read_bits(16);
        u1_bytes = new int[u2_length];
        for (int i = 0; i < u2_length; i++) {
            u1_bytes[i] = read.read_bits(8);
        }
    }

    public void Show(){
        System.out.println("u1_tag:" + u1_tag);
        System.out.println("u2_length:" + u2_length);
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < u2_length; i++) {
            stringBuilder.append((char) u1_bytes[i] + ",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1).append("]");
        System.out.println("u1_bytes:" + stringBuilder.toString());
    }

}
