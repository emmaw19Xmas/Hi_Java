package ArrayPractice;

public class DvdArrays {
    public static void main(String[] args) {
        DVD[] dvdBox = new DVD[15];

        DVD todayDVD = new DVD("today","French",2006);
        DVD incrediblesDVD = new DVD("The Incredibles", "Brad Bird",2004);
        DVD findingDoryDVD = new DVD("Finding Dory", "Andrew Stanton",2016);
        DVD lionKingDVD = new DVD("The Lion King", "Jon Favreau",2019);

        dvdBox[7] = todayDVD;
        dvdBox[9] = incrediblesDVD;
        dvdBox[11] = findingDoryDVD;
        dvdBox[13] = lionKingDVD;

        System.out.println(dvdBox[7]);
        System.out.println(dvdBox[7].toString());

        DVD starWarsDVD = new DVD("Star Wars",  "George Lucas",1977);
        dvdBox[7] = starWarsDVD;
        System.out.println(dvdBox[7]);
        System.out.println(dvdBox[7].toString());
        System.out.println(dvdBox[1]);
        System.out.println("This Array has a capacity of" + dvdBox.length);

        for (int i = 5; i < 10; i++) {
            //System.out.println(dvdBox[i].toString()); 会出现空指针异常的情况
            System.out.println(dvdBox[i]); //就不会出现
            ///当应用程序试图在需要对象的地方使用时，抛出该异常。这种情况包括：
            //
            //    * 调用 null 对象的实例方法。
            //    * 访问或修改 null 对象的字段。
            //    * 将 null 作为一个数组，获得其长度。
            //    * 将 null 作为一个数组，访问或修改其时间片。
            //    * 将 null 作为 Throwable 值抛出。
            //
            //应用程序应该抛出该类的实例，指示其他对 null 对象的非法使用。
            //????????????????
            //版权声明：本文为CSDN博主「gideal_wang」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
            //原文链接：https://blog.csdn.net/gideal_wang/article/details/4198696

        }


        int[] squareNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            int square = (i+1)*(i+1);
            squareNumbers[i] = square;
            //System.out.println(squareNumbers[i]);
            //System.out.println(squareNumbers); //[I@17f6480
        }

        // For each VALUE in the Array.
        for (int square : squareNumbers) {
            // Print the current value of square.
            System.out.print(square+" ");
        }
// Prints exactly the same as the previous example



    }
}
