package com.aurora.test.hash;

public class HashTest {

    public static void main(String[] args) {

//        String tmp = "test" + System.currentTimeMillis() + "zifuchuanbugouchangaxiedianshagne1113423r4q3fsfsdfsaf4wfwaweaf";
//        String toHashStr = new String(tmp);
        String salt = "zifuchuanbugouchangaxiedianshagne1113423r4q3fsfsdfsaf4wfwaweaf";
        StringBuilder builder = new StringBuilder("test");
        builder.append(System.currentTimeMillis());
        builder.append(salt);
        String toHashStr = builder.toString();
        int hashCode = toHashStr.hashCode() & Integer.MAX_VALUE;
        int hashC1 = toHashStr.hashCode();
        int hashC2 = toHashStr.hashCode();
        System.out.println("==============");
//        System.out.println(toHashStr);
//        System.out.println(hashCode);
//        System.out.println(hashC1);
//        System.out.println(hashC2);
//        System.out.println(hashCode % 1024);

        Long aa = 1234111122223333L;
        int ttmp = aa.hashCode();
        System.out.println(ttmp);
    }
}
