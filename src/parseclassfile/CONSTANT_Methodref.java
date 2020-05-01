package parseclassfile;

public class CONSTANT_Methodref {
    int u1_tag;
    int u2_class_index;
    int u2_name_and_type_index;
    Read read;

    public CONSTANT_Methodref(Read read) {
        this.read = read;
    }

    public void Init(){
        u1_tag = read.read_bits(8);
        u2_class_index = read.read_bits(16);
        u2_name_and_type_index = read.read_bits(16);
    }
}
