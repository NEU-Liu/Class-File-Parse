package parseclassfile;


public class Version {
    public int minor_version;
    public int major_version;
    Read read;

    public Version(Read read) {
        this.read = read;
    }

    public Read Init(){
        minor_version = read.read_bits(16);
        major_version = read.read_bits(16);
        return read;
    }



}
