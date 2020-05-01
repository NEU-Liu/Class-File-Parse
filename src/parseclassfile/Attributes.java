package parseclassfile;


public class Attributes {
    Read read;
    Attribute[] attributes;
    int attribute_count;
    public Attributes(Read read) {
        this.read = read;
    }

    public void Init(){
        attribute_count = read.read_bits(16);
        attributes = new Attribute[attribute_count];
        for (int i = 0; i < attribute_count; i++) {
            Attribute attribute = new Attribute(read);
            attribute.Init();
            attributes[i] = attribute;
        }

    }
}
