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
            //System.out.println(dvdBox[i].toString()); ����ֿ�ָ���쳣�����
            System.out.println(dvdBox[i]); //�Ͳ������
            ///��Ӧ�ó�����ͼ����Ҫ����ĵط�ʹ��ʱ���׳����쳣���������������
            //
            //    * ���� null �����ʵ��������
            //    * ���ʻ��޸� null ������ֶΡ�
            //    * �� null ��Ϊһ�����飬����䳤�ȡ�
            //    * �� null ��Ϊһ�����飬���ʻ��޸���ʱ��Ƭ��
            //    * �� null ��Ϊ Throwable ֵ�׳���
            //
            //Ӧ�ó���Ӧ���׳������ʵ����ָʾ������ null ����ķǷ�ʹ�á�
            //????????????????
            //��Ȩ����������ΪCSDN������gideal_wang����ԭ�����£���ѭCC 4.0 BY-SA��ȨЭ�飬ת���븽��ԭ�ĳ������Ӽ���������
            //ԭ�����ӣ�https://blog.csdn.net/gideal_wang/article/details/4198696

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
