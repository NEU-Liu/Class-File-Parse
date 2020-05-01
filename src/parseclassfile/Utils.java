package parseclassfile;


public class Utils {
    private Read read;



    public Utils(Read read) {
        this.read = read;
    }

    public int getConstant_pool_count_U2() {
        return read.read_bits(16);
    }

    public int getAccess_flags_U2() {
        return read.read_bits(16);
    }

    public int getThis_class_U2(){
        return read.read_bits(16);
    }

    public int getSuper_Class_U2(){
        return read.read_bits(16);
    }

    public int getInterfaces_count_U2(){
        return read.read_bits(16);
    }

    public int getFields_count_U2(){
        return read.read_bits(16);
    }

    public int getMethods_count_U2(){
        return read.read_bits(16);
    }

    public int getAttributes_count_U2(){
        return read.read_bits(16);
    }




}
