package parseclassfile;

/**
 * @Author:Liu
 * @Data:2020/4/30 15:45
 */
public class Attribute {
    int attribute_name_index_U2;
    int attribute_length_U4;
    int[] info;

    Read read;

    public Attribute(Read read) {
        this.read = read;
    }

    public void Init() {
        attribute_name_index_U2 = read.read_bits(16);
        attribute_length_U4 = read.read_bits(32);
        info = new int[attribute_length_U4];
        for (int i = 0; i < attribute_length_U4; i++) {
            info[i] = read.read_bits(8);
        }
    }
}
