import com.sun.security.jgss.GSSUtil;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {
            System.out.println("Итерация цикла" + i);
        }
        for (int l = 10; l >= 0; l--){
            System.out.println("Итерация цикла " + l);
        }
        for (int k = 0; k <= 17; k = k +2) {
        System.out.println("Итерация  цикла" + k);
    }
    for (int r = 10; r>= -10; r-- ){
        System.out.println("Итерация цикла" + r);
    }
    for (int y= 1904; y<=2096; y= y +4) {
        System.out.println( y + " год является високосным");
    }
    for (int q = 7; q <= 98; q = q + 7) {
        System.out.println(q);
    }
    for (int a = 1; a <= 512; a = a *2) {
        System.out.println(a);
    }

    int salary = 29000;
    int start = 0;
    for (int s = 0; s < 12; s++){
        start = start + start / 100;
        start = start + salary;
        System.out.println("Месяц " +s + " сумма накоплений равна " + start + " рублей");
    }

    int begin = 0;
    for ( int x = 1; x <=10; x++){
        begin = x *2;
        System.out.println(begin);
    }


}//
}//