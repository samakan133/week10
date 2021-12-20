package Week10;

public class PositiveNumber {
    public static void main(String[] args) {
        // ให้รับค่าตัวเลข เเล้วบอกให้ได้ว่าตัวเลขนั้นเป็นจำนวนเต็มบวกหรือไม่
        int number = 0;
        String result = "";
        // การเขียน IF-Else

        if (number > 0) { // กรณีของตรวจสอบจำนวนเต็มบวก
            result = number+" เป็นจำนวนเต็มบวก";
        } else if (number < 0) { // กรณีของตรวจสอบจำนวนเต็มลบ
            result = number+" เป็นจำนวนเต็มลบ";
        } else if (number == 0) { // กรณีของตรวจสอบจำนวนเต็มศูนย์
            result = number+" เป็นจำนวนเต็มศูนย์";
        }
        System.out.println(result);

            // --- 
            // //กรณีของตรวจสอบจำนวยนเต็มบวก
            // if ( number > 0) {
            // System.out.println("เป็นจำนวนเต็มบวก");

            // }
            // //กรณีของตรวจสอบจำนวยนเต็มลบ
            // if ( number < 0) {
            // System.out.println("เป็นจำนวนเต็มลบ");
            // }
            // //กรณีของตรวจสอบจำนวยนเต็มศูนย์
            // if ( number == 0) {
            // System.out.println("เป็นจำนวนเต็มศูนย์");
            // }

        }
    }

