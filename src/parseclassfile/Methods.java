package parseclassfile;

public class Methods {
    Read read;
    int methods_count;
    Method[] methods;
    public Methods(Read read) {
        this.read = read;
    }

    public void Init(){
        methods_count = read.read_bits(16);
        methods = new  Method[methods_count];
        for (int i = 0; i < methods_count; i++) {
            Method method = new Method(read);
            method.Init();
            methods[i] = method;
        }
    }


}
