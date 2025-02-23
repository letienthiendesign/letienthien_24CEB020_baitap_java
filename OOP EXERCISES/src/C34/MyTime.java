package C34;

public class MyTime {
     private int hour;
     private int minute;
     private int second;

    public MyTime() {
    }

    public MyTime(int hour,int minute,int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setTime(int hour,int minute,int second){
        if(hour>=0 && hour<24) this.hour = hour;
        if(minute>=0 && minute<60) this.minute = minute;
        if(second>=0 && second<60) this.second = second;
    }
    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public MyTime nextSecond(){
        second++;
        if(second == 60){
            second = 0;
        }
        return  this;
    }
    public MyTime nextMinute(){
        minute++;
        if(minute == 60){
            minute = 0;
        }
        return this;
    }
    public MyTime nextHour(){
        hour++;
        if(hour == 24){
            hour = 0;
        }return this;
    }
    public MyTime previousSecond(){
        second--;
        if(second <0){
            second = 59;
        }
        return  this;
    }
    public MyTime previousMinute(){
        minute--;
        if(minute <0){
            minute = 59;
        }
        return this;
    }
    public MyTime previousHour(){
        hour--;
        if(hour <0){
            hour = 23;
        }return this;
    }

    @Override
    public String toString() {
        return   String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
