package bai2_buoi1_4;

import java.util.Scanner;

public class Bai1_4 {

	public static void main(String[] args) {
		// Ex 1:
//		System.out.println("Nhập điểm trung bình tin học văn phòng: ");
//		kiemTraDTB(nhap());

		// Ex 2:

	}

	// Ex 1
	private static Scanner input;

	public static float nhap() {
		input = new Scanner(System.in);
		boolean check = false;
		float n = 0;
		while (!check) {
			try {
				n = input.nextFloat();
				check = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Ban phai nhap so ! hay nhap lai ");
				input.nextLine();
			}
		}
		return n;
	}

	public static void kiemTraDTB(float dtb) {
		if (dtb < 5)
			System.out.println("Bạn rớt học phần tin học văn phòng");
		else
			System.out.println("Bạn đậu học phần tin học văn phòng");
	}

	// Ex 2
	public static void xepLoai(float dtb) {
		if (dtb >= 9)
			System.out.print("Xep loai: A");
		else if (dtb >= 7)
			System.out.print("Xep loai: B");
		else if (dtb >= 5)
			System.out.print("Xep loai: C");
		else
			System.out.print("Xep loai: D");
	}

	// Ex 3
	public static void soNgay(int thang, int nam) {
		switch (thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Thang co 31 ngay");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Thang co 30 ngay");
			break;
		case 2:
			if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0))
				System.out.println("Thang co 29 ngay");
			else
				System.out.println("Thang co 28 ngay");
			break;
		}
	}

	// Ex 4 Hãy cho biết kết quả của phương thức: hienThi3() và hienThi4()
	public static void hienThi3() {
		int x = 4;
		while (x < 4) {
			x++;
			System.out.println(x); // x = 4
		}
	}

	public static void hienThi4() {
		int x = 4;
		do {
			x++;
			System.out.println(x); // x = 5
		} while (x < 4);
	}

	// Ex 5
	public static int tinhTong() {
		int sum = 0;
		for (int i = 1; i <= 10; i++)
			sum += i;
		return sum;
	}

	// Ex 6
	public void viDu6() {
		int[] a = { 4, 3, 2, 1 };
		for (int ai : a) {
			System.out.println(ai);
		}

	}

	// Ex 7
	public void viDu7() {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}

	}

	// Ex 8
	public void viDu8() {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2) {
					break;
				}
				System.out.println(i + " " + j);
			}
		}
	}

	// Ex 9
	public void viDu9() {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			// Khi i == 5 thì không in i = 5 ra màn hình
			System.out.println(i);
		}

	}

	// Ex 10
	public void viDu10() {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2) {
					continue;
				}
				// Không in trường hợp i=2 và j=2 ra màn hình
				System.out.println(i + " " + j);
			}
		}
	}

}
