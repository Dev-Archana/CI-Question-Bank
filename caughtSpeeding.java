public int caughtSpeeding(int speed, boolean isBirthday) {
    if (isBirthday) {
        speed -= 5; 
    }
    if (speed <= 60) {
        return 0; 
    } else if (speed <= 80) {
        return 1; 
    } else {
        return 2; 
    }
}

/*
    platform : CodingBat -> Logic-1
    Question Name: caughtSpeeding
    Author : Archana
*/
