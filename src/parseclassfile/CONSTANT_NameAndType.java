package parseclassfile;


public class CONSTANT_NameAndType {
    int u1_tag;
    int u2_name_index;
    int u2_descriptor_index;
    Read read;

    public CONSTANT_NameAndType(Read read) {
        this.read = read;
    }

    public void Init(){
        u1_tag = read.read_bits(8);
        u2_name_index = read.read_bits(16);
        u2_descriptor_index = read.read_bits(16);
    }
    public void Show(){
        System.out.println("u1_tag:" + u1_tag);
        System.out.println("u2_name_index:" + u2_name_index);
        System.out.println("u2_descriptor_index:" + u2_descriptor_index);
    }

}
