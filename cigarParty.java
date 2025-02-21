public boolean cigarParty(int cigars, boolean isWeekend) {
    if (isWeekend) {
        return cigars >= 40; 
    } else { // It's not the weekend
        return cigars >= 40 && cigars <= 60;
    }
}

/*
    platform : CodingBat -> Logic-1
    Question Name: cigarParty
    Author : Archana
*/
