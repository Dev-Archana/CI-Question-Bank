//platform : CodingBat -> Logic-1
//Question Name: cigarParty

public boolean cigarParty(int cigars, boolean isWeekend) {
		 if((isWeekend&& cigars>=40)||(cigars>=40 && cigars<=60))
		 return true;
		 else
		 return false;

}
