package parseclassfile;


public class Field {
    int access_flags_U2;
    int name_index_U2;
    int descriptor_index_U2;
    int attributes_count_U2;
    Attribute[] attributes;

    Read read;

    public Field(Read read) {
        this.read = read;
    }

    public void Init(){
        access_flags_U2 = read.read_bits(16);
        name_index_U2 = read.read_bits(16);
        descriptor_index_U2 = read.read_bits(16);
        attributes_count_U2 = read.read_bits(16);
        attributes = new Attribute[attributes_count_U2];
        for (int i = 0; i < attributes_count_U2; i++) {
            Attribute attribute = new Attribute(read);
            attribute.Init();
            attributes[i] = attribute;
        }
    }




}
