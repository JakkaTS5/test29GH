public class App {
    public static void main(String[] args) {
        XoaKyTuTrungLapFor();
        // XoaKyTuTrungForIf();
        // TestNgu();//Shift + F5, dừng
        // VietDaoNguoc();// nên tạo 1 string mới để viết đè lên
        // testngu2();
    }

    public static void XoaKyTuTrungLapFor() {
        String str = "aabbacc";
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            boolean check = false;
            for (int j = 0; j < str1.length(); j++) {
                if (str.charAt(i) == str1.charAt(j)) {
                    check = true;
                }
            }
            if (check == false) {
                str1 += str.charAt(i);
            }
        }
        System.out.println(str1);
    }

    public static void XoaKyTuTrungForIf() {
        String str = "aabbacc";
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str1.contains(String.valueOf(str1.charAt(i)))) {// String.valueOf đổi ra string

            }

        }
    }

    public static void TestNgu() {
        for (int i = 1; i >= 0; i++) {
            System.out.println(i);
        }
    }

    public static void testngu2() {
        String str = "hello world";
        String str1 = "h";
        if (str1.contains(String.valueOf(str.charAt(0)))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    public static void VietDaoNguoc() {
        String str = "hello world";
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 += str.charAt(i);// nhớ là +=
        }
        System.out.print(str1);
    }
}
