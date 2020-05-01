package parseclassfile;

public class Magic {
    String magic;
    Read read;
    public Magic(Read read) {
        this.read = read;
    }

    public Read Init(){
        magic = Integer.toHexString(read.nextByte());
        magic = magic + " " + Integer.toHexString(read.nextByte());
        magic = magic + " " + Integer.toHexString(read.nextByte());
        magic = magic + " " + Integer.toHexString(read.nextByte());
        return read;
    }

    public String getMagic() {
        return magic;
    }
}
