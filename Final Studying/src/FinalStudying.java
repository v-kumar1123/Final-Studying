import java.util.Scanner;

public class FinalStudying {
    public static void main(String args[]) {

        //System.out.println((int)(Math.random()*2)+24);
        String bruh="zruh";
        String yeet="aruh";

        System.out.println(bruh.compareTo(yeet));
        //int[]ge=new int[3];
//        ge[1]=1;
//        ge[0]=0;
//        ge[2]=2;
//
//        for(int w:ge) {
//         //   System.out.print(w+":");
//        }
        // System.out.println(o.toString());
       // System.out.printf("%7.1f",345.472);
//        try {
//            o.performer();
//        }catch (InterruptedException e) {}
        //System.out.println("bruh "+Math.abs(x));
    }
}
class oohThatsNice {
    private int yas=0;
    private int no=5;
    public static int statico=5;
    private boolean maybe=false;

    public oohThatsNice(int yas, int no) {
        this.yas=yas;
        this.no=no;
    }

    public void performer() throws InterruptedException {
        if(maybe) {
            try {
                Thread.sleep(1300);
            }catch (InterruptedException r){}
            System.out.println("I AM SO HAPPY YOU GOT IT!");
        }
        else {
            try {
                Thread.sleep(1300);
            }catch (InterruptedException r){}
            System.out.println("You're dead to me. Have a nice day.");
        }
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setMaybe(boolean maybe) {
        this.maybe=maybe;
    }

    public String toString() {
        return "This is yas: "+yas+" This is no: "+no+" This is maybe: "+maybe+".";
    }
}
