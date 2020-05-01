package parseclassfile;

import com.sun.org.apache.regexp.internal.RE;

public class CONSTANT_Class {
    int u1_tag;
    int u2_name_index;

    Read read;

    public CONSTANT_Class(Read read) {
        this.read = read;
    }

    public void Init() {
        u1_tag = read.read_bits(8);
        u2_name_index = read.read_bits(16);
    }
    public void Show(){
        System.out.println("u1_tag:" + u1_tag);
        System.out.println("u2_name_index:" + u2_name_index);
    }

}
