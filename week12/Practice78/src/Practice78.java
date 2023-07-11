import java.util.Scanner;

public class Practice78 {
    public static void main(String[] args) {
		// 여기에 필요한 코드를 작성하세요.
        Scanner sc = new Scanner(System.in);
        
        int num;
        num = sc.nextInt();
        Movie[] movie = new Movie[num];
        
        for (int i = 0; i < movie.length; i++) {
            Date d = new Date();
            movie[i] = new Movie(sc.next(), sc.next(), d);
            d.setYear(sc.nextInt());
            d.setMonth(sc.nextInt());
            d.setDay(sc.nextInt());
        }
        
        Movie min = new Movie();
        Date minD = min.getViewDay();
        minD.setYear(10000);
        minD.setMonth(13);
        minD.setDay(32);
        for (int i = 0; i < movie.length; i++) {
            Date x = movie[i].getViewDay();
            Date y = min.getViewDay();
            if (Date.compareDate(x, y) == -1)
                min = movie[i];
        }
        
        System.out.println("입력된 영화 정보입니다.");
        for (Movie m : movie) {
            System.out.print(m);
        }
        System.out.println("\n관람일이 가장 빠른 영화는 \"" + min.getTitle() + "\"입니다.");
        sc.close();
    }
}