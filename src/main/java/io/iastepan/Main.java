package io.iastepan;

public class Main {

    public static void main(String[] args) {
        ApiV1 v1 = new ApiV1();
        v1.setMake("VW");
        v1.setNumberOfSeats(4);
        v1.setType("Sedan");

        ApiV2 v2 = new ApiV2();
        v2.setMake("KIA");
        v2.setSeats(2);
        v2.setType(3);
        v2.setSafetySystems("ABS");

        ApiUnified fromV1 = XsdMapper.INSTANCE.v1ToUnified(v1);
        System.out.println(fromV1);

        ApiUnified fromV2 = XsdMapper.INSTANCE.v2ToUnified(v2);
        System.out.println(fromV2);
    }
}
