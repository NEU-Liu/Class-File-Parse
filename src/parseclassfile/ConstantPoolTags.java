package parseclassfile;

public enum ConstantPoolTags {
    CONSTANT_Class(7);

    private int value;
    ConstantPoolTags(int value) {
        this.value = value;
    }
}
