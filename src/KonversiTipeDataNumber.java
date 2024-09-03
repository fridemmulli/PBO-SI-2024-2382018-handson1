public class KonversiTipeDataNumber {
    public static void main(String[] args){
        //Widening
        short tipeDataShort = 10;
        int tipeDataInt = tipeDataShort;
        long tipeDatalong = tipeDataInt;

        //Narrowing
        int tipeDataInteger2 = 10;
        byte tipeDataByte = (byte) tipeDataInteger2;

        //Number overflow
        int tipeDataInteger = 128;

        short tipeDataShortConverted =(short) tipeDataInteger;
        System.out.println(tipeDataShortConverted);

    }
}
