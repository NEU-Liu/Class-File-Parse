package parseclassfile;


public class Interfaces {
    int interfaces_count;
    int[] interfaces;

    Read read;
    Utils utils;
    public Interfaces(Read read) {
        this.read = read;
        utils = new Utils(this.read);
    }

    public void Init(){
        interfaces_count = utils.getInterfaces_count_U2();
        interfaces = new int[interfaces_count];
        for (int i = 0; i < interfaces_count; i++) {
            interfaces[i] = read.read_bits(16);
        }
    }


}
