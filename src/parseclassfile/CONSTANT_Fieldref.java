package parseclassfile;

/**
 * @Author:Liu
 * @Data:2020/4/30 14:10
 */
public class CONSTANT_Fieldref {
    int u1_tag;
    int u2_class_index;
    int u2_name_and_type_index;
    Read read;

    public CONSTANT_Fieldref(Read read) {
        this.read = read;
    }

    public void Init(){
        u1_tag = read.read_bits(8);
        u2_class_index = read.read_bits(16);
        u2_name_and_type_index = read.read_bits(16);
    }

    public void show() {
        System.out.println("u1_tag:" + u1_tag);
        System.out.println("u2_class_index:" + u2_class_index);
        System.out.println("u2_name_and_type_index:" + u2_name_and_type_index);
    }
}
