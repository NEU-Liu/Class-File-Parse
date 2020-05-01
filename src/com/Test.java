package com;

import parseclassfile.*;

public class Test {
    public static void main(String[] args) throws Exception {
        Read read = new Read("./src/com/TestClass.class");
        Magic magic = new Magic(read);
        magic.Init();

        Version version = new Version(read);
        version.Init();

        ConstantPool constantPool = new ConstantPool(read);
        constantPool.Init();

        Utils utils = new Utils(read);
        int access_flags_u2 = utils.getAccess_flags_U2();

        utils.getThis_class_U2();
        utils.getSuper_Class_U2();

        Interfaces interfaces = new Interfaces(read);
        interfaces.Init();

        Fields fields = new Fields(read);
        fields.Init();

        Methods methods = new Methods(read);
        methods.Init();

        Attributes attributes = new Attributes(read);
        attributes.Init();




    }
}
