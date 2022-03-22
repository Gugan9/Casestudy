package sampleprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Musicmain {
	public static void main(String[] args) throws InterruptedException {
		ArrayList<Musicsong> a = new ArrayList();
		a.add(new Musicsong(1, "vel", "aswin", "film", "aaaa", "zzz"));
		a.add(new Musicsong(2, "del", "win", "movie", "baaa", "bzzz"));
		System.out.println("press 1 to play a song");
		System.out.println("press 2 search a song ");
		System.out.println("press 3 to show all song");
		System.out.println("press 4 to operate on song");
		System.out.println("-------------------------------");
		Comparator<Musicsong> comparator = Comparator.comparing(Musicsong::getTitle);
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		switch (b) {
		case (1):
			System.out.println("playing a song");
			System.out.println("enter A to play all song ");
			System.out.println("enter B to play a song randomly");
			System.out.println("enter C to play a particular song");
			Scanner z = new Scanner(System.in);
			char i = z.next().charAt(0);
			Musicsong y = new Musicsong();

			if (i == 'A') {
				Collections.sort(a, comparator);
				for (Musicsong string : a) {

					System.out.println(string.getTitle());
					Thread.sleep(2000);
				}

			} else if (i == 'B') {
				for (Musicsong string : a) {

					System.out.println(string.getTitle());
					Thread.sleep(2000);

				}

			} else if (i == 'C') {
				Scanner z1 = new Scanner(System.in);
				String c1 = z1.nextLine();
				for (Musicsong musicsong : a) {

					String check = musicsong.getTitle().toString();

					boolean bb = false;
					bb = check.indexOf(c1) != -1 ? true : false;
					if (bb) {
						System.out.println(musicsong.getTitle());

					}

				}

			}
			break;
		case (2):
			System.out.println("search a song");
			Scanner z1 = new Scanner(System.in);
			String c1 = z1.nextLine();
			for (Musicsong musicsong : a) {

				String check = musicsong.getTitle().toString();

				if (check.contains(c1)) {
					System.out.println(musicsong.getTitle());

				}

			}
			break;

		case (3):
			for (Musicsong musicsong : a) {
				System.out.println(musicsong.getTitle());
			}
			break;
		case (4):
			System.out.println("press A to add a song");
			System.out.println("press B to edit");
			System.out.println("press C to delete");
			Scanner aa = new Scanner(System.in);
			char a1 = aa.next().charAt(0);
			if (a1 == 'A') {
				Scanner sca = new Scanner(System.in);
				int g = sca.nextInt();
				String zz = sca.nextLine();
				String h = sca.nextLine();
				String ab = sca.nextLine();
				String lo = sca.nextLine();
				String des = sca.nextLine();
				a.add(new Musicsong(g, zz, h, ab, lo, des));
			}
			else if (a1 == 'B') {
				Scanner sca = new Scanner(System.in);
				int x = sca.nextInt();
				for (Musicsong musicsong : a) {

					if (x == 1) {

						Scanner scan = new Scanner(System.in);
						int g = scan.nextInt();
						String zz = scan.nextLine();
						String h = scan.nextLine();
						String ab = scan.nextLine();
						String lo = scan.nextLine();
						String des = scan.nextLine();
						musicsong.setAblum(ab);
						musicsong.setArtist(zz);
						musicsong.setDecrisption(des);
						musicsong.setLocation(lo);
						musicsong.setTitle(h);
						musicsong.setId(g);

					} else if (a1 == 'C') {
						System.out.println("enter 1 to delete all songs");
						Scanner scan = new Scanner(System.in);
						int ii = scan.nextInt();
						if (ii == 1) {
							musicsong.setTitle("    ");
							System.out.println(" songs deleted");
						
						}
					

				}
			}

		}
	}
}}
