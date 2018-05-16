public class Question6 {
    int hour;
    int min;
    int sec;

    public static void main(String[] args){
        Question6 time = new Question6(23,59,59);
        System.out.println(time.hour + " " + time.min + " " + time.sec);
        time.increaseSec();
        System.out.println(time.hour + " " + time.min + " " + time.sec);

    }


    Question6 (int hour,int min, int sec){
        if (hour>24 || hour<0 || min>59 || min<0 || sec>59 || sec<0) {
            throw new IllegalArgumentException("Final speed can not be less than zero");
        }
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public void increaseSec(){
        this.sec++;
        if (sec==60){
            this.sec = 0;
            this.min++;
            if (min==60){
                min = 0;
                hour++;
                if (hour==24){
                    hour = 00;
                }
            }
        }
    }
}
