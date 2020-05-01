package parseclassfile;




public class ConstantPool {
    Read read;
    Utils utils;
    int constant_pool_count;
    public ConstantPool(Read read) {
        this.read = read;
        utils = new Utils(this.read);
        constant_pool_count = utils.getConstant_pool_count_U2() - 1;
    }


    public Read Init(){
        int value = 0;
        for (int i = 0; i < constant_pool_count; i++) {
            value = read.ReadNumBitsWithRollBack(8);
            switch (value){
                case 7 :
                    CONSTANT_Class constant_class = new CONSTANT_Class(read);
                    constant_class.Init();
                    break;
                case 9 :
                    CONSTANT_Fieldref constant_fieldref = new CONSTANT_Fieldref(read);
                    constant_fieldref.Init();
                    break;
                case 10:
                    CONSTANT_Methodref constantMethodref = new CONSTANT_Methodref(read);
                    constantMethodref.Init();
                    break;
                case 11:
                    break;
                case 8:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 12:
                    CONSTANT_NameAndType constant_nameAndType = new CONSTANT_NameAndType(read);
                    constant_nameAndType.Init();
                    break;
                case 1:
                    CONSTANT_Utf8 constant_utf8 = new CONSTANT_Utf8(read);
                    constant_utf8.Init();
                    break;
                case 15:
                    break;
                case 16:
                    break;
                case 18:
                    break;
                default:
                    System.out.println("未知的常量类型!");
                    System.exit(0);
                    break;
            }

        }
        return read;
    }

}
