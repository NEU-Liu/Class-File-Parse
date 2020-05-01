package parseclassfile;
import java.io.*;

public class Read {
    byte[] data;
    int HaveReadByte = 0;
    int HaveReadBit  = 128;
    public int DataLength;
    public Read(byte[] data) {
        this.data = data;
    }

    public Read(String fileName){
        File file = new File(fileName);
        DataLength = (int) file.length();
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("没有这个文件!");
        }
        data = new byte[(int) file.length()];
        try {
            int read = inputStream.read(data);
        } catch (IOException e) {
            System.out.println("Noll Point Exception!");
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
    }

    private int nextBit(){
        if (HaveReadBit == 0){
            HaveReadByte = HaveReadByte + 1;
            HaveReadBit  = 128;
        }

        int ret= HaveReadBit & data[HaveReadByte];
        HaveReadBit = HaveReadBit >>1;
        return ret ==0 ? 0:1;
    }

    public int ReadNumBitsWithRollBack(int numBits){
        int oldHaveReadByte = HaveReadByte;
        int oldHaveReadBit = HaveReadBit;
        int ret = this.read_bits(numBits);
        HaveReadByte = oldHaveReadByte;
        HaveReadBit = oldHaveReadBit;
        return ret;
    }


    public int nextByte(){
        int ret = 0;
        for (int i=0; i<8; i++){
            ret =ret + (int) Math.pow(2,7-i)*this.nextBit();
        }
        return ret;
    }

    public int read_bits(int n){
        int ret = 0;
        for (int i=0; i<n; i++){
            ret =ret + (int) Math.pow(2.0,n-1-i)*this.nextBit();
        }
        return ret;
    }

    public boolean HaveNextBit(){
        if (data.length-1 == HaveReadByte && HaveReadBit == 0){
            return false;
        }else {
            return true;
        }
    }

    public void NowPosition(){
        System.out.println("HaveReadByte:" + HaveReadByte + " HaveReadBit" + HaveReadBit);
    }

    public void PositionMoveToNextPosition(int nextIndex) {
            this.read_bits(nextIndex - 1);
    }
}
