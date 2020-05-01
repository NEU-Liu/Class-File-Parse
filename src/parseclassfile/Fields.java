package parseclassfile;


import java.io.File;

public class Fields {
    int fields_count_U2;
    Field[] fields;
    Read read;
    Utils utils;

    public Fields(Read read) {
        this.read = read;
    }

    public void Init(){
        fields_count_U2 = read.read_bits(16);
        fields = new Field[fields_count_U2];
        for (int i = 0; i < fields_count_U2; i++) {
            Field field = new Field(read);
            field.Init();
            fields[i] = field;
        }
    }


}
