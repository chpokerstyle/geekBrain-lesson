package cource3.lesson4;

public class L4 {

    public static void main(String[] args) {
        Streams streams = new Streams();
        String say;


        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                streams.getStreamA();
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                streams.getStreamB();
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                streams.getStreamC();

            }
        }).start();
    }

}

class Streams {
    String say;
    public synchronized void getStreamA() {
        String say = "A";
        this.say = say;
        System.out.println(say);
        if (this.say.equals("A")) {
            try {
                wait();

            } catch (InterruptedException e) {
                System.out.println("АШИПКА!!!!" + e);
            }
        }
    }

    public synchronized void getStreamB() {
        String say = "B";
        this.say = say;
        System.out.println(say);
        if (this.say.equals("B")) {
            try {
                wait();

            } catch (InterruptedException e) {
                System.out.println("АШИПКА!!!!" + e);
            }
        }
    }

    public synchronized void getStreamC() {
        String say = "C";
        this.say = say;
        System.out.println(say);
        if (this.say.equals("C")) {
            try {
                wait();

            } catch (InterruptedException e) {
                System.out.println("АШИПКА!!!!" + e);
            }
        }
        notifyAll();
    }

}
