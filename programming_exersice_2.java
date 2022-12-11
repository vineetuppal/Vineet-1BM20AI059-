package Java_Programs_Assignment;

import java.util.Scanner;

class Clock {
    int hours;
    int minutes;
    int seconds;

    Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    Clock(int seconds) {
        this.minutes = seconds / 60;
        this.seconds = seconds % 60;
        this.hours = this.minutes / 60;
        this.minutes = this.minutes % 60;
    }

    void setClock(int seconds) {
        this.minutes = seconds / 60;
        this.seconds = seconds % 60;
        this.hours = this.minutes / 60;
        this.minutes = this.minutes % 60;
    }

    int getHours() {
        return this.hours;
    }

    int getMinutes() {
        return this.minutes;
    }

    int getSeconds() {
        return this.seconds;
    }

    void setHours(int hours) {
        this.hours = hours;
    }

    void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    void tick() {
        this.seconds += 1;
        if (this.seconds >= 60) {
            this.minutes += 1;
            {
                if (this.minutes >= 60) {
                    this.hours += 1;
                    if (this.hours >= 24)
                        this.hours -= 24;
                    this.minutes -= 60;
                }
            }
            this.seconds -= 60;
        }
    }

    void addClock(Clock time) {
        this.hours += time.hours;
        this.minutes += time.minutes;
        this.seconds += time.seconds;
        if (this.seconds >= 60) {
            this.minutes += 1;
            this.seconds -= 60;
        }
        if (this.minutes >= 60) {
            this.hours += this.minutes / 60;
            this.minutes %= 60;
        }
        if (this.hours >= 24)
            this.hours %= 24;
    }

    String to_String() {
        String timeInstance = "";
        if (this.hours < 10)
            timeInstance = timeInstance + 0 + this.hours;
        else
            timeInstance = timeInstance + this.hours;
        timeInstance = timeInstance + ":";
        if (this.minutes < 10)
            timeInstance = timeInstance + 0 + this.minutes;
        else
            timeInstance = timeInstance + this.minutes;
        timeInstance = timeInstance + ":";
        if (this.seconds < 10)
            timeInstance = timeInstance + 0 + this.seconds;
        else
            timeInstance = timeInstance + this.seconds;
        return timeInstance;
    }

    void tickdown() {
        this.seconds -= 1;
        if (seconds < 0) {
            minutes -= 1;
            {
                if (minutes < 0) {
                    hours -= 1;
                    if (hours < 0)
                        hours += 24;
                    minutes += 60;
                }
            }
            seconds += 60;
        }
    }

    Clock subtractClock(Clock diff) {
        Clock time = new Clock(hours, minutes, seconds);
        time.hours -= diff.hours;
        time.minutes -= diff.minutes;
        time.seconds -= diff.seconds;
        if (time.seconds < 0) {
            time.minutes -= 1;
            time.seconds += 60 % 60;
        }
        if (time.minutes < 0) {
            time.hours -= 1;
            time.minutes += 60 % 60;
        }
        if (time.hours < 0)
            time.hours -= 24 % 24;
        return time;
    }
}

public class programming_exersice_2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Seconds for First Clock: ");
        int firstClockSeconds = sc.nextInt();
        Clock firstClock = new Clock(firstClockSeconds);
        for (int i = 0; i < 10; i++) {
            firstClock.tick();
            System.out.print("Tick - " + (i + 1) + ": Time in First Clock -> ");
            System.out.println(firstClock.to_String());
        }
        System.out.println();

        System.out.print("Enter second clock time in the format hh, mm, ss: ");
        int secClockHours = sc.nextInt();
        int secClockMinutes = sc.nextInt();
        int secClockSeconds = sc.nextInt();
        Clock secondClock = new Clock(secClockHours, secClockMinutes, secClockSeconds);
        for (int i = 0; i < 10; i++) {
            secondClock.tick();
            System.out.print("Tick - " + (i + 1) + ": Time in Second Clock -> ");
            System.out.println(secondClock.to_String());
        }
        System.out.println();

        firstClock.addClock(secondClock);
        System.out.println("Time in First Clock-> " + firstClock.to_String());
        System.out.println("Time in Second Clock-> " + secondClock.to_String());

        Clock thirdClock = firstClock.subtractClock(secondClock);
        System.out.println("Difference of Times in First and Second clocks -> " + thirdClock.to_String());

        sc.close();

    }
}