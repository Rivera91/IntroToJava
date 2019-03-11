public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //VARIABLES

        String driver;
        String driverF = "Hamish";
        String driverL = "Lopez";
        System.out.println(driverF.length());
        //driver = driver.toUpperCase();
        // System.out.println(driver);
        System.out.println(driverF + " " + driverL);

        double div = 5.0 / 2;
        System.out.println(div);

        double current = 17;
        double rate = 1.5;
        double future = current * rate;
        System.out.println(future);

        int approx = (int) future;
        System.out.println(approx);

//        String number = "17";
//        int approxNum = int(number);
//        System.out.println(approxNum);


        double maths = 97.5;
        double english = 98;
        double science = 83.5;

        double sum = maths + english + science;
        double average = sum / 3;

        System.out.println(average);


        String firstName = "Amy";
        String lastName = "Rivera";
        String fullName = firstName + " " + lastName;

        System.out.println("Hello, my name is " + fullName + ".");
        System.out.println("There are " + fullName.length() + " letters in my name.");

        double fahrenheit = 68.0;
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(celsius);


        //BOOLEANS

        boolean isCold = true;
        if (isCold) {
            System.out.println("It's cold outside");
        }


        boolean isRaining = true;
        if (isRaining) {
            System.out.println("Windshield wipers on.");
        } else {
            System.out.println("It's sunny outside");
        }

        boolean isLightGreen = false;
        boolean isLightYellow = false;

        if (isLightGreen) {
            System.out.println("Drive");
        } else if (isLightYellow) {
            System.out.println("Slow Down");
        } else {
            System.out.println("Stop!");
        }

        //TICKETS TO THE MUSEUM

        int ticketPrice = 10;
        int age = 27;
        boolean isStudent = false;

        if (age <= 15) {
            ticketPrice = 5;
        } else if (age > 60) {
            ticketPrice = 5;
        } else {
            ticketPrice = 10;
        }

        if (age <= 15 || age > 60 || isStudent) {
            ticketPrice = 5;
        }

        boolean action = true;
        boolean romance = true;
        boolean horror = false;
        boolean comedy = true;

        if (action && romance) {
            System.out.println("This movie includes action and romance");
            if (comedy || horror) {
                System.out.println("This move also contains comedy or horror");
            }
        } else {
            System.out.println("This move is a thriller");
        }

        //SWITCH STATEMENTS

        int passcode = 555;
        String coffeeType;

        switch (passcode) {
            case 555:
                coffeeType = "Esspresso";
                break;
            case 312:
                coffeeType = "Vanilla Latte";
                break;
            case 629:
                coffeeType = "Drip Coffee";
                break;
            default:
                coffeeType = "Unknown";
                break;
        }
        System.out.println(coffeeType);


        //example 2

        int month = 7;
        String monthString;

        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invaild Month";
        }
        System.out.println(monthString);


        //Lesson 2 Problem set

        boolean canSeePlayer = false; //true
        boolean playerPoweredUp = true;

        if (canSeePlayer) {
            if (!playerPoweredUp) {
                System.out.println("Attack");
            } else {
                System.out.println("Run Away!");
            }
        } else {
            System.out.println("Wander");
        }


        boolean isSnowing = false;
        boolean isRainingHard = true;
        double temperature = 60.0;

        if (isSnowing || isRainingHard || temperature <= 50) {
            System.out.println("Let's stay home");
        } else {
            System.out.println("Let's go out!");
        }

        double time = 4;
        String timeOfDay;

        if (time >= 5 && time < 12) {
            timeOfDay = "Morning";
        } else if (time >= 12 && time < 20) {
            timeOfDay = "Daytime";
        } else {
            timeOfDay = "Night";
        }
        System.out.println(timeOfDay);


        int dayOfTheWeek = 5;
        boolean holiday = false;

        if (dayOfTheWeek <= 5 && !holiday) {
            System.out.println("Wake up at 7:00");
        } else if (dayOfTheWeek > 5 && holiday) {
            System.out.println("Sleep in!");
        } else {
            System.out.println("It's a Holiday");
        }


        String schedule;
        int dayOfWeek = 3;

        switch (dayOfWeek) {
            case 1:
                schedule = "Gym in the morning";
                break;
            case 2:
                schedule = "Class after work";
                break;
            case 3:
                schedule = "Meetings all day";
                break;
            case 4:
                schedule = "Work from home";
                break;
            case 5:
                schedule = "Game night after work";
                break;
            default:
                schedule = "Free!";
        }
        System.out.println(schedule);

    }
}

        //INTRO TO FUNCTIONS

        //Function definition

class Functions{
    static boolean playButton = true;
    public static void playMusic(){
        if(playButton){
            System.out.println("Music is playing");
        }else {
            System.out.println("Music is paused");
        }
        playMusic();
    }

    public static String weatherInterpreter(int temperature){
        if(temperature > 30){
            System.out.println("It's hot outside!");
        }else if(temperature < 5){
            System.out.println("Brr, consider wearing a jacket");
        }else{
            System.out.println("Not too hot, not too cold");
        }

        int degrees= 32;
        return weatherInterpreter(15);
    }

    public void printPhoto(int height, int width, boolean inColor){
        System.out.println(width);
        System.out.println(height);
        if(inColor){
            System.out.println("Print in color");
        }else{
            System.out.println("Print in black and white");
        }
        printPhoto(30,40,true);
    }

    public int rollDice(){
        double randomNumber = Math.random();
        randomNumber = randomNumber * 6;
        randomNumber = randomNumber * 1;

        int randomInt = (int) randomNumber;

        return randomInt;

//        int roll1 = rollDice();
//        int roll2 = rollDice();
//
//        System.out.println("Roll 1: "+ roll1);
//        System.out.println("Roll 2: "+ roll2);
    }
}

